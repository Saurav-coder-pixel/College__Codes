import java.io.*;
import java.net.*;

class Server1 {
    public static void main(String args[]) {
        int port = 6666;

        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("WAITING FOR CLIENT...");

            Socket socket = ss.accept();
            System.out.println("GOT A CLIENT");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String line;

            while (true) {
                line = in.readUTF();

                // Trim to remove spaces
                if (line.trim().equalsIgnoreCase("end")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("LINE RECEIVED FROM CLIENT: " + line);

                out.writeUTF("Echo: " + line);
                out.flush();
            }

            // Close resources
            in.close();
            out.close();
            socket.close();
            ss.close();

            System.out.println("SERVER STOPPED");

        } catch (IOException e) {
            System.out.println("EXCEPTION OCCURRED: " + e.getMessage());
        }
    }
}