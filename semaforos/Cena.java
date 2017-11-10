import java.util.concurrent.Semaphore;


public class Cena implements Runnable
{
    String s;
    Semaphore sillas;
    Semaphore tenedores;
    Semaphore cuchillos;

    public Cena(String s, Semaphore sillas, Semaphore tenedores, Semaphore cuchillos)
    {
        this.s = s;
        this.sillas = sillas;
        this.tenedores = tenedores;
        this.cuchillos = cuchillos;
        
    }

    public void run()
    {
        
        try{
            sillas.acquire();
            tenedores.acquire();
            cuchillos.acquire();
            System.out.println("El Chinito dice: " + s);
            long h =(long)(Math.random() * 10000);
            Thread.sleep(h);
             cuchillos.release();
             tenedores.release();
            sillas.release();
            
           
        } catch (InterruptedException ex){
        }
    }
public static void main(String[] args)
{
    Semaphore sem = new Semaphore(6);
     Semaphore sem1 = new Semaphore(5);
      Semaphore sem2 = new Semaphore(4);

    Thread t1 = new Thread(new Cena("Soy chinito 1 y estoy comiendo:", sem, sem1, sem2));
    Thread t2 = new Thread(new Cena("Soy chinito 2 y estoy comiendo:", sem, sem1, sem2));
    Thread t3 = new Thread(new Cena("Soy chinito 3 y estoy comiendo:", sem, sem1, sem2));
    Thread t4 = new Thread(new Cena("Soy chinito 4 y estoy comiendo:", sem, sem1, sem2));
    Thread t5 = new Thread(new Cena("Soy chinito 5 y estoy comiendo:", sem, sem1, sem2));
    Thread t6 = new Thread(new Cena("Soy chinito 6 y estoy comiendo:", sem, sem1, sem2));
    Thread t7 = new Thread(new Cena("Soy chinito 7 y estoy comiendo:", sem, sem1, sem2));
    Thread t8 = new Thread(new Cena("Soy chinito 8 y estoy comiendo:", sem, sem1, sem2));
    Thread t9 = new Thread(new Cena("Soy chinito 9 y estoy comiendo:", sem, sem1, sem2));
    Thread t10 = new Thread(new Cena("Soy chinito 10 y estoy comiendo:", sem, sem1, sem2));
    Thread t11 = new Thread(new Cena("Soy chinito 11 y estoy comiendo:", sem, sem1, sem2));
    Thread t12 = new Thread(new Cena("Soy chinito 12 y estoy comiendo:", sem, sem1, sem2));
    Thread t13 = new Thread(new Cena("Soy chinito 13 y estoy comiendo:", sem, sem1, sem2));
    Thread t14 = new Thread(new Cena("Soy chinito 14 y estoy comiendo:", sem, sem1, sem2));
    Thread t15 = new Thread(new Cena("Soy chinito 15 y estoy comiendo:", sem, sem1, sem2));
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    t9.start();
    t10.start();
    t11.start();
    t12.start();
    t13.start();
    t14.start();
    t15.start();
}
}