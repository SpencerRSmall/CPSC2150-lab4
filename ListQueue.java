package cpsc2150.MyQueue;
import java.util.*;

public class ListQueue implements IQueue {
    // this time store the queue in a list
    // myQ.get(0) is the front of the queue
    private List<Integer> myQ;

    // complete the class

    public ListQueue(){
        List<Integer> myQ = Arrays.asList(MAX_LENGTH);
    }

    public void enqueue(Integer x){
        myQ.add(x);
    }

    public Integer dequeue(){
        Integer num = 0;
        num = myQ.get(0);
        myQ.remove(0);
        return num;
    }

    public int length(){
        return myQ.size();
    }

    public void clear(){
        myQ.clear();
    }
}



