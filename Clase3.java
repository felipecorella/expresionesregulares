package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clase3 {
    public static void main(String[] args) {

        Pattern pat = Pattern.compile("Java" + "Python" + "Go" + "Pascal" + "Pearl", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher("Java y Pearl");

        boolean matchFound = mat.find();

        if (matchFound) {
            System.out.println("Match found: " + mat);
        } else {
            System.out.println("Match not found");
        }
    }   
}
