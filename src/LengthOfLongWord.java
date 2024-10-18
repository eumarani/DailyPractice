import java.util.Arrays;
import java.util.stream.IntStream;

public class LengthOfLongWord {
    public static int lengthOfLong(String[] dict,String word){
       int length= Arrays.asList(dict).stream().filter(a -> a.contains(word))
                .mapToInt(String::length).max().orElse(0);

        return length;

    }
    public static void main(String[] args){
        String[] dict={"CODGE","ODG","LODGES","SODG","dodge","mODJ","LODGESSSS"};
String word="ODG";
System.out.println(lengthOfLong(dict,word));
    }
}
