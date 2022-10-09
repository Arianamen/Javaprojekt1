import java.util.Random;
public class Fist{

    public static int dataScore = 0;
    
    public static int datorVal(){
        int min = 1;
        int max = 3;
        Random slump = new Random();
        int datorVal = slump.nextInt(max + 1 - min ) + min ;
            
        return datorVal;
    }
  
}

      

