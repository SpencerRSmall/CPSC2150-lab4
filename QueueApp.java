package cpsc2150.MyQueue;
import java.util.*;

public class QueueApp {
    public static void main() {
        IQueue q;
    /*
    You will add in code here to ask the user whether they want an
    array implementation or a list implementation. Then use their
    answer to initialize q appropriately
    */
        q = new ArrayQueue();
        System.out.print("Would you like an array implementation or a list implementation?\nArray = 0\nList = 1");

        Scanner type = new Scanner(System.in);
        int num = type.nextInt();

        switch (num) {
            case 0:
                q = new ArrayQueue();
                break;
            case 1:
                q = new ListQueue();
                break;
        }


        Integer x = 42;
        q.enqueue(x);
        System.out.println(q);
        x = 17;
        q.enqueue(x);
        x = 37;
        q.enqueue(x);
        x = 36;
        q.enqueue(x);
        x = 12;
        q.enqueue(x);
    /*
    Add the code to print the queue. After the code is finished,
    the queue should still contain all its values in order
    */
        for (int i = 0; i < q.length(); i++) System.out.print(q);

        q.clear();
    }
}
