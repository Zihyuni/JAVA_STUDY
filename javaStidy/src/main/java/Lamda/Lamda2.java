package Lamda;

public class Lamda2 {
    public static void main(String[] args) {

        //메소드를 불러오면 자동으로 오버라이딩이 된다.
//        TestInter ti = new TestInter() {
//            @Override
//            public int max(int a, int b) {
//                return a>b?a:b;
//            }
//        };

        TestInter ti = (a,b) ->a>b?a:b;
        int result = ti.max(5,7);
        System.out.println("result:::"+result);
    }

    @FunctionalInterface
    interface TestInter{
        public abstract  int max(int a,int b);
        //함수형 인터페이스는 하나만 가질 수 있다.
    }
}
