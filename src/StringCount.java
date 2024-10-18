import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void count(String s){
        Map<Character,Integer> freqMap=new HashMap<Character,Integer>();
        for(char c:s.toCharArray()){
            if(freqMap.containsKey(c)){
                freqMap.put(c,freqMap.getOrDefault(c,0)+1);
            }else{
                freqMap.put(c,1);
            }
        }
        freqMap.forEach((key, value) -> System.out.print(key + "" + value));

    }

    public static void main(String[] args) {
       String s="aabbads";
       count(s);

    }
}
