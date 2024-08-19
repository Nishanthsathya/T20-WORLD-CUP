import java.sql.*;

public class jinnn {
    private static Connection con = null;
    private static Statement stmt = null;
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "livewire");
            System.out.println("Connection established: " + con);
            createTable();
            insertData(1, "raju isha");
            insertData(2, "lily putt");
            readData();
            updateData(1, "nishanth sathya");
            readData();
            deleteData(2);
            readData();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createTable() {
        try {
            String createTableSQL = "CREATE TABLE yyy (id NUMBER PRIMARY KEY, name VARCHAR2(100))";
            stmt = con.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("Table yyy created successfully.");
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertData(int id, String name) {
        try {
            String insertSQL = "INSERT INTO yyy (id, name) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully: ID=" + id + ", Name=" + name);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void readData() {
        try {
            String selectSQL = "SELECT * FROM yyy";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("Reading data:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID=" + id + ", Name=" + name);
            }
        } catch (SQLException e) {
            System.err.println("Error reading data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void updateData(int id, String name) {
        try {
            String updateSQL = "UPDATE yyy SET name = ? WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(updateSQL);
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Data updated successfully: ID=" + id + ", Name=" + name);
        } catch (SQLException e) {
            System.err.println("Error updating data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void deleteData(int id) {
        try {
            String deleteSQL = "DELETE FROM yyy WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(deleteSQL);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Data deleted successfully: ID=" + id);
        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


