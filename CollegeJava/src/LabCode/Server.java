import java.io.*;
import java.net.*;

class Server {
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

                if (line.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("LINE RECEIVED FROM CLIENT: " + line);
                System.out.println("SENDING LINE BACK....");

                out.writeUTF(line);
                out.flush();
            }

            // Close resources
            in.close();
            out.close();
            socket.close();
            ss.close();

        } catch (IOException e) {
            System.out.println("EXCEPTION OCCURRED...");
            e.printStackTrace();
        }
    }
}