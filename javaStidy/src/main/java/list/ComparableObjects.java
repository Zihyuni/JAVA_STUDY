package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableObjects {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("3");
        list.add("2");
        list.add("1");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("순서를 바꾸기 전입니다 ::"+ iterator.next());
        }

        Collections.sort(list);

        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println("순서를 바꿨습니다:::"+ iterator1.next());
        }
    }
}
