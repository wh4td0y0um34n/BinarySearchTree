
import java.io.PrintStream;

class BinarySearchTree {

    class Node {

        String key;
        Node left, right;

        public Node(String item) {
            key = item;
            left = right = null;

        }

    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    BinarySearchTree(String key) {
        root = insertJajan(root, key, "asd");
    }

    void insert(String key, String arah) {
        root = insertJajan(root, key, arah);
    }

    Node insertJajan(Node root, String key, String arah) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (arah.toLowerCase() == "kiri") {
            root.left = insertJajan(root.left, key, arah);
        } else if (arah.toLowerCase() == "kanan") {
            root.right = insertJajan(root.right, key, arah);
        }
        return root;
    }

    void inorder() {
        inorderKutil(root);
    }

    void inorderKutil(Node root) {
        if (root != null) {
            inorderKutil(root.left);
            System.out.println(root.key);
            inorderKutil(root.right);
        }
    }

//    public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
//        if (root.right != null) {
//            root.right.key.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
//        }
//        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(root.key.toString()).append("\n");
//        if (root.left != null) {
//            root.left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
//        }
//        return sb;
//    }
//
//    @Override
//    public String toString() {
//        return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
//    }
    public void print() {
        print("", root, false);
    }

    public void print(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + n.key);
            print(prefix + (isLeft ? "|   " : "    "), n.left, true);
            print(prefix + (isLeft ? "|   " : "    "), n.right, false);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree p = new BinarySearchTree("indonesia");
        p.insert("Jawa", "kiri");
        p.insert("Sumatra", "kanan");
//        p.inorder();
        p.print();
         p.inorder();
        
//        System.out.println("=========");
//        System.out.println("=========");
//        System.out.println("=========");
//        System.out.println("=========");
//        System.out.println("=========");
//        
//        BinarySearchTree o = new BinarySearchTree(p.root.left);
//        o.insert("pecel", "kiri");
//        o.insert("pecel", "kanan");
//        o.insert("pecel", "kiri");
//        o.print();
    }
}
