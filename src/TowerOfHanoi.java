public class TowerOfHanoi {
    static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solve(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        solve(n, 'A', 'C', 'B');
        System.out.println("Total moves = " + (int)(Math.pow(2, n) - 1));
    }
}
