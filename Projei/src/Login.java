
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends Thread{

    
    @Override
    public void run() {
        
        Random random = new Random();
        while (true) {

           int m = random.nextInt(10) + 1;
           int x=0;
           
               while(x<m){ 
                   
           int g = random.nextInt(4) + 1;
           
                Insanlar.asansor_bek.get(0).add(g);
                x++;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("LoginThread hatası.");
            }

        }
        
    }

  
    
   
    
    
    
    
}
