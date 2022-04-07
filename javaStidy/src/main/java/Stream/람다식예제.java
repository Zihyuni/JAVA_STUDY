package Stream;

import java.util.stream.IntStream;

public class 람다식예제 {
    public static void main(String[] args) {


        //**************************************************//

//        IntStream stream = IntStream.of(1, 2, 3);
//        stream.forEach(x -> System.out.println(x));	//첫번째 stream 사용
//        stream.forEach(x -> System.out.println(x));//두번째 stream

      //***************************************************//


//        //스트림을 재사용하면 안된다.두번째 사용하면 에러를 잡는다.
//        IntStream.range(1, 2).forEach(System.out::println);		//1
//        //range는 열린범위.
//        IntStream.rangeClosed(1, 2).forEach(System.out::print); //12
//        //rangeClosed는 닫힌 범위.

////      ================================================= /////
//        Stream.iterate(0, i -> (i + 1) % 2)
//                .distinct()
//                .limit(10)
//                .forEach(System.out::println);
//
//        System.out.println("Complete!!");
        //위 코드가  왜 안되는지는 인터넷을 검색해봐야한다.

    }
}
