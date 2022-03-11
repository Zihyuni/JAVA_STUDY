package Set;

import java.util.*;

public class SetList {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("1234");
        set.add("4567");

        List<String> list = new ArrayList<>();
        list.addAll(set);
        //매개변수에 넣어서 객체를 그냥 넣어주면
        //set을 리스트로 변환해줄수있다.
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
