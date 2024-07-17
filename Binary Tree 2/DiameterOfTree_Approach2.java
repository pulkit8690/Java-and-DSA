public class DiameterOfTree_Approach2 {
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
        int diameter;
        int height;
        public Info(int diameter, int height)
        {
            this.diameter=diameter;
            this.height=height;
        }
    }
    public static Info Diameter(Node root) //O(n)
    {
        if(root==null)
        {
            return new Info(0, 0);
        }
        Info leftInfo =Diameter(root.left);
        Info rightInfo= Diameter(root.right);
        int dia = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+rightInfo.height+1);
        int ht= Math.max(leftInfo.height, rightInfo.height)+1;
        return new Info(dia, ht);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right= new Node(7);
        System.out.println("Diameter of Tree is: "+Diameter(root).diameter);
}
}
