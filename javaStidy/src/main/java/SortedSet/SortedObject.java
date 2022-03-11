package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedObject {

    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();

        sortedSet.add("1");
        sortedSet.add("2");
        sortedSet.add("3");

        Object first = sortedSet.first();
        //첫번째 객체만 불러오겠습니다.
        System.out.println(first);


        //마지막 객체를 가져오겠씁니다.
        Object last = sortedSet.last();
        System.out.println(last);
    }
}
