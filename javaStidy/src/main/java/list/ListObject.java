package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListObject {
    public static void main(String[] args) {

        Object element = "지현";
        //객체 요소를 만들어본다.

        List<Object> list = new ArrayList<>();


        list.add(element);
        //리스트에 객체 요소를 집어넣는다

        //출력해본다.
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //성공

    }
}

