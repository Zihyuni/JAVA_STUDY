package Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreemArray {
    public static void main(String[] args) {

        String[] arr = new String[]{"넷" , "둘" , "하나" , "셋"};

        //배열에서 스트림 생성을 한다.

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e-> System.out.print(e+" "));
        System.out.println();

        //배열의 특정 부분만을 이용한 스트림 생성을 한다.
        Stream<String> stream2 = Arrays.stream(arr,1,3);
        stream2.forEach(e-> System.out.print(e+" "));


        //***************가변 매개변수*************************//
        System.out.println("===================================");
        Stream<Double> stream = Stream.of(4.2,3.5,3.1,1.9);
        stream.forEach(System.out::println);

        System.out.println("===================================");

        IntStream stream3 = IntStream.range(1,4);
        stream3.forEach(e-> System.out.print("stream3 ::: " +e+""));
        System.out.println();

        IntStream stream4 = IntStream.rangeClosed(1,4);

        stream4.forEach(e-> System.out.print("stream4 ::: " +e+" "));

        System.out.println("===================================");
        IntStream stream5 = new Random().ints(4);
        stream5.forEach(System.out::println);




    }
}
