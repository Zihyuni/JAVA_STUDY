package 코딩테스트;

import java.util.ArrayList;
import java.util.Arrays;

public class 두수뽑아서더하기 {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
            //Integer형의 Array리스트를 생성한다.

        //이중 for문을 만든다.
        for (int i = 0; i < numbers.length; i++) {

            //i는 0이다. i는 number.length보다 커지기전까지 i++한다.

            for (int j = i + 1; j < numbers.length; j++) {

                //j는 i+1이다. j는 numbers.길이보다 커지기전까지 j++한다.
                int n = numbers[i] + numbers[j];
                //n은 number의 i인덱스와 number의 j인덱스를 +한 값

                if (list.indexOf(n) < 0) {
                    //indexof::배열의 값이 있는지 확인한다.
                    //list에 n이 있고 0보다 작으면 list에 n을 추가한다.
                    list.add(n);
                }
            }
        }

        int[] answer = new int[list.size()];
            //answer은 list.size만큼 배열공간이 존재한다.
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            //i는 0이다 i가 list의 size보다 커지지않을정도로 i++한다.
            //answer의 인덱스는 list의 i번째다
        }
        Arrays.sort(answer);
        //리스트를 정리해주고 answer를 반환한다.

        return answer;
    }



    }