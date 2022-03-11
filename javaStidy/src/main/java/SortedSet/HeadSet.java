package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeadSet {
    public static void main(String[] args) {
        SortedSet sorted = new TreeSet();

        sorted.add("a");
        sorted.add("b");
        sorted.add("c");
        sorted.add("d");
        sorted.add("e");

        SortedSet headSet = sorted.headSet("e");
        System.out.println(headSet);
        //headSet이 뭔지 모르고 한번 실행을 해봤는데 알았다
        //headSet한 데이터 바로 앞까지의 데이터들을 다 불러온다.
        //헤드세트이니까 앞에있는 머리들을 가져온다고 생각하자.

        /*
        set이 저장순서를 유지하지 않는 줄 알았는데
        위에껀 순서대로 저장이 되게 나오길래 왜인가 검색했더니
        treeSet은 순서대로 저장된다.
        순서대로 저장되지 않는 것은 hashSet
         */
        System.out.println("=======여기서부터는 tailSet입니다=======");
        SortedSet tailSet = sorted.tailSet("c");
        System.out.println(tailSet);

        // 출력결과 : tailSet한 객체에서 부터 마지마까지 다 불러온다
        //꼬리세트라고해서 뒤에있는것들을 모조리 불러온다.
    }
}
