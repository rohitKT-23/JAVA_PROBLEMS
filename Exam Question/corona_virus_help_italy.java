import  java.util.*;

public  class  corona_virus_help_italy  {

        public  static  void  main(String  args[])  {

                Scanner  scan=  new  Scanner(System.in);

                int  total_patients=scan.nextInt();

                int  total_doctors=scan.nextInt();

                int  doctors[]=new  int[total_doctors];

                for(int  initialization=0;initialization<total_doctors;initialization++){

                        doctors[initialization]=scan.nextInt();

                }

                System.out.print(corona_operation(doctors,total_patients));

                scan.close();

        }

        public  static  int  corona_operation(int  doctors[],int  total_patients){

                int  lowest=0;

                int  highest=(int)(Math.pow(10,6));

                int  answer=0;

                while(lowest<=highest){

                        int  midest=lowest+(highest-lowest)/2;

                        if(possiblitiy(doctors,total_patients,midest)){

                                answer=midest;

                                highest=midest-1;

                        }

                        else{

                                lowest=midest+1;


                        }

                }

                return  answer;

        }

        public  static  boolean  possiblitiy(int  doctors[],int  total_patients,int  midest){

                int  patients=0;

                int  total=0;

                int  initialization=0;

                while(initialization<doctors.length){

                        patients=doctors[initialization];

                        int  j=2;

                        while(patients<=midest){

                                total++;

                                patients+=(doctors[initialization]*j);

                                j++;

                        }

                        if(total>=total_patients){

                                return  true;

                        }

                        initialization++;

                }

                return  false;

        }

}