package SortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrder {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add("안녕 1");
        treeSet.add("안녕 2");
        treeSet.add("안녕 3");

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    //descIteraotr를 하면 역순으로 한다.(내림차순)

        Iterator descIterator = treeSet.descendingIterator();
//        while (descIterator.hasNext()){
//            System.out.println(descIterator);
//            //이렇게 출력하니까 안된다.
//            /*
//            무한으로 계속 출력이 된다
//            어떤게 출력이 되는건지 알아봐야함
//             */
//        }

        while (descIterator.hasNext()){
            String element = (String) descIterator.next();
            System.out.println(element);
        }
    }
}
