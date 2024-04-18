import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(5);
        // list.add(2);
        // list.add(8);
        // list.add(1);

        // Collections.sort(list);

        // System.out.println(list);

        // ArrayList<Titulo> list = new ArrayList<>();

        // list.add(new Titulo("Java"));
        // list.add(new Titulo("C"));
        // list.add(new Titulo("JavaScript"));
        // list.add(new Titulo("PHP"));

        // Collections.sort(list);

        // for (Titulo t : list) {
        //     System.out.println(t.getNome());
        // }
        List<String> list;

        list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");

        System.out.println(list);

        list = new LinkedList<>();
        list.add("Java");
        list.add("C");

        System.out.println(list);
    }
}
