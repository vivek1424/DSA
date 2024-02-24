import java.util.Scanner;

/**
 * QueueImpli
 */
public class QueueImpli {
    //making the class queue
     static class Queue{
        static int[] arr;
        static int rear=-1;
        static int size;
        //for implementing the circular queue 
        static int front=-1;
    //implementing the code using 
        Queue(int n){
            arr=new int[n];
            //size is important for queue, so taking the size thru constructor
            this.size=n;
        }

        //method for checking if the queue is empty 
        public static boolean isEmpty(){
            if(rear==-1 && front==-1){
                return true;
            }else{
                return false;
            }
        }

        //for checking if queue is full 
        public static boolean isFull(){
            if((rear+1)%size==front){
                return true;
            }else{
                return false;
            }
        }

        //adding the element in the queue
        public static void add(int ele){
            if(isFull()){
                /*when the rear element is at last, but queue is not full, then consider it circular and put
                value as circular */
                System.out.print("queue is already full");
                
            }
            //when the queue is empty, we add the first element, by incrementing the front
            if(front==-1){
                front=0;   //first element will be at the index 0
                arr[front]=ele;
            }

            rear=(rear+1)%size;
                arr[rear]=ele;
    
        }

        //seeing which element is at the top
        public static int peek(){
            if(!isEmpty()){
                return arr[front];
            }else{
                return -1;
            }
        }

        public static int Remove(){
            if(isEmpty()){
                System.out.print("The queue is empty");
                return -1;
            }
            int top=arr[front];
            //whenever there is only one element then after its removal, front and rear should become -1
            if(rear==front){
               front=-1;
               rear=-1; 
            }else{
                front=(front+1)%size;
            }
            return top;
        }

        public static void printQueue(){
            for(int i=0; i<size; i++){
                System.out.println(arr[i]);
            }
        }
    }
    

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(5);
        q.add(9);
        q.add(11);
        q.add(18);
        q.add(27);
        int m=q.Remove();
        q.printQueue();

    }
}
