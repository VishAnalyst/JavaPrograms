package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Preethi");
        lst.add("loves");
        lst.add("Makeup");
        lst.add("Preethi");
        lst.add("loves");
        lst.add("Makeup");
//Displaying through advanced for loop method
//        for (String strWords : lst){
//            System.out.println("Given string is: "+ strWords);
//        }
        //Displaying through for loop
//        int arrayListsize = lst.size();
//        for(int i=0; i<=arrayListsize; i++){
//            System.out.println(lst.get(i));
//        }

        //Displaing through iteration method
        Iterator itr = lst.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
