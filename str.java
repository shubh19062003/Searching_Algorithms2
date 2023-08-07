import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class str {
    public static void main(String[] args) {
         // Step 1: Create the outer List (List<List<String>>)
        List<List<String>> arrayList2D = new ArrayList<>();

        // Step 2: Create the inner Lists (List<String>) and add them to the outer List
        List<String> row1 = new ArrayList<>();
        row1.add("phone");
        row1.add("blue");
        row1.add("pixel");

        List<String> row2 = new ArrayList<>();
        row2.add("computer");
        row2.add("silver");
        row2.add("lenovo");
        
        List<String> row3 = new ArrayList<>();
        row3.add("phone");
        row3.add("gold");
        row3.add("iphone");

        arrayList2D.add(row1);
        arrayList2D.add(row2);
        arrayList2D.add(row3);

        System.out.println(arrayList2D.size());

        System.out.println(arrayList2D.get(0).get(1));
        System.out.println(arrayList2D.get(1).get(1));
        System.out.println(arrayList2D.get(2).get(1));



        

    }

}
