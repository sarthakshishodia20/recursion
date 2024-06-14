public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: There is only one way to climb 0 or 1 step
        } else {
            // For n steps, you can either take 1 step followed by climbing (n-1) steps
            // or take 2 steps followed by climbing (n-2) steps
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 2; // Change the value of n as needed
        int ways = climbStairs(n);
        System.out.println("Number of distinct ways to climb " + n + " steps: " + ways);
    }
}
