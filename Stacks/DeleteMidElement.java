import java.util.Stack;

public class DeleteMidElement {
    public static void solve(Stack<Integer> s,int count,int size)
    {
        if(count==size/2)
        {
            s.pop();
            return;
        }
        int num= s.peek();
        s.pop();
        solve(s,count+1,size);
        s.push(num);
    }
    public static void delMid(Stack<Integer> s)
    {
        int size= s.size();
        int count=0;
        solve(s, count, size);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        delMid(s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
