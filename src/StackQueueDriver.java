/**
 StackQueueDriver
 The program will run the StackQueue class
 Author: Mareks
 Collaborator(s):
 Collaboration:
 Date: 1/10/22
 **/
public class StackQueueDriver {
    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        //test the isEmpty method
        System.out.println("Testing the isEmpty method(should return true): " + q.isEmpty());
        //test the size method
        System.out.println("Testing the size method(should return 0): " + q.size());
        //test the peek method
        System.out.println("Testing the peek method(should return null): " + q.peek());
        //test the dequeue method
        System.out.println("Testing the dequeue method(should return null): " + q.dequeue());
        //test the enqueue method
        System.out.println("Testing the enqueue method(added the word Hello) ");
        q.enqueue("Hello");
        //test the peek method
        System.out.println("Testing the peek method(should return Hello): " + q.peek());
        //test the size method
        System.out.println("Testing the size method(should return 1): " + q.size());
        //test the isEmpty method
        System.out.println("Testing the isEmpty method(should return false): " + q.isEmpty());
        //test the dequeue method
        System.out.println("Adding Hi using the enqueue method");
        q.enqueue("Hi");
        System.out.println("Testing the dequeue method(Should return Hello): " + q.dequeue());
        System.out.println("Testing the dequeue method(Should return Hi): " + q.dequeue());
    }
}
