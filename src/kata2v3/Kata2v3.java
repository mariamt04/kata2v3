package kata2v3;

import java.util.HashMap;

public class Kata2v3 {

    public static void main(String[] args) {
        
        //Double[] vector = {1.5,2.6,3.1,4.2,1.5,5.8,3.1,6.2,2.3,9.0};
        String[] vector = {"maria", "maria", "marta", "ari", "alejandro"};
        
        Histogram listo = new Histogram(vector);
        
        HashMap <Object, Integer> histogram = listo.getHistogram();
        
        for(Object Key : histogram.keySet()){
            System.out.println(Key + " -> " +  histogram.get(Key));
        }
    }
}
