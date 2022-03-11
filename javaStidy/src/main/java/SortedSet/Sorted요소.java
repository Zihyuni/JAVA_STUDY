package SortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted요소 {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();

        sortedSet.add("하나아");
        sortedSet.add("두울");
        //객체 추가 후 확인
        Iterator iterator = sortedSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //객체 삭제
        sortedSet.remove("하나아");
        //객체 삭제 후 확인
        Iterator iterator2 = sortedSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
