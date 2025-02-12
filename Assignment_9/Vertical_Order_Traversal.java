
import java.util.*;

public class Vertical_Order_Traversal {
    static class Node {
        int DTA;
        Node lft;
        Node rht;
        Node(int val) {
            DTA = val;
            lft = null;
            rht = null;
        }
    }

    static Scanner scnn = new Scanner(System.in);
    static Node bld_treee() {
        int DTA = scnn.nextInt();
        Node ROT = new Node(DTA);

        Queue<Node> queu = new LinkedList<>();
        queu.add(ROT);

        while (!queu.isEmpty()) {
            Node tmp = queu.poll();
            int lft = scnn.nextInt();
            int rht = scnn.nextInt();

            if (lft != -1) {
                tmp.lft = new Node(lft);
                queu.add(tmp.lft);
            }
            if (rht != -1) {
                tmp.rht = new Node(rht);
                queu.add(tmp.rht);
            }
        }
        return ROT;
    }

    public static void main(String[] args) {
        int lvl_sabke_nikilinge = scnn.nextInt();
        Node ROT = bld_treee();

        Map<Integer, ArrayList<Integer>> has_MAPPP = new TreeMap<>();
        verti_odr(ROT, has_MAPPP, 0);

        for(int ITM : has_MAPPP.keySet()){
            for(int val : has_MAPPP.get(ITM)){
                System.out.print(val + " ");
            }
        }
    }
    static void verti_odr(Node ROT, Map<Integer, ArrayList<Integer>> has_MAPPP, int duriii) {
        if (ROT == null)
            return;

        if(!has_MAPPP.containsKey(duriii)) {
            has_MAPPP.put(duriii, new ArrayList<>());
        }
        has_MAPPP.get(duriii).add(ROT.DTA);

        verti_odr(ROT.lft, has_MAPPP, duriii - 1);
        verti_odr(ROT.rht, has_MAPPP, duriii + 1);
    }
}