import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorOperations {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ramu");
        al.add("balu");
        al.add("chintu");

        ListIterator<String> litr=al.listIterator();
        litr.add("dolo");
        while(litr.hasNext()){
            String s=litr.next();
            if(s.equals("chintu"))
                litr.remove();
            if(s.equals("balu"))
                litr.set("bablu");
        }
        System.out.println(al);
    }
}
