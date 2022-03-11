package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {

        String[] values = new String[]{"one" , "two" , "three"};
        List<String> list = (List<String>) Arrays.asList(values);
        //자바 배열도 리스트로 담아줄 수 있다.


        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
