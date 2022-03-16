
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Asansor4 extends Thread{
    
    public int yon = 1;                     
    public static boolean durum=false ;        
    public static int kapasite = 10;      
    public static int floor = 0;
    public static int count_inside = 0;
    public static ArrayList<Integer> insan_sayisi = new ArrayList<>();
    public static ArrayList<Integer> gidilecek = new ArrayList<>();
    public static int cikis=0;
    @Override
    public void run() {
       
        
        
        while (true) {
            
                try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Asansor.class.getName()).log(Level.SEVERE, null, ex);
                    }
           synchronized(Insanlar.anahtar){
            count_inside=0;
            cikis=0;
                        kapasite=10;
            if(durum==true){
                if(floor==0){
            synchronized(Insanlar.anahtar){         
                    if(Insanlar.asansor_bek.get(0).size()>10){
                        for(int i=0;i<10;i++){
                            gidilecek.add(Insanlar.asansor_bek.get(0).get(i));
                            kapasite--;
                            count_inside++;
                        }
                    }
                    

                        for(int i=0;i<5;i++){
                            for(int j=0;j<Insanlar.asansor_bek.get(i).size();j++){
                                Insanlar.asansor_bek.get(i).remove(j);
                                j--;
                            }
                        }

                        yon=1;
                        floor=floor+yon;
                        
            }
            }
                else if(floor==1){
             synchronized(Insanlar.anahtar){    
                    for(int i=0;i<gidilecek.size();i++){
                        if(gidilecek.get(i)==1){
                            Insanlar.insanlar_kat.get(1).add(gidilecek.get(i));
                            gidilecek.remove(i);
                            kapasite++;
                            count_inside--;
                            i--;
                        }
                    }
                    int temp=10-count_inside;
                    for(int i=0;i<temp;i++){
                        if(Insanlar.birincikat_cikmak.size()==0) break;
                         if(Insanlar.insanlar_kat.get(1).size()>0){
                        Insanlar.insanlar_kat.get(1).remove(i);
                        }
                        kapasite--;
                        cikis++;
                        Insanlar.birincikat_cikmak.remove(i);
                        i--;
                        count_inside++;
                    }
                    floor=floor+yon;
             }    
            
                }
                else if( floor==2){
              synchronized(Insanlar.anahtar){      
                     for(int i=0;i<gidilecek.size();i++){
                        if(gidilecek.get(i)==2){
                            Insanlar.insanlar_kat.get(2).add(gidilecek.get(i));
                            gidilecek.remove(i);
                            kapasite++;
                            count_inside--;
                            i--;
                        }
                    }
                     int temp=10-count_inside;
                    for(int i=0;i<temp;i++){
                       if(Insanlar.ikicikat_cikmak.size()==0) break;
                        if(Insanlar.insanlar_kat.get(1).size()>0){
                        Insanlar.insanlar_kat.get(1).remove(i);
                        }
                        kapasite--;
                        Insanlar.ikicikat_cikmak.remove(i);
                        i--;
                        cikis++;
                        count_inside++;
                    }
                     floor=floor+yon;
              }      
            }
                
                else if(floor==3){ 
               synchronized(Insanlar.anahtar){     
                    for(int i=0;i<gidilecek.size();i++){
                        
                        if(gidilecek.get(i)==3){
                            Insanlar.insanlar_kat.get(3).add(gidilecek.get(i));
                            gidilecek.remove(i);
                            kapasite++;
                            count_inside--;
                            i--;
                        }
                    }
                    int temp=10-count_inside;
                    for(int i=0;i<temp;i++){
                        if(Insanlar.ucuncukat_cikmak.size()==0) break;
                        if(Insanlar.insanlar_kat.get(1).size()>0){
                        Insanlar.insanlar_kat.get(1).remove(i);
                        }
                        kapasite--;
                        cikis++;
                        Insanlar.ucuncukat_cikmak.remove(i);
                        i--;
                        count_inside++;
                    }
                     floor=floor+yon;
               }     
            
                }
                else if(floor==4){
                synchronized(Insanlar.anahtar){    
                     for(int i=0;i<gidilecek.size();i++){
                        if(gidilecek.get(i)==4){
                            Insanlar.insanlar_kat.get(4).add(gidilecek.get(i));
                            gidilecek.remove(i);
                            kapasite++;
                            count_inside--;
                            i--;
                        }
                    }
                     int temp=10-count_inside;
                    for(int i=0;i<temp;i++){
                        if(Insanlar.dorduncukat_cikmak.size()==0) break;
                         if(Insanlar.insanlar_kat.get(1).size()>0){
                        Insanlar.insanlar_kat.get(1).remove(i);
                        }
                        kapasite--;
                        Insanlar.dorduncukat_cikmak.remove(i);
                        i--;
                        cikis++;
                        count_inside++;
                    }
                     yon=yon*-1;
                     floor=floor+yon;
                }  
            }  
            }
            else{
                count_inside=0;
                        kapasite=10;
                        cikis=0;
            
            } 

        }       
           
        }
                
        
    }
}

    
    

