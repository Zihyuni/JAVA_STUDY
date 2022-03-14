package whileLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class whileLoop {
    public static void main(String[] args) {

        int counter = 0;
        while (counter<10){
            System.out.printf("counter 은 :::: "+counter);
            counter++;

            //while문은 ()안에 조건이 true일떄마다 돈다.
            //counter가 0이기때문에 9까지 돈다
            //10이 될경우 false이기 때문에 안된다.
        }
        boolean shouldContinue = true;
        //일단 shouldContinue는 true이다.
        while(shouldContinue == true) {
        //shouldContinue가 트루이면
            System.out.println("running");
            //running을 출력한다.
            double random = Math.random() * 10D;
            //random을 발생시킨다.
            if(random > 5) {
                shouldContinue = true;
                //랜덤숫자가 5보다 크면 또 shouldContinue를 트루로 ㅈ작업한다.
            } else {
                shouldContinue = false;
                //만약 랜덤이 5보다 작으면 shouldContinue는 false다.
            }
        }

        List list = new ArrayList();
        list.add("123");
        list.add("456");

        Iterator iterator = list.iterator();

        while(iterator.hasNext())
            System.out.println("next::::: " + iterator.next()); // executed in loop
            System.out.println("======second line========");// executed after loop
        //이것도 똑같다 {}를 쓰지않으면 첫번째 출력문만 진행이되고
        //반복문 조건이 다를경우나 반복이다되면 두번쨰 출력문을 진행한다.

        String[] strings = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        int i=0;

        while( i < strings.length ) {
            if(! strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }

            wordsStartingWithJ++;
            i++;


        }
    }


}
