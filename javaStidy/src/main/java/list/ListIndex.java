package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIndex {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.add(1,"2번째자리이며 1번째인덱스를 뺏겠습니다.");
        //특정인덱스 위치에 요소를 집어넣는다.
        //(넣고싶은 자리의 인덱스 , 넣을 데이터)
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
