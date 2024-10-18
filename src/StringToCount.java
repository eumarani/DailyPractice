import java.util.Arrays;

public class StringToCount {
    public static String stringcount(String s){
        if(s.isEmpty() || s.length()==0){
            return "";
        }
        StringBuilder result=new StringBuilder();
        int count=0;

        for(int i=1;i<s.length();i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count=1;

            }
        }
        result.append(s.charAt(s.length()-1)).append(count);
       return result.toString();

    }
    public static void main(String[] args) {
        String s="aabbcdas";
       String res=stringcount(s);




    }
}
