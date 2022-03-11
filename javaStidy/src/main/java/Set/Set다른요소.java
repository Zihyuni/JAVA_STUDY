package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set다른요소 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("일번");
        set1.add("이번");
        set1.add("삼번");

        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            System.out.println("set1을 출력하겠습니다.");
            System.out.println(iterator1.next());
        }

        Set<String> set2 = new HashSet<>();
        set2.add("사번");

        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            System.out.println("set2를 출력하겠습니다");
            System.out.println(iterator2.next());
        }

        //통쨰로 객체집어넣기
        set2.addAll(set1);

        Iterator iterator3 = set2.iterator();
        while (iterator3.hasNext()) {
            System.out.println("set2에 set1객체를 담은걸 출력할게요!");
            System.out.println(iterator3.next());
        }

        System.out.println("===============================");

        //set2에 담겨있는 set을 지우려면 코드를 이렇게 작성해야한다.
        set2.removeAll(set1);

        Iterator iterator4 = set2.iterator();
        while (iterator4.hasNext()){
            System.out.println("set2에 있는 set1객체가 다 지워졌나요?");
            System.out.println(iterator4.next());
        }

    }
}
