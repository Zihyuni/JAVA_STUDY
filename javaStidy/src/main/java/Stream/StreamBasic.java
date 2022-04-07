package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamBasic {
    public static void main(String[] args) {
//        ===================== 기존에 써야하는 java코드 =====================
      List<String> names = Arrays.asList("test" , "test2" , "test3");
        long count = 0;
//
//        for(String name : names){
//            if (name.contains("es")){
//                //name에서 es가 들어가있는 요소가 있으면
//                count++;
//                //count를 계속 +1한다
//            }
//        }
//        System.out.println("count:::"+count);
//        //3개가 출력이된다.


        count = names.stream().filter(name -> name.contains("es")).count();
        System.out.println("count ::: " + count);

//      names의 리스트가 es를 포함하고 있는 string들을 count를하겠다



    }
}
