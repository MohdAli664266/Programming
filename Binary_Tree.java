import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree 
{
    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree
    {
        static int index = -1;
        public static Node buildTree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void levelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode == null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }else
                {
                    q.add(null);
                }
            }else
            {
                System.out.print(currNode.data +" ");
                if(currNode.left !=null)
                {
                    q.add(currNode.left);
                }

                if(currNode.right !=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        // System.out.println("Preorder is wriiten below");
        // preOrder(root);
        // System.out.println("Inorder is written below");
        // inOrder(root);
        // System.out.println("Postorder is written below");
        // postOrder(root);
        System.out.println("Leverorder is written below");
        levelOrder(root);
    }
}
