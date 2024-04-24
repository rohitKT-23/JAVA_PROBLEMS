public class q6_zero {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1;

        while (num <= n) {
            int count = 1;

            while (count <= num) {
                if (count == 1 || count == num) {
                    System.out.print(num + "\t");
                } else {
                    System.out.print("0\t");
                }
                count++;
            }

            System.out.println();
            num++;
        }
    }
}
