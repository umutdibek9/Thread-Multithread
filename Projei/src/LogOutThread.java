
import java.util.Random;


public class LogOutThread extends Thread{

    @Override
    public void run() {
        
        Random random = new Random();
        while (true) {
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("ExitThread hatası.");
            }
            int musteriSayisi = random.nextInt(5) + 1;
                
            for (int i = 0; i < musteriSayisi ; i++) {
                
            int bulunanKat = random.nextInt(4) + 1;
                if(Insanlar.insanlar_kat.get(bulunanKat).size()==0) break;
                if(bulunanKat==1){
                    Insanlar.birincikat_cikmak.add(bulunanKat);
                }
                else if(bulunanKat==2){
                    Insanlar.ikicikat_cikmak.add(bulunanKat);
                }
                else if(bulunanKat==3){
                    Insanlar.ucuncukat_cikmak.add(bulunanKat);
                }
                else if(bulunanKat==4){
                    Insanlar.dorduncukat_cikmak.add(bulunanKat);
                }
            }
            
        
        
    }
    
    
    
    
    
    }
}
