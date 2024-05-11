
import java.util.*;
public class magical_park {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n_char1 = scanner.nextInt();
        int m_char2 = scanner.nextInt();
        int k_char3 = scanner.nextInt();
        int s_char4 = scanner.nextInt();
        char[][] arrays = new char[n_char1][m_char2];
        for(int row=0; row<n_char1; row++){
            for(int col=0; col<m_char2; col++){
                arrays[row][col] = scanner.next().charAt(0);
            }
        }
        int result = isSUCCESS(arrays, s_char4, k_char3);
        if(result == -1 || k_char3 > s_char4){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
            System.out.println(result);
        }
    }
    public static int isSUCCESS(char[][] arrays, int s_char4, int k_char3){
        for(int row=0; row<arrays.length; row++){
            for(int col=0; col<arrays[0].length; col++){
                if(s_char4 <= k_char3){
                    return -1;
                }
                if(arrays[row][col] == '.'){
                    if(col==arrays[col].length-1){
                        s_char4 -= 2;
                    }
                    else{
                        s_char4 -= 3;
                    }
                }
                else if(arrays[row][col] == '*'){
                    s_char4 += 4;
                }
                else if(arrays[row][col] == '#'){
                    break;
                }
            }
        }
        return s_char4;
    }
}