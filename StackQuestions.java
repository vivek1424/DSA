import java.util.*;
/**
 * StackQ
 code for finding the midpoint of the stack, but here the space complexity is o(n), and time complexity is o(2n) 
 */
public class StackQ {

    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(5);
        s1.push(11);
        s1.push(17);
        s1.push(21);
        s1.push(28);
        s1.push(35);
        int size=0, val=0;
        int mid=-1;
        Stack<Integer> s2=new Stack<>();
        while (!s1.empty()){
            int n=s1.pop();
            s2.push(n);
            size++;           
        }
        while(val<=size/2){
             mid=s2.pop();
            val++;
        }
        System.out.println("The midpoint of the stack is:"+mid);
    }
}
