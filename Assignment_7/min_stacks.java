import  java.util.*;
public  class  min_stacks  {
        public  static  void  main  (String  args[])  {
                Scanner  sc=new  Scanner(System.in);
                int  t_nums=sc.nextInt();
                String[]  A=  new  String[t_nums];
                Stack<Integer>  ssttkk=new  Stack<>();
                Stack<Integer>  miiiniii=new  Stack<>();
                for(int  num=0;num<t_nums;num++){
                        A[num]=sc.next();
                }
                int  mn=Integer.MAX_VALUE;
                for  (int  num  =  0;  num  <  t_nums;  ++num)  {
                        if  (A[num].equals("push"))  {
                                int  x  =  sc.nextInt();
                                ssttkk.push(x);
                                mn  =  Math.min(mn,  x);
                                miiiniii.push(mn);
                        }  else  if  (A[num].equals("getMin"))  {
                                System.out.print(miiiniii.peek()  +  "  ");
                        }  else  if  (A[num].equals("pop"))  {
                                ssttkk.pop();
                                miiiniii.pop();
                                if(miiiniii.empty()){
                                        mn=Integer.MAX_VALUE;
                                }else  mn=miiiniii.peek();
                        }  else  if  (A[num].equals("top"))  {
                                System.out.print(ssttkk.peek()  +  "  ");
                        }
                }

        }
}