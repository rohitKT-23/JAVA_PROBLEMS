import java.util.*;
public class sum_of_two_linked_list {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int lst_1=sc.nextInt();
        int lst_2=sc.nextInt();
        int[] num1=new int[lst_1];
        int[] num2=new int[lst_2];
        for(int numm=0;numm<lst_1;++numm) 
        num1[numm]=sc.nextInt();
        for(int numm=0;numm<lst_2;++numm) 
        num2[numm]=sc.nextInt();
        LinkedList<Integer> ans= new LinkedList<Integer>();
        int numm=lst_1-1, j=lst_2-1;
        int cry=0;
        while(numm>=0 && j>=0){
            int suumm=num1[numm]+num2[j]+cry;
            int vallue=suumm%10;
            cry = suumm/10;
            ans.addFirst(vallue);
            --numm;
            --j;
        }
        while(numm>=0){
            int suumm=num1[numm]+cry;
            int vallue=suumm%10;
            cry=suumm/10;
            ans.addFirst(vallue);
            --numm;
        }
        while(numm>=0){
            int suumm=num1[numm]+cry;
            int vallue=suumm%10;
            cry=suumm/10;
            ans.addFirst(vallue);
            --j;
        }
        if(cry>0) ans.addFirst(cry);

        for(Integer num: ans) System.out.print(num+" ");
    }
}