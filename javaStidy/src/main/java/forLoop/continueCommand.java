package forLoop;

public class continueCommand {
    public static void main(String[] args) {
        String[] strings = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        for(int i=0; i < strings.length; i++) {
            //i를 0으로 초기화한다
            //i가 srings의 객체개수 길이보다 작을떄까지
            //i를 ++한다.
            if(! strings[i].toLowerCase().startsWith("j")) {
                continue;
            }
            //만약 객체의 인덱스가 소문자 j가 아니면..? 해당 반복부분 탈출하고
            //다음 반복 실행한다.

            wordsStartingWithJ++;



        }
    }
}
