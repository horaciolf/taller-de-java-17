import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;



public class Factorial extends Thread{

int num;
CyclicBarrier barrera;
int resultado;



public int getResultado(){
    return resultado;
}

public Factorial(int num, CyclicBarrier barrera){

    this.num = num;
    this.barrera = barrera;
   

}

    public void run(){

        
        try {

            factorial(num);
            barrera.await();
            System.out.println("Todo corre");
            
        } catch (InterruptedException ex) {
            
        } catch (BrokenBarrierException ex){

        }
        

    }
    int factorial (int n){
        int accum = 1;
        for (int i = n; i > 0; i--){

            accum *= i;
        }
        return accum;
    }
}