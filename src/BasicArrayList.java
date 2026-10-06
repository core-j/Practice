import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(10.6f);
        al.add(null);
        al.add(10);
        al.add("chaithu");
        al.add('V');
        al.add(null);
        System.out.println(al);
        System.out.println(al.toString());

    }
}
