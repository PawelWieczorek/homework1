import java.util.Random;
import java.lang.Math;

/**
 * Created by pwieczorek on 31.08.16.
 */
public class HomeWork1 {

    public static void main(String[] args) {

        int randomInt;
        Random generator = new Random();

        randomInt = generator.nextInt(100)+1; //zmiana przedziału z 0-99 na 1-100

        double randomDouble = (double)randomInt;
        int rounded =  (int)Math.round(randomDouble);

        if(randomDouble == rounded){
            System.out.println("Wartości są równe");
        }
    }
}
