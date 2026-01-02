class NodeT { int data; NodeT left,right; NodeT(int d){data=d;} }
public class BinaryTreeTraversal {
    NodeT root;
    void inorder(NodeT n){ if(n!=null){ inorder(n.left); System.out.print(n.data+" "); inorder(n.right);} }
    public static void main(String[] args){
        BinaryTreeTraversal bt=new BinaryTreeTraversal();
        bt.root=new NodeT(1);
        bt.root.left=new NodeT(2);
        bt.root.right=new NodeT(3);
        bt.inorder(bt.root);
    }
}
