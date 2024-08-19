import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            socket = new Socket("localhost", 15321);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("Hello, Server!");
            String serverResponse = in.readLine();
            System.out.println("Received from server: " + serverResponse);
            in.close();
            out.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: localhost");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
