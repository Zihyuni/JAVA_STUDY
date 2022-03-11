package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRetain {
    public static void main(String[] args) {
        List<String> list      = new ArrayList<>();
        List<String> otherList = new ArrayList<>();
        //Retain : 이 메서드는 다른 대상 에서 찾을 수 없는 모든 요소를 대상에서 제거함.
        //결과는 두 목록의 교집합임
        String element1 = "element 1";
        String element2 = "element 2";
        String element3 = "element 3";
        String element4 = "element 4";

        list.add(element1);
        list.add(element2);
        list.add(element3);

        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println("list : "+iterator1.next());
        }

        otherList.add(element1);
        otherList.add(element3);
        otherList.add(element4);
        Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()){
            System.out.println("otherList : "+iterator2.next());
        }

        list.retainAll(otherList);
        Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()){
            System.out.println("list retainAll otherList : "+iterator3.next());
        }//출력한 결과 : 둘이 동일하게 갖고 있는 객체들만 출력이 되었다.


    }
}
