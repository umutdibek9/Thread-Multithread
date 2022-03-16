
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;




public class Insanlar{
    
    static Object anahtar = new Object();
    
    public static ArrayList<ArrayList<Integer>> asansor_bek = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> insanlar_kat = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> birincikat_cikmak = new ArrayList<Integer>();
    public static ArrayList<Integer> ikicikat_cikmak = new ArrayList<Integer>();
    public static ArrayList<Integer> ucuncukat_cikmak = new ArrayList<Integer>();
    public static ArrayList<Integer> dorduncukat_cikmak = new ArrayList<Integer>();
 
    
    
    public void olustur() {
        for(int i=0; i < 5; i++) {
       asansor_bek.add(new ArrayList());
       insanlar_kat.add(new ArrayList());
    }
    }
    
    
    
}
