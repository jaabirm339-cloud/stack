import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack <E> {

    private int top;
    private E[]  mystack;
    private final static int DEFAULT_SIZE = 3;

    //default Constructot
    public ArrayStack(){
        this (DEFAULT_SIZE);
    }


    public ArrayStack(int newcapacitysize){ // new size

        top=0;
        mystack = (E[]) new Object[newcapacitysize];
    }

    public int size()  {
        return top;
    }

    public void ExpendcapaciySize() {
        mystack = Arrays.copyOf(mystack, mystack.length * 3);
    }

    public boolean isEmpty() {
        return  top==0;
    }


    //push
    public void push(E newElement){

        if(size() == mystack.length)
            ExpendcapaciySize();
        mystack[top] = newElement;
        top++;

    }

    //pop
    public E pop(){
        if(isEmpty()) throw new RuntimeException("Error Message");

        E elementRemoved = mystack[top--];
        mystack[top] = null;
        return elementRemoved;
    }

    //peek
    public E peek(){
        if(isEmpty()) throw new EmptyStackException();
        return mystack[top-1];
    }

//    dispaly

    public void display(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        for (int i = top - 1; i>=0; i--){
            System.out.println(mystack[i]);
        }
    }

    /// searching
    public E search(E element) {
        for (int i = top - 1; i >= 0; i--) {
            if (mystack[i]==(element)) {
                return mystack[i];
            }
        }
        return null;
    }


}
