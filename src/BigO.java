public class BigO {

    int [] data = new int[100];
    int ops;

    // O(n)
    public BigO() {
        System.out.println("Data size: " + data.length);

        for (int i = 0; i < data.length; i++) {
            ops++;
        }
        System.out.printf("O(n): %d operations \n", ops);

        ops = 0;
    // O(n^2)
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                ops++;
            }
        }
        System.out.printf("O(n^2): %d operations \n", ops);

        ops = 0;
    // O(n log)
        int len = data.length;
        while (len > 0) {
            len = len / 2;
            ops++;
        }
        System.out.printf("O(n log): %d operations \n", ops);


        ops = 0;
    // O(n log n)
        for (int i = 0; i < data.length; i++) {     // n times
            int inner = data.length;
            while (inner > 1) {                     // log n times
                inner /= 2;
                ops++;
            }
        }
        System.out.printf("O(n log n): %d operations%n", ops);


    }

}
