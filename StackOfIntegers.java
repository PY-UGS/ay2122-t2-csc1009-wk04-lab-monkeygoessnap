public class StackOfIntegers {
    
    int[] elements;
    int size;

    public StackOfIntegers() {
        this.size = 0;
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.size = 0;
        this.elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return this.elements[this.size-1];
    }

    public void push(int value) {
        this.elements[size] = value;
        this.size++;
    }

    public int pop() {
        this.size--;
        return this.elements[this.size];
    }

    public int getSize() {
        return this.size;
    }

}
