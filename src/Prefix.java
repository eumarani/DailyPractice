import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prefix {
    public static void start(String[] input,String p){
       List<String> word= Arrays.asList(input).stream()
                .filter(a->a.startsWith(p))
                .toList();
       System.out.println(word);


    }
    public static void main(String[] args){
        String[] input={"apple","applet","bread","apper"};
        String p="app";
        start(input,p);
    }
}
