// Server.java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 5500;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
                 
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    out.println("Server received: " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}