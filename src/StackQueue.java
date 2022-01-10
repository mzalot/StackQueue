/**
 StackQueue
 The program will create a StackQueue
 Author: Mareks
 Collaborator(s):
 Collaboration:
 Date: 1/10/22
 **/
public class StackQueue <T>{
    //instance data
    private int counter;
    private Stack stack1;
    private Stack stack2;

    //default constructor
    public StackQueue(){
        counter = 0;
        stack1 = new Stack();
        stack2 = new Stack();
    }

    //enqueue method
    public void enqueue(T data){
        //add the data to the first stack
        stack1.push(data);
        //increase the counter
        counter++;
    }

}
