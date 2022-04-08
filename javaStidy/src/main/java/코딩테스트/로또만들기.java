package 코딩테스트;

import java.util.Arrays;
import java.util.Scanner;

public class 로또만들기 {
    public static void main(String[] args) {
        System.out.println("로또를 몇장 출력하시겠습니까? 숫자만 적어주세요.");

        Scanner sc = new Scanner(System.in);

        int scNum = sc.nextInt();
        //scNum은 스캐너로 입력받는 숫자이다.

        for(int i=1; i<= scNum; i++){
        //i는 1이다 i가 사용자가입력한 수랑 같거나 사용자가 입력한 수가 더 크면 i++한다
            System.out.println(i+"번째 로또번호 입니다 ::: "+lottonumber());

            //출력은 반복인덱스와 lottoNumber메소드를 출력한다.
       }
        sc.close();
        //스캐너를 닫아준다.
    }

    static String lottonumber() {
            //lottonumber메소드
        int [] arr = new int[6];
        // arr 배열은 크기가 6개다
        for (int i=0; i<6 ;i++){
            //i=0이다 i가6이되기전까지 i++한다.
            arr[i]=(int)(Math.random()*45+1);
            //배열[i]는 랜덤을 돌려서 45개돌려서 1개씩 추가해준다.
        }
        return Arrays.toString(arr);
    }
}
