import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args){
        //ArrayList al =new ArrayList();
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.addFirst(5);
        al.addLast(40);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.remove(2));
        System.out.println(al);
        ArrayList<Integer> al1 =new ArrayList<Integer>();
        al1.addAll(al);
        System.out.println(al1);
        System.out.println(al1.contains(30));
        System.out.println(al1.containsAll(al));
        System.out.println(al1.equals(al));


    }
}
