import java.util.Scanner;

public class Wk4Qn2 {
    public static void main(String[] args) {

        StackOfIntegers newStack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            newStack.push(i);
        }

        while (!newStack.empty()){
            System.out.print(newStack.pop() + " ");
        }
        
    }
}
