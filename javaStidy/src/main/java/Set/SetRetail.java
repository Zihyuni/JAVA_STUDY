package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetail {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");


        Set<String> set2 = new HashSet<>();
        set2.add("3");
        set2.add("4");

        set.retainAll(set2);
        //retailAll 중복제거?
        //중복제거가 아니였다 .
        //set에 있는 객체에서 set2에 있는 객체와 같지 않으면 다 삭제하는거 같다.
        //검색시 안나와서 더 검색해볼것!

        //한번 출력해보자

        Iterator iteratorSet1 = set.iterator();
        Iterator iteratorSet2 = set2.iterator();

        while (iteratorSet1.hasNext()){
            System.out.println("====이건 set1입니다.====");
            System.out.println(iteratorSet1.next());
        }

        while (iteratorSet2.hasNext()){
            System.out.println("====이건 set2입니다====");
            System.out.println(iteratorSet2.next());
        }



    }
}
