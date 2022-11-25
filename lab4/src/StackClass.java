
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackClass {

    public static  void main(String[] args){

        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();

        st.push(15);
        st.push(25);

        st2.push(45);
        st2.push(55);

        System.out.println("Первый стек до перестановки :"+ st);
        System.out.println("Второй стек до перестановки :"+st2);
        Iterator<Integer> i1 =st.iterator();
        Iterator<Integer> i2 =st2.iterator();

        ArrayList<Integer> l =new ArrayList<Integer>();
        ArrayList<Integer> l2 =new ArrayList<Integer>();

        while (i1.hasNext()){
            l.add(i1.next());
        }

        while (i2.hasNext()){
            l2.add(i2.next());
        }
        st.clear();

        for(int j = 0; j<l2.size();j++){
            st.push(l2.get(j));
        }
        st2.clear();

        for(int j =0;j<l.size();j++){
            st2.push(l.get(j));
        }

        System.out.println("Первый стек после: " +st);
        System.out.println("Второй стек после: " +st2);






    }
}
