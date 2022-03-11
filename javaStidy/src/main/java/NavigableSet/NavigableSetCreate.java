package NavigableSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetCreate {

    public static void main(String[] args) {
        NavigableSet navigableSet = new TreeSet();

        navigableSet.add("1번째");
        navigableSet.add("2번째");
        navigableSet.add("3번째");
        navigableSet.add("4번쨰");
        navigableSet.add("5번째");

        Iterator iterator01 = navigableSet.iterator();
        while (iterator01.hasNext()) {
            System.out.println("기본으로 출력해보겠습니다:::" + iterator01.next());
        }

        NavigableSet reverse = navigableSet.descendingSet();

        System.out.println(reverse);
        //거꾸로해서 배열상태로 넣어서 출력이 됩니다.

        Iterator reverse2 = navigableSet.descendingIterator();

        while (reverse2.hasNext()) {
            System.out.println("순서를 뒤집어 출력하겠습니다 :::" + reverse2.next());
        }//iterator의 descendingIterator를 이용해 순서를 뒤집었다.


        NavigableSet original = new TreeSet();
        original.add("1");
        original.add("2");
        original.add("3");
        original.add("4");
        original.add("5");

        SortedSet headSet = original.headSet("3");
        System.out.println("headSet안에 3을 넣어봤다" + headSet);
        //3의 앞머리들만 출력이 된다. (3을 제외함)


        SortedSet headSet2 = original.headSet("2", true);
        System.out.println("headSet안에 2를 넣어보고 true를 적었다" + headSet2);
        //true를 적으면 적혀있는 값을 포함해서 앞머리가 나타난다.


        SortedSet tailSet = original.tailSet("1");
        System.out.println("tailSet에 1을 적어봤다::" + tailSet);
        //적혀있는 숫자부터 마지막까지 나타난다.

        SortedSet tailSet2 = original.tailSet("1", false);
        System.out.println("tailSet에 1을 적고 false를 적어봤다::"+tailSet2);
        //false를 적으니까 적혀있는 숫자는 나타나지않고 뒤에 꼬리숫자만 나타난다.


        SortedSet subSet = original.subSet("3","5");
        System.out.println("subSet찍어보기 ::"+subSet);
        //앞에 적은 숫자부터 시작해서 뒤에적은 숫자가 오기전까지 숫자까지 출력해준다.

        Object ceiling = original.ceiling("2");
        System.out.println("ceiling "+ceiling);


        Object floor = original.floor("2");
        System.out.println("floor: "+floor);

        Object higher = original.higher("3");
        System.out.println("higher: "+higher);
        //내가 적은 객체보다 한칸 더 위에있는 숫자를 나타낸다

        Object lower = original.lower("2");
        System.out.println("lower: "+lower);
        //내가 적은 객체보다 한칸 더 밑에있는 숫자를 나타낸다

        Object first = original.pollFirst();
        System.out.println("first:"+ first);
        //첫번째 요소를 반환해주고 제거해버린다

        Iterator firstIterator = original.iterator();
        while (firstIterator.hasNext()){
            System.out.println("첫번째 요소를 제거했습니다 :"+firstIterator.next());
        }
        //요소가 삭제되었는지 확인해보자

        Object last = original.pollLast();
        System.out.println("last:" +last);
        //마지막 요소를 반환하고 제거해버린다

        Iterator lastIterator = original.iterator();
        while (lastIterator.hasNext()){
            System.out.println("마지막 요소를 제거했습니다 :"+lastIterator.next());
        //요소가 삭제되었는지 확인해보자
        }
    }
}
