package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClear {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("object 첫번째~~");
        list.add("object 두번째~~");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println("지우기전입니다 ::"+iterator.next());
        }

        list.clear();
        Iterator iteratorClean = list.iterator();

//        while (iterator.hasNext()){
//            System.out.println("지운후입니다::"+iteratorClean.next());
//        }이 코드를 실행하면 에러가 뜬다. list를 지워버렸고 그렇기때문에 while문을 돌릴수가 없다.
    }
}
