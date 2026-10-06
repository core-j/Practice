import java.util.ArrayList;

public class ArrayListConstructor {

    public static void main(String[] args) {
        //Approach-1 : By Constructor Only one collection into another collection
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
        al2.add(100);
        al2.add(200);
        System.out.println(al2);

        //Approach-2 : addAll() to add more than one collection into another collection
        ArrayList<Integer> b1 = new ArrayList<Integer>();
        b1.add(1000);
        b1.add(2000);
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        b2.add(1001);
        b2.add(2001);
        ArrayList<Integer> b3 = new ArrayList<Integer>();
        b3.add(1002);
        b3.add(2004);
        b3.addAll(b1);
        b3.addAll(b2);
        System.out.println(b3);

    }

}
