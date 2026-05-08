import java.io.*;
import java.net.*;

class Client1 {
    public static void main(String args[]) {
        int serverport = 6666;
        String address = "127.0.0.1";

        try {
            InetAddress ip = InetAddress.getByName(address);

            System.out.println("SERVER IP ADDRESS: " + address);
            System.out.println("SERVER PORT: " + serverport);

            Socket socket = new Socket(ip, serverport);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;

            while (true) {
                System.out.print("Enter message (type 'end' to stop): ");
                line = br.readLine();

                out.writeUTF(line);
                out.flush();

                // Trim to remove spaces
                if (line.trim().equalsIgnoreCase("end")) {
                    System.out.println("Client exiting...");
                    break;
                }

                String msg = in.readUTF();
                System.out.println("DATA RECEIVED FROM SERVER: " + msg);
            }

            // Close resources
            br.close();
            in.close();
            out.close();
            socket.close();

            System.out.println("CLIENT STOPPED");

        } catch (IOException e) {
            System.out.println("EXCEPTION OCCURRED: " + e.getMessage());
        }
    }
}