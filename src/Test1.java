import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Employee(10, "chaithu"));
        al.add(new Student(100, "chaithanya"));
        System.out.println(al.get(1));
        Student s = (Student)al.get(1);
        System.out.println(s.sid+" "+s.sname);
        Object o =al.get(0);
        if(o instanceof Employee){
            Employee e1 =(Employee)o;
            System.out.println(e1.eid+" "+e1.ename);
        }
        if(o instanceof Student){
            Student s1 =(Student)o;
            System.out.println(s1.sid+" "+s1.sname);
        }
        ArrayList<Employee> al1 = new ArrayList<Employee>();
        al1.add(new Employee(12, "Nani"));
        al1.add(new Employee(14, "chai"));
        for(Employee e:al1){
            System.out.println(e.eid+" "+e.ename);
        }
        Employee e=al1.get(1);
    }
}
