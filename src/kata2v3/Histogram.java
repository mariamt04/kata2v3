package kata2v3;

import java.util.HashMap;

public class Histogram<T> {
    
    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }
    
    public T[] getVector(){
        return vector;
    }
    
    public HashMap <T, Integer> getHistogram(){ 
       HashMap<T, Integer> listo = new HashMap<>();
       
       for(T Key : vector){
            if(listo.containsKey(Key)){
                 listo.put(Key, listo.get(Key)+1);
            } else {
                listo.put(Key,1);
            }
        }
       
       return listo;
    }    
    

}