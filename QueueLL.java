import java.util.*;

/**
 * QueueImpli
 */
public class QueueImpli {
    //making the class queue
    //implementation using the linked list 
    //create a node class now 

        static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
     static class Queue{
        /* 
        static int[] arr;
        static int rear=-1;
        static int size;
        //for implementing the circular queue 
        static int front=-1;
        */
        static Node head=null;
        static Node tail=null;
    //implementing the code using linked list 

       
        
        /*constructor not needed in case of the implementation thru linked list 
        Queue(int n){
            arr=new int[n];
            //size is important for queue, so taking the size thru constructor
            this.size=n;
        }
        */


        //method for checking if the queue is empty 
        public static boolean isEmptyLL(){
            if(head==null && tail==null){
                return true;
            }else{
                return false;
            }
        }

        /*not needed when we are using linkedlist  
        public static boolean isFull(){
            if((rear+1)%size==front){
                return true;
            }else{
                return false;
            }
        }
        */

        //adding the element in the queue using the linked list 
        public static void addLL(int ele){
            Node newNode=new Node(ele);
            //in case the queue is empty
            if(tail==null){       
                head=tail=newNode;   
                return;             
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            return;
        }

        //seeing which element is at the top
        public static int peek(){
            if(!isEmptyLL()){
                return head.data;
            }else{
                return -1;
            }
        }

        public static int RemoveLL(){
            if(isEmptyLL()){
                System.out.print("The queue is empty");
                return -1;
            }
            int top=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            //whenever there is only one element then after its removal, front and rear should become -1
            return top;
        }

    }
    

    public static void main(String[] args) {
        Queue q=new Queue();
        q.addLL(5);
        q.addLL(7);
        q.addLL(9);
        q.addLL(11);
        q.addLL(15);
        int n=q.peek();
        System.out.println("the element at the head of the queue is:"+n);
        while(!q.isEmptyLL()){
            int m=q.peek();
            System.out.println(m);
            q.RemoveLL();
        }
        if(q.isEmptyLL()){
            System.out.println("Yes, the queue is now empty");
        }
    }
}
