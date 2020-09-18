package cpsc2150.MyQueue;

// implements IQueue
public class ArrayQueue implements IQueue{
    // where the data is stored. myQ[0] is the front of the queue
    private Integer[] myQ;
    // tracks how many items in the queue
    // also used to find the end of the queue
    private int myLength;
    // complete the class

    // add comments
    public ArrayQueue(){
        myQ = new Integer[MAX_LENGTH];
    }

    public void enqueue(Integer x){
        myQ[myLength] = x;
        myLength++;
    }

    public Integer dequeue(){
        Integer num = myQ[0];
        for (int i=0; i<myLength; i++){
            if (myQ[i+1] == null){
                return myQ[i];
            }
            else myQ[i] = myQ[i+1];
        }
        return num;
    }

    public int length(){
        return myLength;
    }

    public void clear(){
        for (int i=0; i<myLength; i++){
            myQ[i] = null;
        }
    }
}
