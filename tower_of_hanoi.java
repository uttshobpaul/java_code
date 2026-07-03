public class tower_of_hanoi {

    public static void towerofhanoi(int n, String source, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return;
        }

        towerofhanoi(n - 1, source, dest, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
        towerofhanoi(n - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");
    }
}