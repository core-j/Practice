import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorVersions {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("nani");
        al.add("balu");
        al.add("Rani");
        al.add("lalu");
        //Read the data by using ListIterator: normal version
        ListIterator litr = al.listIterator();
        while(litr.hasNext()){
            String s=(String)litr.next();
            System.out.println(s);
        }
        while(litr.hasPrevious()){
            String s=(String)litr.previous();
            System.out.println(s);
        }
        //Read the data by using ListIterator: Generic version
        ListIterator<String> litr1 = al.listIterator();
        while(litr1.hasNext()){
            String s= litr1.next();
            System.out.println(s);
        }
        while(litr.hasPrevious()){
            String s=litr1.previous();
            System.out.println(s);
        }
    }
}
