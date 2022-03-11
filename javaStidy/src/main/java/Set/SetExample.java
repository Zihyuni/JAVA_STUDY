package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set setA = new HashSet();
        //해쉬셋을 생성하였음!

        //set에다가 문자열 추가
        setA.add("안녀어어엉");


        //아마도 출력하려면 다 이더레이터가 필요한거 같다.
        Iterator<String> iterSet = setA.iterator();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next());
        }

        setA.add("123");
        setA.add("456");

        System.out.println("=====================");

        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        }
        /*
        출력 결과가
        안녀어어어엉
        ==============
        123
        456
        안녀어어어엉이다.
        왜 기존에 있던 객체가 맨마지막으로 가는걸까?
        이유: Set은 저장순서 상관이없음!중복데이터도 저장이안됨.
         */
}
