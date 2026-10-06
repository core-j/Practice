import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationVersions {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("nani");
        v.add("balu");
        v.add("Rani");
        v.add("lalu");
        //Read the data by using Enumeration: normal version
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            String s=(String)e.nextElement();
            System.out.println(s);
        }
       //Read the data by using Enumeration: Generic version
        Enumeration e1 = v.elements();
        while(e1.hasMoreElements()){
            String s= String.valueOf(e1.nextElement());
            System.out.println(s);
        }
    }


}
