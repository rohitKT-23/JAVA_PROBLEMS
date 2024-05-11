import java.util.*;
public class acending_book {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int total_testcases = scanner.nextInt();
        for(int i = 0; i < total_testcases; i++){
            int toatl_books = scanner.nextInt();
            int total_student = scanner.nextInt();
            int [] total_pages = new int[toatl_books];
            for(int j = 0; j < toatl_books; j++){
                total_pages[j] = scanner.nextInt(); 
            }
            System.out.println(allocation_of_books(total_pages, total_student));
        }
        
    }
    public static int allocation_of_books(int[] total_pages, int total_student){
        int lw = 0;
        int hig = 0;
        for(int i = 0; i < total_pages.length; i++){
            hig += total_pages[i];
        }
        int ans = 0;
        while(lw <= hig){
            int md = (lw + hig)/2;
            if(ISPOSSIBLE(total_pages, total_student, md)){
                ans = md;
                hig = md - 1;
            }
            else{
                lw = md + 1;
            }
        }
        return ans;
    }
    public static boolean ISPOSSIBLE(int[] total_pages, int total_student, int md){
        int student_required = 1;
        int page_read = 0;
        int i = 0;
        while(i < total_pages.length){
            if(page_read + total_pages[i] <= md){
                page_read += total_pages[i];
                i++;
            }
            else{
                student_required++;
                page_read = 0;
            }
            if(student_required > total_student){
                return false;
            }
        }
        return true; 
    }
}