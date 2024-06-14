public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public void initializeStack(int size)
    {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value)
    {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else
        {
            stackArray[++top] = value;
        }
    }

    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot pop.");
        } else
        {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from stack.");
        }
    }

    public void peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot peek.");
        } else {
            System.out.println("Top element is: " + stackArray[top]);
        }
    }

    public void checkEmpty()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
        } else
        {
            System.out.println("Stack is not empty.");
        }
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.initializeStack(10);

        for (int i = 2; i <= 20; i += 2) {
            stack.push(i);
        }

        System.out.println("\nStarting to pop all elements from the stack:");

        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}
