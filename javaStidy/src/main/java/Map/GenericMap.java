package Map;

import java.util.HashMap;

public class GenericMap {
    public static void main(String[] args) {
    HashMap<Integer,String> map = new HashMap<Integer,String>();

    Integer key = new Integer(2022);
    //key에 먼저 숫자값 2022를 넣는다.
    String val1 = "첫번째 value";
    //String형 val1라는 변수에 문자열 값을 담는다.
    map.put(key,val1);
    //map에 위에 변수 두개를 담는다.
    String value1 = map.get(key);
    //value1에 map에서 key를 담는다.

    //출력해본다.
    System.out.println("value1의 값은?? :: "+value1);
    //val1에 넣은 문자열 값이 나온다.


    HashMap<Integer,String> map2 = new HashMap<Integer,String>();

    Integer key2 = 3033;
    String val2 = "두번째 value";

    map.put(key2,val2);
    //혹은 map.put(3033,val2)로 작업해도 된다.

    String value2 = map.get(3033);
    //String value2 = map.get(key2);

        System.out.println("value2의 값은?? :: "+ value2);
    }
}
