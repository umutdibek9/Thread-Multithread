
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kontrol extends Thread {


    @Override
    public void run() {

            while(true){
                int bekleyen_insanlar=0;
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                bekleyen_insanlar = bekleyen_insanlar + Insanlar.asansor_bek.get(0).size();
                bekleyen_insanlar = bekleyen_insanlar + Insanlar.birincikat_cikmak.size();
                bekleyen_insanlar = bekleyen_insanlar + Insanlar.ikicikat_cikmak.size();
                bekleyen_insanlar = bekleyen_insanlar + Insanlar.ucuncukat_cikmak.size();
                bekleyen_insanlar = bekleyen_insanlar + Insanlar.dorduncukat_cikmak.size();
            if(bekleyen_insanlar<20){
                if(Asansor2.floor==0){
                    Asansor2.durum=false;
                }
                else if(Asansor3.floor==0){
                    Asansor3.durum=false;
                }
                else if(Asansor4.floor==0){
                    Asansor4.durum=false;
                }
                else if(Asansor5.floor==0){
                    Asansor5.durum=false;
                }
            }
            else if( bekleyen_insanlar<40){
                if(Asansor2.floor==0){
                    Asansor2.durum=true;
                }
                else if(Asansor3.floor==0){
                    Asansor3.durum=false;
                }
                else if(Asansor4.floor==0){
                    Asansor4.durum=false;
                }
                else if(Asansor5.floor==0){
                    Asansor5.durum=false;
                }
            }
            else if(bekleyen_insanlar<60){
                if(Asansor2.floor==0){
                    Asansor2.durum=true;
                }
                else if(Asansor3.floor==0){
                    Asansor3.durum=true;
                }
                else if(Asansor4.floor==0){
                    Asansor4.durum=false;
                }
                else if(Asansor5.floor==0){
                    Asansor5.durum=false;
                }
            }
            else if(bekleyen_insanlar<80){
                if(Asansor2.floor==0){
                    Asansor2.durum=true;
                }
                else if(Asansor3.floor==0){
                    Asansor3.durum=true;
                }
                else if(Asansor4.floor==0){
                    Asansor4.durum=true;
                }
                else if(Asansor5.floor==0){
                    Asansor5.durum=false;
                }
            }
            else if(bekleyen_insanlar>80){
                if(Asansor2.floor==0){
                    Asansor2.durum=true;
                }
                else if(Asansor3.floor==0){
                    Asansor3.durum=true;
                }
                else if(Asansor4.floor==0){
                    Asansor4.durum=true;
                }
                else if(Asansor5.floor==0){
                    Asansor5.durum=true;
                }
            }
            
            bekleyen_insanlar=0;
            
        }
    }

}
