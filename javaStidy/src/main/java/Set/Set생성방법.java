package Set;

import javax.swing.tree.TreeCellRenderer;
import java.util.*;

public class Set생성방법 {

    public static void main(String[] args) {
        Set setA = new HashSet();
        Set setB = new LinkedHashSet();
        Set setc = new TreeSet();
        ;


        //셋의 제네릭도 리스트의 제네릭과 똑같다.
        //   Set<MyObject> set = new HashSet<MyObject>();


        Set set = Set.of();
        //set.of는 제네릭 요소가 한번 지정하면 수정이 불가능하다함!!!
        Set<String> set1 = Set.<String>of("value1", "value2", "value3");
        //제네릭 셋을 생성하고 값을 넣어준다.

        Iterator<String> iterator = set1.iterator();
        //제네릭 셋이면 이데레이터로 셋을 만들어야한다.
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> set2 = new HashSet<>();
        set2.add("안녕하세요");
        set2.add("감사해요");
        set2.add("잘있어요");
        set2.add("다시만나여");

        Iterator<String> iter1 = set2.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
            //와일문 출력이 제멋대로 나온다 .검색해보자
        }

        System.out.println("=====여기서부턴 forEach문으로 출력하겠습니다=====");

        for (String str:set2){
            System.out.println(str);
        }
    }

}
