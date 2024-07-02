public class ImplementationUsingArray {
    public static class Stack {
        int top;
        int arr[] = new int[1000];

    Stack()
	{
		top = -1;
	}

        // Function to push an integer into the stack.
        void push(int a) {
            // Your code here
            if (top < 999) {
                top++;
                arr[top] = a;
            } else {
                System.out.println("Stack Overflow");
            }

        }

        // Function to remove an item from top of the stack.
        int pop() {
            // Your code here
            if (top == -1) {
                return -1;
            } else {
                int topElement = arr[top];
                top--;
                return topElement;
            }
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // Should print 20
        System.out.println(stack.pop()); // Should print 10
        System.out.println(stack.pop()); // Should print -1 (Stack Underflow)
    }
}
