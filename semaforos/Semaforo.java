import java.util.concurrent.Semaphore;


public class Semaforo implements Runnable
{
    String s;
    Semaphore sm;

    public Semaforo(String s, Semaphore sm)
    {
        this.s = s;
        this.sm = sm;
    }

    public void run()
    {
        
        try{
            sm.acquire();
            System.out.println("El hilo dice: " + s);
            Thread.sleep(3000);
            sm.release();
        } catch (InterruptedException ex){
        }
    }
public static void main(String[] args)
{
    Semaphore sem = new Semaphore(2);

    Thread t1 = new Thread(new Semaforo("hilo 1", sem));
    Thread t2 = new Thread(new Semaforo("hilo 2", sem));
    Thread t3 = new Thread(new Semaforo("hilo 3", sem));
    Thread t4 = new Thread(new Semaforo("hilo 4", sem));
    Thread t5 = new Thread(new Semaforo("hilo 5", sem));
    Thread t6 = new Thread(new Semaforo("hilo 6", sem));
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
}
}