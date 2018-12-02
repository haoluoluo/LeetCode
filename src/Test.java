import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
         Random rad = new Random();

         for(int i=0;i<100;i++) {
             String result = rad.nextInt(1000000) + "";

             System.out.println(result);
         }
    }
}
