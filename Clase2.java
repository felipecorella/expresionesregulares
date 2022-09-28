package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clase2 {
    public static void main(String[] args) {

    
     Pattern pattern = Pattern.compile("Hola mundo", Pattern.CASE_INSENSITIVE);
        Matcher mat = pattern.matcher("HOLA mundo");

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
