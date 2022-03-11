package list;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("요소1");
        list.add("요소2");
        list.add("요소3");
        list.add("요소4");

        Set<String> set = new HashSet<>();
        set.addAll(list);
        //Set형식의 객체로 리스트형식을 버린다
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        //출력해보면 잘 넣어진걸 확인 할 수 있다.
        }
    }
}
