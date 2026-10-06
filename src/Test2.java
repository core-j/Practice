import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(111, "java", "Remo"));
        books.add(new Book(222, "c", "sita"));
        books.add(new Book(333, "python", "ram"));

        //Read the data by using Iterator: normal version
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()) {
            Book b = itr.next();
            if (b.id == 111)
                itr.remove();
            if(b.name.equals("c"))
                itr.remove();

        }
        for(Book b:books)
        System.out.println(b.id+" "+b.author+" "+b.name);
    }

}
