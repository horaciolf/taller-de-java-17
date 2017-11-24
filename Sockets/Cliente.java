import java.io.*;
import java.net.*;

public class Cliente{

 public static void main(String[] args) {
    String host = "localhost";
    int port = 2221;
    try(Socket socket = new Socket (host, port);
    PrintWriter print = new PrintWriter(socket.getOutputStream(),true);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    )
    
    {
        String line = "Quiero algo!!";
        print.println(line);
        System.out.println(in.readLine());
        
    } catch (IOException ex) {
        System.out.println(ex.toString());
    }

    
}

}