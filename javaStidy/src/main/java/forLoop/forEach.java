package forLoop;

public class forEach {
    public static void main(String[] args) {
        for(int i=0; i < 10; i++) {

            System.out.println("i 의 값은 ??? : " + i);
        }
        for(int j = 0; j < 10; j++)
            System.out.println("j의 값은??" + j);  // executed inside  loop.
        System.out.println("second line");   // executed after   loop.

        //{}를 쓰지않으면 먼저 첫번쨰 syso문만 계속 반복이 되고
        //그 다음으로 쓴 syso문은 반복문이 끝난 후에 작성된다.

        for(int a=0; a < 10; a++) {

            System.out.println("A의 값은??: " + a);
        }

        //첫번째는 초기식 두번째는 증감식 세번째는 조건식이다.
        //초기식은 시작되기전에 한번만 실행하면 됨.

        //두번째는 조건식 true이면 반복문을 계속 실행하고,
        //false이면 반복문을 중단한다.

       //세번째는 증감식 for문 Loop가 반복될때마다 실행된다.
        //두번쨰 조건식에 얼맞으면 실행된다는 소리!!

    }
}
