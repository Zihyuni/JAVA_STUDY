package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSubList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("요소1");
        list.add("요소2");
        list.add("요소3");
        list.add("요소4");
        list.add("요소5");

        List<String> subList = list.subList(1,3);

        Iterator iterator = subList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
