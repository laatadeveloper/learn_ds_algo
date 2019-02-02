package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {

    public static void execute(ArrayList<Integer> a, ArrayList<Integer> b){
        HashMap<Integer, Integer> map= new HashMap<>();
        b.forEach((elem)-> map.put(elem, map.getOrDefault(elem, 0) +1));
        for (Integer elem: a) {
            if(map.containsKey(elem))
                map.put(elem, map.get(elem) - 1);
        }
        for (Map.Entry elem: map.entrySet()) {
            if((Integer)elem.getValue() > 0){
                System.out.println("b is not subset of a");
                return;
            }
        }
        System.out.println("b is subset of a");
    }
}
