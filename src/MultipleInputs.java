import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
       // int number=scan.nextInt();
       // System.out.println("You entered: "+number);
        int N = scan.nextInt(); // how many numbers
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            numbers.add(scan.nextInt());
        }
        System.out.println("Numbers: " + numbers);
        scan.close();
    }
}
