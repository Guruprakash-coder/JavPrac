public class eight {
    public static void main(String[] args) {
        patter(4);

    }

    static void patter(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            int spaces = n - c;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
