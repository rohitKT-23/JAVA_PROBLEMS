import java.util.*;

public class replace_with_sum_BST { // Change class name to replace_with_sum_BST
    private class Node {
        int DTA;
        Node lft;
        Node rht;

        Node(int DTA, Node lft, Node rht) {
            this.DTA = DTA;
            this.lft = lft;
            this.rht = rht;
        }
    }

    private Node root;
    private int size;

    public replace_with_sum_BST() {
        this.root = null;
        this.size = 0;
    }

    public void jordd(int DTA) {
        if (this.is_khaalii()) {
            this.root = new Node(DTA, null, null);
            this.size++;
        } else {
            this.jordd(this.root, DTA);
        }
    }

    private void jordd(Node NOD, int DTA) {
        if (DTA > NOD.DTA) {
            if (NOD.rht != null) {
                this.jordd(NOD.rht, DTA);
            } else {
                this.size++;
                NOD.rht = new Node(DTA, null, null);
            }
        } else if (DTA < NOD.DTA) {
            if (NOD.lft != null) {
                this.jordd(NOD.lft, DTA);
            } else {
                this.size++;
                NOD.lft = new Node(DTA, null, null);
            }
        } else {
            // nothing to do
        }
    }

    public void rmv(int DTA) {
        this.root = this.rmv(this.root, DTA);
    }

    private Node rmv(Node NOD, int DTA) {
        if (NOD == null) {
            return null;
        }

        if (DTA > NOD.DTA) {
            NOD.rht = this.rmv(NOD.rht, DTA);
            return NOD;
        } else if (DTA < NOD.DTA) {
            NOD.lft = this.rmv(NOD.lft, DTA);
            return NOD;
        } else {
            // found the element
            if (NOD.lft == null && NOD.rht == null) {
                this.size--;
                return null;
            } else if (NOD.lft == null) {
                this.size--;
                return NOD.rht;
            } else if (NOD.rht == null) {
                this.size--;
                return NOD.lft;
            } else {
                // both children
                int lmax = this.max(NOD.lft);
                NOD.DTA = lmax;
                NOD.lft = this.rmv(NOD.lft, lmax);

                return NOD;
            }
        }
    }

    public int size() {
        return this.size;
    }

    public boolean is_khaalii() {
        return this.size() == 0;
    }

    public void SHOW() {
        System.out.println(this);
    }

    public int max() {
        return this.max(this.root);
    }

    private int max(Node NOD) {
        int rv = NOD.DTA;

        if (NOD.rht != null) {
            rv = this.max(NOD.rht);
        }

        return rv;
    }

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node NOD) {
        if (NOD == null) {
            return "";
        }

        String retVal = "";

        if (NOD.lft != null) {
            retVal += NOD.lft.DTA + " => ";
        } else {
            retVal += "END" + " => ";
        }

        retVal += NOD.DTA;

        if (NOD.rht != null) {
            retVal += " <= " + NOD.rht.DTA;
        } else {
            retVal += " <= " + "END";
        }

        retVal += "\n";

        retVal += this.toString(NOD.lft);
        retVal += this.toString(NOD.rht);

        return retVal;
    }

    private int sum = 0;

    public void replace() {
        this.func(this.root);
    }

    private void func(Node root) {
        if (root == null) return;
        func(root.rht);
        sum += root.DTA;
        root.DTA = sum - root.DTA;
        func(root.lft);
    }

    public static void main(String[] args) {
        replace_with_sum_BST b1 = new replace_with_sum_BST(); // Change to replace_with_sum_BST
        Scanner scnner = new Scanner(System.in);
        int n = scnner.nextInt();
        while (n != 0) {
            int m = scnner.nextInt();
            b1.jordd(m);
            --n;
        }
        b1.replace();
        System.out.println(b1);
    }
}