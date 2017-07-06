package type;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        
        StuffCollection<String> stuff = new StuffCollection<>();
        
        stuff.addDirector("jrhgfhsb");
        stuff.add("A", "dagvhak");
        
        String director = stuff.getDirector();
        
    }
    
    
    public static <T> T test(String text, T t){ //неопределенный тип данных <T> 
        T o = null;
        try {
             o = (T) t.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {        }
        
     return o;  
    }
    
}
