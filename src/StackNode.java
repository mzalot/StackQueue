/**
 Node to use in the stack class
 The program will create a stack node
 Author: Mareks
 Collaborator(s):
 Collaboration:
 Date: 11/8/21
 **/
public class StackNode <T>{
    //instance data
    //two node project instances to store pointers
    //parents node
    private StackNode node1;
    //child node
    private StackNode node2;
    //store a way to assign values to the nodes
    private T value;

    //default constructor
    public StackNode(){
        node1 = null;
        node2 = null;
        value = null;
    }
    //1 variable constructor
    public StackNode(T value){
        node1 = null;
        node2 = null;
        this.value = value;
    }
    //3 variable constructor
    public StackNode(T value, StackNode node1, StackNode node2){
        this.value = value;
        this.node1 = node1;
        this.node2 = node2;
    }
    //accessors and mutators

    //all mutators
    public void setValue(T value){
        this.value = value;
    }
    public void setNode1(StackNode node1){
        this.node1 = node1;
        makeChild(node1);
    }
    public void setNode2(StackNode node2){
        this.node2 = node2;
        makeParent(node2);
    }

    //make a child node
    private void makeChild(StackNode node1){
        this.node2 = node1;
    }
    //make a parent node
    private void makeParent(StackNode node2){
        this.node1 = node2;
    }
    //accessors
    public T getValue(){
        return value;
    }
    public StackNode getNode1(){
        return node1;
    }
    public StackNode getNode2(){
        return node2;
    }

    //toString method
    public String toString(){
        //check if value is null
        if(value == null){
            return "Node: null";
        }
        return "Node: " + value.toString();
    }

    //.equals method
    public boolean equals(StackNode node){
        boolean b = this.value.equals(node.getValue());
        return b;
    }
}
