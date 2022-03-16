
import java.util.logging.Level;
import java.util.logging.Logger;


public class Projei {

    
    public static void main(String[] args) {
       
        Insanlar insanlar = new Insanlar();
        insanlar.olustur();
        Login login=new Login();
        login.start();
        Asansor asansor = new Asansor();
        asansor.start();
        LogOutThread logout = new LogOutThread();
        logout.start();
        Asansor2 asansor2 = new Asansor2();
        asansor2.start();
        Asansor3 asansor3 = new Asansor3();
        asansor3.start();
        Asansor4 asansor4 = new Asansor4();
        asansor4.start();
        Asansor5 asansor5 = new Asansor5();
        asansor5.start();
        Kontrol kontrol = new Kontrol();
        kontrol.start();
        int kat=0;
        while(true){
            System.out.println("Zemin Kat Insan Sayisi : " + Insanlar.asansor_bek.get(0).size());
            System.out.print("Cikmak istenen katlar : ");
            for(int i = 0 ; i<Insanlar.asansor_bek.get(0).size();i++){
                System.out.print(Insanlar.asansor_bek.get(0).get(i) + " ");
            }
            System.out.println();
            System.out.println("Asansor 1 Cikis Yapanlar: "+Asansor.cikis);
            System.out.println("Asansor 2 Cikis Yapanlar: "+Asansor2.cikis);
            System.out.println("Asansor 3 Cikis Yapanlar: "+Asansor3.cikis);
            System.out.println("Asansor 4 Cikis Yapanlar: "+Asansor4.cikis);
            System.out.println("Asansor 5 Cikis Yapanlar: "+Asansor5.cikis);
            System.out.println("1.Kat Insan Sayisi : "+Insanlar.insanlar_kat.get(1).size());
            System.out.println("2.Kat Insan Sayisi : "+Insanlar.insanlar_kat.get(2).size());
            System.out.println("3.Kat Insan Sayisi : "+Insanlar.insanlar_kat.get(3).size());
            System.out.println("4.Kat Insan Sayisi : "+Insanlar.insanlar_kat.get(4).size());
            System.out.println("1.Kat Bekleyen Sayisi :" + Insanlar.birincikat_cikmak.size());
            System.out.println("2.Kat Bekleyen Sayisi :" + Insanlar.ikicikat_cikmak.size());
            System.out.println("3.Kat Bekleyen Sayisi :" + Insanlar.ucuncukat_cikmak.size());
            System.out.println("4.Kat Bekleyen Sayisi :" + Insanlar.dorduncukat_cikmak.size());
            System.out.println("Asansor 1 Durum "+Asansor.durum);
            System.out.println("Asansor 1 Icındeki insan sayisi "+Asansor.count_inside);
            System.out.println("Asansor 1 Kat : "+Asansor.floor);
            System.out.println("Asansor 1 Kapasite : "+Asansor.kapasite);
            System.out.println("Asansor 2 Durum "+Asansor2.durum);
            System.out.println("Asansor 2 Icındeki insan sayisi "+Asansor2.count_inside);
            System.out.println("Asansor 2 Kat : "+Asansor2.floor);
            System.out.println("Asansor 2 Kapasite : "+Asansor2.kapasite);
            System.out.println("Asansor 3 Durum "+Asansor3.durum);
            System.out.println("Asansor 3 Icındeki insan sayisi "+Asansor3.count_inside);
            System.out.println("Asansor 3 Kat : "+Asansor3.floor);
            System.out.println("Asansor 3 Kapasite : "+Asansor3.kapasite);
            System.out.println("Asansor 4 Durum "+Asansor4.durum);
            System.out.println("Asansor 4 Icındeki insan sayisi "+Asansor4.count_inside);
            System.out.println("Asansor 4 Kat : "+Asansor4.floor);
            System.out.println("Asansor 4 Kapasite : "+Asansor4.kapasite);
            System.out.println("Asansor 5 Durum "+Asansor5.durum);
            System.out.println("Asansor 5 Icındeki insan sayisi "+Asansor5.count_inside);
            System.out.println("Asansor 5 Kat : "+Asansor5.floor);
            System.out.println("Asansor 5 Kapasite : "+Asansor5.kapasite);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Projei.class.getName()).log(Level.SEVERE, null, ex);
            }
{
            
        }
        }
        
        
    }
    
}
