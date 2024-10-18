
import java.util.ArrayList;
import java.util.List;

public class MinDistance {
    public static int minDistanceBetweenWords(String str, String word1, String word2) {
        String[] words = str.split(" ");

        List<Integer> indice1 = new ArrayList<>();
        List<Integer> indice2 = new ArrayList<>();


        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                indice1.add(i);
               // System.out.println(indice1);
            } else if (words[i].equals(word2)) {
                indice2.add(i);
                //System.out.println(indice2);
            }
        }


        if (indice1.isEmpty() || indice2.isEmpty()) {
            return -1;
        }


        int minDistance = Integer.MAX_VALUE;
        for (int index1 : indice1) {
            for (int index2 : indice2) {
                minDistance = Math.min(minDistance, Math.abs(index1-index2));
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        String str = "the quick the brown quick brown is the frog";
        String word1 = "the";
        String word2 = "frog";

        int distance = minDistanceBetweenWords(str, word1, word2);
        System.out.println("Min distance between word1 and word2: " + distance);
    }
}
