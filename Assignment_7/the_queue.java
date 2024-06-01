import  java.util.*;
public  class  the_queue  {
        public  static  void  main  (String  args[])  {
                Scanner  sc=new  Scanner(System.in);
                int  t_cases=sc.nextInt();
                while(t_cases-->0){
                        int  t_num=sc.nextInt();
                        boolean  ans=true;
                        int  digit=0;
                        while(t_num-->0){
                                int  nums=sc.nextInt();
                                if(nums==1)  ++digit;
                                else{
                                        if(digit>0)  --digit;
                                        else  ans=false;
                                }
                        }
                        if(ans==true) { 
                        System.out.println("Valid");
                        }
                        else  
                        System.out.println("Invalid");
                }
        }
}