// public class DLL5 {
//     public static class Node {
//         int data;
//         Node next;
//         Node back;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.back = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data) {
//         Node newNode=new Node(data);
//         size++;
//         if(head==null)
//         {
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         newNode.back=null;
//         head.back=newNode;
//         head=newNode;
//     }
//     public void addAti(int data, int index)
//     {
//         if(index==0)
//         {
//             addFirst(data);
//             return;
//         }
//         Node temp=head;
//         int cnt=0;
//         while(temp!=null)
//         {
//             cnt++;
//             if(cnt==index)
//             {
//                 break;
//             }
//             temp=temp.next;
//         }
        
//         Node prev=temp.back;

//     }
// }
