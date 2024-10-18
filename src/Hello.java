
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you");
        list.add("u");
        System.out.println(list);
        List<String> asList=list.stream()
                .filter(a->a.startsWith("H"))
                .toList();
        System.out.println(asList);


    }
}
