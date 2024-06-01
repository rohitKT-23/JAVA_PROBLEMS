import  java.util.*;
public  class  find_greatest_element  {
        public  static  void  main(String  args[])  {
                Scanner  ssccnn=new  Scanner(System.in);
                int  t_nums =ssccnn.nextInt();
                int[]  A=  new  int[t_nums ];
                for(int  num=0;num<t_nums ;num++)  A[num]=ssccnn.nextInt();
                printng(A);
        }
        public  static  void  printng(int[]  A){
                int  t_nums   =  A.length;
                int[]  new_greater  =  new  int[t_nums ];
                Stack<Integer>  ssttrr  =  new  Stack<Integer>();
                for  (int  num  =  2*t_nums   -  1;  num  >=  0;  --num)  {
                        while  (!ssttrr.isEmpty()  &&  ssttrr.peek()  <=  A[num%t_nums ])  ssttrr.pop();

                        if  (!ssttrr.isEmpty())  new_greater[num%t_nums ]  =  ssttrr.peek();
                        else  new_greater[num%t_nums ]  =  -1;

                        ssttrr.push(A[num%t_nums ]);
                }
                for(int  num=0;num<t_nums ;num++)  System.out.print(new_greater[num]+"  ");
        }
}