import java.io.*;
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }
}

public class slz {
    public static void main(String[] args) {
        try {
            Student student = new Student("Alice", 20);
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Student object has been deserialized");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
