import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenListStream {
    public static void main(String[] args){

        /*List<Integer> l=new ArrayList<Integer>();
        l.add(20);
        l.add(30);
        l.add(40);*/
        ArrayList<Integer> l= new ArrayList<Integer>();
        l.add(20);
        l.add(31);
        l.add(40);
        System.out.println(l);
        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);

    }
}
