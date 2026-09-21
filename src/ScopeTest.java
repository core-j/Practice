public class ScopeTest {
        static int calculate(int x) {

            int result = x * 2;

            return result;
        }

        public static void main(String[] args) {

            int number = 10;

            int answer = calculate(number);

            System.out.println(answer);
            //System.out.println(result);
        }
}
