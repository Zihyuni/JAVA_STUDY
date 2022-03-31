package forLoop;

public class backCommand {
    public static void main(String[] args) {
        String[] strings = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        //0으로 값을 초기화한다.
        for(int i=0; i < strings.length; i++) {

            if(strings[i].toLowerCase().startsWith("j")) {
                //만약 string에 index가 소문자j가아니면..?

                wordsStartingWithJ++;
                //wordsStartingWithJ가 ++
            }

            if(wordsStartingWithJ >= 3) {
                break;
                //만약 3이되면 탈출한다.

            }
            System.out.printf(String.valueOf(wordsStartingWithJ));

        }
    }
}
