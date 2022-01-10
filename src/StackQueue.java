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

    //dequeue method
    public void dequeue(){
        //if there is one piece of data, pop it
        if(counter == 1){
            stack1.pop();
        }
        //if stack is greater than one, remove data until last one from stack1 and add to stack2
        else if(counter > 1){
            //go through and remove the elements and add to the other stack
            for(int i = 0; i<counter; i++){
                stack2.push(stack1.pop());
            }
            //remove the piece of data at the bottom
            stack1.pop();
            //move all the data back to stack1
            for(int i = 0; i<counter;i++){
                stack1.push(stack2.pop());
            }
        }
        //decrease counter
        //check if counter is above zero
        if(counter > 0){
            counter--;
        }
    }

}
