import  java.util.*;

class  nd  {
        public  int  data;
        public  nd  nxt;

        nd(int  d)  {
                data  =  d;
                nxt  =  null;
        }
}

class  Solution  {
        boolean  flyd_ccle_rm(nd  hd)  {
                if  (hd  ==  null  ||  hd.nxt  ==  null)
                        return  false;

                nd  slw  =  hd;
                nd  fst  =  hd;

                
                while  (fst  !=  null  &&  fst.nxt  !=  null)  {
                        slw  =  slw.nxt;
                        fst  =  fst.nxt.nxt;

                        
                        if  (slw  ==  fst)  {
                                
                                rm_cycl(hd,  slw);
                                return  true;
                        }
                }

                
                return  false;
        }

        void  rm_cycl(nd  hd,  nd  intersection)  {
                nd  p_1  =  hd;
                nd  p_2  =  intersection;

                while  (p_1  !=  p_2)  {
                        p_1  =  p_1.nxt;
                        p_2  =  p_2.nxt;
                }

                
                while  (p_2.nxt  !=  p_1)  {
                        p_2  =  p_2.nxt;
                }

                p_2.nxt  =  null;
        }
}

public  class  Main  {
        public  static  nd  buildCycleList()  {
                Scanner  scn  =  new  Scanner(System.in);
                Hashtable<Integer,  nd>  hash  =  new  Hashtable<>();
                int  rkt  =  scn.nextInt();
                if  (rkt  ==  -1)  {
                        return  null;
                }
                nd  hd  =  new  nd(rkt);
                hash.put(rkt,  hd);
                nd  curr  =  hd;
                while  (rkt  !=  -1)  {
                        rkt  =  scn.nextInt();
                        if  (rkt  ==  -1)
                                break;
                        if  (hash.containsKey(rkt))  {
                                curr.nxt  =  hash.get(rkt);
                                return  hd;
                        }
                        nd  n  =  new  nd(rkt);
                        curr.nxt  =  n;
                        curr  =  n;
                        hash.put(rkt,  n);
                }
                curr.nxt  =  null;
                return  hd;
        }

        public  static  void  printLinkedList(nd  hd)  {
                HashSet<Integer>  s  =  new  HashSet<>();
                while  (hd  !=  null)  {
                        if  (s.contains(hd.data))  {
                                System.out.println("\nCycle  detected  at  "  +  hd.data);
                                return;
                        }
                        System.out.print(hd.data  +  "  ");
                        s.add(hd.data);
                        hd  =  hd.nxt;
                }
        }

        public  static  void  main(String[]  args)  {
                nd  hd  =  buildCycleList();
                Solution  s  =  new  Solution();

                boolean  cyclePresent  =  s.flyd_ccle_rm(hd);
                if  (cyclePresent)  {
                        System.out.println("Cycle  was  present");
                }  else  {
                        System.out.println("No  cycle");
                }

                System.out.print("Linked  List  -  ");
                printLinkedList(hd);
        }
}