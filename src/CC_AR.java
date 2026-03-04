public class CC_AR {

    public static void countDown(int n) {
        if (n < 0) return;

        System.out.print(n + " ");
        countDown(n - 1);
    }

    public static int pow(int base, int exp) {
        if (exp == 0) return 1;

        return base * pow(base, exp - 1);
    }

}