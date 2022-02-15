import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // 전체 문자열
        String tmp = kb.nextLine(); // 검색 문자열
        int answer = 0;

        while(true) {
            int n = str.indexOf(tmp);
            if (n != -1) {
                str = str.substring(n + tmp.length());
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}
