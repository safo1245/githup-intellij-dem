package Student;

public class GenericStack<T> {
    private T[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public GenericStack(int capacity) {
        stackArray = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        if (top == stackArray.length - 1) {
            expand();
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        T value = stackArray[top--];
        System.out.println(value + " popped from stack.");
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("\nStack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    @SuppressWarnings("unchecked")
    private void expand() {
        T[] newArray = (T[]) new Object[stackArray.length * 2];
        for (int i = 0; i < stackArray.length; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
        System.out.println("Stack expanded to size: " + stackArray.length);
    }
}
