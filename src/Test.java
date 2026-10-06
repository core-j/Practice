import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList al =new ArrayList();
        al.add(new Employee(10,"chaithu"));
        al.add(new Student(100,"chaithanya"));
        al.add(26);
        al.add("Nani");
        al.add(null);
        System.out.println(al);
        for(Object o:al){
            if(o instanceof Employee){
                Employee e =(Employee)o;
                System.out.println(e.eid+" "+e.ename);
            }
            if(o instanceof Student){
                Student s =(Student)o;
                System.out.println(s.sid+" "+s.sname);
            }
            if(o instanceof Integer){
                System.out.println(o);
            }
            if(o instanceof String){
                System.out.println(o);
            }
            if(o == null){
                System.out.println(o);
            }

        }

    }
}
