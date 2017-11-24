import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;




public class Server{
    public static void main (String[] args)
    {
        
        try {
            int port = 2221;
            ServerSocket server = new ServerSocket(port);
            Socket cliente = server.accept();

            PrintWriter out = new PrintWriter(cliente.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            String line = "no estes molestando Edgardo!!";
            while((line = in.readLine())!= null){
                System.out.println(line);
                out.println("servidor repite" + line);
            }

            cliente.close();
            server.close();

        } catch (IOException ex) {
            
        }

       
    }
}