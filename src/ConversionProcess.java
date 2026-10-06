import java.util.ArrayList;
import java.util.Arrays;

public class ConversionProcess {
    public static void main(String[] args){
        //conversion of arrays to collection
        String[] s={"aaa", "bbb", "ccc"};
        ArrayList<String> a=new ArrayList<String>(Arrays.asList(s));
        a.add("nani");
        a.add("balu");
        System.out.println(a);

        //conversion of generic collection to arrays
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("nani");
        a1.add("balu");
        String[] s1=new String[a1.size()];
        a1.toArray(s1);
        for(String ss:s1) {
            System.out.println(ss);
        }

        //conversion of normal collection to arrays
        ArrayList a2=new ArrayList();
        a2.add("nani");
        a2.add(10);
        Object[] o=a2.toArray();
        for(Object oo:o) {
            System.out.println(oo);
        }

    }
}
