/**
 Stack
 The program will create a stack of nodes
 Author: Mareks
 Collaborator(s):
 Collaboration:
 Date: 11/8/21
 **/
public class Stack <T>{
    //instance data
    private int counter;
    private StackNode node;

    //default constructor
    public Stack(){
        counter = 0;
        node = new StackNode();
    }
    //methods

    //push method
    public void push(T data){
        //find the last node in the stack
        StackNode currentNode = node;
        //go to last element
        for(int i = 0; i < counter; i++){
            currentNode = currentNode.getNode2();
        }
        //create a new node and add it to the end of the stack
        StackNode addNode = new StackNode(data);
        currentNode.setNode2(addNode);
        //add to counter of nodes
        counter++;
    }

    //pop method
    public StackNode pop(){
        //stack node to store last added node
        StackNode currentNode = node;
        //go to last added node
        for(int i = 0; i < counter; i++){
            currentNode = currentNode.getNode2();
        }
        //remove current node through reducing the counter
        counter--;
        //return removed node
        return (StackNode)currentNode;
    }

    //isEmpty method
    public boolean isEmpty(){
        //is there nothing in the stack
        boolean b = (counter == 0);
        return b;
    }

    //size method
    public int size(){
        //number of nodes in stack
        return counter;
    }

    //peek method
    public StackNode peek(){
        //find the last node in the stack
        StackNode currentNode = node;
        //go to last element
        for(int i = 0; i < counter; i++){
            currentNode = currentNode.getNode2();
        }
        //return the last node(most recently added)
        return (StackNode)currentNode;
    }
}
