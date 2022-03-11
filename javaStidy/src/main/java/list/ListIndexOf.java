package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIndexOf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String element1 = "요소1입니다.";
        String element2 = "요소2입니다.";

        list.add(element1);
        list.add(element2);

        //리스트에다가 객체를 통째로 담았습니다!
        Iterator iterator01 = list.iterator();
        while (iterator01.hasNext()){
            System.out.println(iterator01.next());
        }

        int index1 = list.indexOf(element1);
        int index2 = list.indexOf(element2);
        //리스트의 객체자체를 꺼내오느게 아니라
        //인덱스 번호만 꺼내온다.
        int index3 = list.indexOf(element2);

        //해당 객체의 인덱스번호를 확인하고 싶을때 쓰면 된다!
       System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);


    }
}
