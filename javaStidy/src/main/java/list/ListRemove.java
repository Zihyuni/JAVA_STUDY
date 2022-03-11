package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String element = "첫번째 element";
        String element2 = "두번째 element";
        String element3 = "세번째 element";

        list.add(element);
        list.add(element2);
        list.add(element3);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("지우기 전입니다:::"+iterator.next());
        }

        //객체로 지우기!!
        list.remove(element);
        Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()){
            System.out.println("객체로 지운 후 입니다:::"+iterator2.next());
        }
        //인덱스로 지우기!!
        list.remove(1);
        Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()){
            System.out.println("인덱스로 지운 후 입니다:::"+iterator3.next());
        }
    }
}
