import java.util.Scanner;

public class form_minimum_number_from_given_sequence{
    public static void main(String[] args) {
        Scanner scnn = new Scanner(System.in);
        int t_nums = scnn.nextInt();
        scnn.nextLine(); 
        String[] ptrns = scnn.nextLine().split(" ");

        for (String ptrn : ptrns) {
            System.out.println(minimumNumber(ptrn));
        }
    }
    public static String minimumNumber(String ptrn) {
        StringBuilder ans = new StringBuilder();
        int t_nums = ptrn.length() + 1;
        int[] A = new int[t_nums];

        for (int num = 0; num < t_nums; num++) {
            A[num] = num + 1;
        }

        for (int num = 0; num < t_nums - 1; num++) {
            if (ptrn.charAt(num) == 'D') {
                int st = num;
                while (num < t_nums - 1 && ptrn.charAt(num) == 'D') {
                    num++;
                }
                rev(A, st, num);
            }
        }

        for (int num : A) {
            ans.append(num);
        }

        return ans.toString();
    }

    private static void rev(int[] A, int st, int ed) {
        while (st < ed) {
            int tmo = A[st];
            A[st] = A[ed];
            A[ed] = tmo;
            st++;
            ed--;
        }
    }

    
}