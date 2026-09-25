import java.util.Scanner;
public class DecisionMakingTask {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (num % 2 != 0) System.out.println("Weird");
        else if (num >= 2 && num <= 5) System.out.println("Not Weird");
        else if (num >= 6 && num <= 20) System.out.println("Weird");
        else System.out.println("Not Weird");
        scanner.close();
    }
}
