package Map;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        //hashmap안에는 key는 String형으로 들어오고 value는 int값만 들어올 수 있다.


        map.put("KOREA" , 127);
        map.put("CHINA" , 636);//같은 키에 다른 값을 넣을 수 없음
        map.put("CHINA" , 272);//같은 키에 다른 값을 넣으면 기존에 있던 값이 초기화되고 나중에 넣은 값이 들어간다.



        System.out.println("KOREA:::"+map.get("KOREA"));
        System.out.println("CHINAK:::"+map.get("CHINA"));
        System.out.println("MAP의사이즈는??"+map.size());//2개
        //왜냐하면 위에 3개의 코드를 작성했어도 하나는 초기화되고 값이 덮어졌으므로 2개

        map.replace("KOREA" , 331);//map의 값을 변경하겠습니다.

        System.out.println("KOREA변경된 값은?? :: "+map.get("KOREA"));//331로변경되었음.


        System.out.println("KOREA라는 키가있나요 있으면 true 없으면 false ::"+ map.containsKey("KOREA"));
        //KOREA라는 키가 있기 때문에 true가 반환된다.

        System.out.println("636이라는 값이 있나요?? 있으면 true 없으면 false ::"+map.containsValue(636));
        System.out.println("272이라는 값이 있나요?? 있으면 true 없으면 false ::"+map.containsValue(272));
        //636은 없어서 false  272는 있어서 true이다. 636은 기존에 있었지만 272로 덮어서 636은 사라짐

        System.out.println("MAP은 Empty인가요?? empty이면 true empty가아니면 false:: "+map.isEmpty());

        map.remove("KOREA");// KOREA라는 key에담긴 value를 삭제한다.
        System.out.println("KOREA의 값은??::" + map.containsKey("KOREA"));
        //KOREA의 Value가 없어서 false가 나온다.

        System.out.println("혹시 이 key가 있으면 true 없으면 defalut를 해주세요::"+map.getOrDefault("JAPAN" , 888));

        map.putIfAbsent("KOREA" ,1000);
        //Key가 없거나 null일때만 삽입 한다한다.
        map.putIfAbsent("CHINA" , 200);
        System.out.println("Key가 없거나 null일 때만 삽입을 합니다.::"+map.get("KOREA"));
        System.out.println("Key가 없거나 null일 때만 삽입을 합니다.::"+map.get("CHINA"));
        //CHINA는 null이 아니기 때문에 272가 그대로 출력되고 200이란 값을 넣지 않습니다.


    }
}
