import java.util.Stack;

public class Stacks {
    
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1); 
        st.push(2); 
        st.push(3);
        // System.out.println(st.peek());
        // System.out.println(st.isEmpty());
        // System.out.println(st.size());
        
        
        // Question1 : finding the top most element of the stack.
        // while(st.size()>1){
        //     st.pop(); 
        //     System.out.println(st);
        // }
    

        // Question(2) : Copy the stack using 2 Arrays. 
        // int tempArr[] = new int[3]; 
        // int copyArr[] = new int[3]; 
        // int index = 0;
        // while(st.size()>0){
        //     int ele = st.pop(); 
        //     tempArr[index] = ele; 
        //     index++;
        // }

        // for(int i=0; i<tempArr.length; i++){
        //     System.out.println(tempArr[i]);
        // }

        // for (int j = 0; j < tempArr.length; j++) {
        //     copyArr[j] = tempArr[tempArr.length - 1 - j];
        // }

        // for(int i=0; i<copyArr.length; i++){
        //     System.out.println(copyArr[i]);
        // }

        // Question : Insert At Bottom
        Stack <Integer> tempSt = new Stack<>();

        while(st.size()>0){
            int ele = st.pop(); 
            tempSt.push(ele);
        }

        System.out.println(st);
        System.out.println(tempSt);

        st.push(5); 

        while(tempSt.size()>0){
            int ele = tempSt.pop(); 
            st.push(ele);
        }

        System.out.println(st);
        System.out.println(tempSt);







    }        

}


// Stack 
// Last In First Out (LIFO).
// First In last Out (FILO).
// All Time complexity is o(1); peek,pop,push all.
// To add at specified index time complextity = o(n);

