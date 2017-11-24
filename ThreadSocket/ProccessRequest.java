import java.io.*;
import java.net.*;

public class ProccessRequest implements Runnable{

    Socket cliente;
    StringBuffer mensaje;
    
    public ProccessRequest (Socket cliente)
    {
        this.cliente = cliente;

    }

    public void run(){
        int c;

        mensaje = new StringBuffer();
        try {

            BufferedInputStream bis = new BufferedInputStream (cliente.getInputStream());
            InputStreamReader isr = new InputStreamReader (bis);
            BufferedOutputStream bos = new BufferedOutputStream (cliente.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter (bos);

            while((c = isr.read())!= (char)13){
                mensaje.append((char)c);
            }
            System.err.println("el cliente dice:" + mensaje);
            osw.write("Request accepted" + (char)13);
            osw.flush();
            cliente.close();

        } catch (IOException ex) {
            //TODO: handle exception
        }
       

    }
}