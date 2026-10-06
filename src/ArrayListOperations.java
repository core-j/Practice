import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
       Employee e1=new Employee(111,"Nani");
       Employee e2=new Employee(111,"Ramu");
       Employee e3=new Employee(111,"Bunny");
       Employee e4=new Employee(111,"Rani");

        ArrayList<Employee> a1 = new ArrayList<Employee>();
        a1.add(e1);
        a1.add(e2);

        ArrayList<Employee> a2 = new ArrayList<Employee>();
        a2.addAll(a1);
        a2.add(e3);
        a2.add(e4);

      System.out.println(a2.contains(e1));
        System.out.println(a2.containsAll(a1));
        a2.remove(e1);
        System.out.println(a2.contains(e1));
        System.out.println(a2.containsAll(a1));
        a2.removeAll(a1); //all a1 objects are removed
        a2.retainAll(a1); //remove all a2 objects and keep a1 objects

        for(Employee e:a2) {
            System.out.println(e.eid+" "+e.ename);
        }
    }
}
