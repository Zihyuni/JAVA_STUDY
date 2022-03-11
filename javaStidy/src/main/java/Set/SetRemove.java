package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRemove {

    public static void main(String[] args) {

        Set set1 = new HashSet();

        set1.add("132");
        set1.add("789");

        //객체를 담고 리스트를 이더레이터로 담아줍니다.
        Iterator iterator = set1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //.remove는 지우는 걸 한다.
        set1.remove("789");
        System.out.println("지운 결과를 보겠습니다~~~");

        Iterator iter2 = set1.iterator();

        while (iter2.hasNext()){
            System.out.println(iter2.next());
            //잘지워졌습니다!!!
        }

        System.out.println("=====다시 추가하겠습니다!!!====");

        set1.add("원");
        set1.add("투");
        set1.add("쑤리");

        Iterator iter3 = set1.iterator();

        while (iter3.hasNext()){
            System.out.println(iter3.next());
        }

        System.out.println("이제 모두 지우겠습니다");

        set1.removeAll(set1);
        //()안에는 객체이름이 들어간다.

        Iterator iter4 = set1.iterator();

        while (iter4.hasNext()){
            System.out.println(iter4.next());

        }

        System.out.println("지워졌씁니다!!");
        //지워져서 아무것도 출력이 안된다.
        //이유:set안에 암것도 없어서 while문이 동작하지않는다.


    }





}
