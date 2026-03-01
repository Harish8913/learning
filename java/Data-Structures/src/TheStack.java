public class TheStack {
    static STACK st = new STACK(5);

    public static void main(String[] args) {
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.peek();
    }
}

class STACK {
    int[] arr;
    int top = -1;
    int capacity = 0;

    STACK(int cap) {
        capacity = cap;
        top = -1;
        arr = new int[capacity];
    }

    void push(int data) {
        if (capacity == top + 1) {
            System.out.println("STACK OVERFLOWING !!");
        }

        arr[++top] = data;
    }

    int pop() {
        if (top == -1) {
            return -1;
        }

        return arr[top--];
    }

    void peek() {
        System.out.println(arr[top]);
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return capacity == top + 1;
    }
}