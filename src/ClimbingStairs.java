
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;   // Base cases: 1 step → 1 way, 2 steps → 2 ways

        int a = 1, b = 2;       // Ways to climb 1 and 2 steps
        for (int i = 3; i <= n; i++) {
            int c = a + b;      // Current ways = sum of previous two
            a = b;              // Shift forward
            b = c;
        }
        return b;               // Final result
    }

    public static void main(String[] args) {
        int n = 5;  // Example input
        System.out.println("Ways to climb " + n + " stairs: " + climbStairs(n));
    }
}
