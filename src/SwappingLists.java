import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwappingLists {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("nani");
        a.add("balu");
        a.add("Rani");
        a.add("lalu");
        System.out.println(a);

        System.out.println("Before Swapping:"+a);
        Collections.swap(a,1,3);
        System.out.println("After Swapping:"+a);
        ArrayList<String> a1 = new ArrayList<String>(a.subList(1,3));
        System.out.println("After Swapping:"+a1);

    }

}
