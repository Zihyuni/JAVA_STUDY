package SortedSet;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenericSortedSet {
    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("one~~");
        sortedSet.add("twro~~");
        sortedSet.add("thre~~~");

        //이거하면 오류남 int형이라서 sortedSet.add(123);
//       이것도 오류난다 123을 변수에넣고 변수를 넣어줘도 오류남
//       오로지 String 형만 가능하다.
//        int abc = 123;
//        sortedSet.add(abc);

        Iterator iterator = sortedSet.iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator);
            //트리셋은 다 객체주소가 나온다.
            String element = (String) iterator.next();
            System.out.println(element);
            //꼭 string형으로 객체를 만들어주고 하자
        }

    }
}
