import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket=new ServerSocket(15321);
            System.out.println("Server is listening on port 75321");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String clientMessage = in.readLine();
            System.out.println("Received from client: " + clientMessage);
            out.println("Message received: " + clientMessage);
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
