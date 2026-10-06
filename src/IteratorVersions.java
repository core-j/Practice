import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorVersions {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("nani");
        al.add("balu");
        al.add("Rani");
        al.add("lalu");
        //Read the data by using Iterator: normal version
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            String s=(String)itr.next();
            System.out.println(s);
        }
        //Read the data by using Iterator: Generic version
        Iterator<String> itr1 = al.iterator();
        while(itr1.hasNext()){
            String s= itr1.next();
            System.out.println(s);
        }

        Iterator<String> itr2=al.iterator();
        while(itr2.hasNext()){
            String s= itr2.next();
            if(s.equals("balu")){
                itr2.remove();
            }
        }
        System.out.println(al);
    }
}
