import  java.util.*;

public  class  next_greater_element  {
	public  static  void  main(String[]  args)  {

		Scanner  sccnn  =  new  Scanner(System.in);

		int  t_cases  =  sccnn.nextInt();

		while  (t_cases  >  0)  {
			int  t_nums  =  sccnn.nextInt();
			int[]  A  =  new  int[t_nums];

			for  (int  num  =  0;  num  <  A.length;  num++)
				A[num]  =  sccnn.nextInt();

			nxt_lrg(A);

			t_cases--;
		}

	}

	public  static  void  nxt_lrg(int[]  A)  {

		int  t_nums  =  A.length;
                int[]  new_nxt_lrg  =  new  int[t_nums];
                Stack<Integer>  sttrr  =  new  Stack<Integer>();
                for  (int  num  =  t_nums  -  1;  num  >=  0;  --num)  {
                        while  (!sttrr.isEmpty()  &&  sttrr.peek()  <=  A[num])  sttrr.pop();

                        if  (!sttrr.isEmpty())  new_nxt_lrg[num]  =  sttrr.peek();
                        else  new_nxt_lrg[num]  =  -1;

                        sttrr.push(A[num]);
                }
		for(int  num=0;num<A.length;++num)  System.out.println(A[num]+","+new_nxt_lrg[num]);
	}
}