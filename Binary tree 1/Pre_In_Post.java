import java.util.*;
public class Pre_In_Post {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info{
        Node node;
        int num;
        Info(Node node, int num)
        {
            this.node=node;
            this.num=num;
        }
    }
    public static void pre_in_post(Node root)
    {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        Stack<Info> s =new Stack<>();
        s.push(new Info(root, 1));
        if(root==null)
        {
            return;
        }
        while(!s.isEmpty())
        {
            Info curr = s.pop();
            if(curr.num==1)
            {
                pre.add(curr.node.data);
                curr.num++;
                s.push(curr);
                if(curr.node.left!=null)
                {
                    s.push(new Info(curr.node.left, 1));
                }
            }
            else if(curr.num==2)
            {
                in.add(curr.node.data);
                curr.num++;
                s.push(curr);
                if(curr.node.right!=null)
                {
                    s.push(new Info(curr.node.right,1));
                }
            }
            else{
                post.add(curr.node.data);
            }
        }
        System.out.println("Pre Order: "+pre);
        System.out.println("In Order: "+in);
        System.out.println("Post Order: "+post);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        pre_in_post(root);
    }
}
