package StudyGroup.Study0513;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        //사용자가 하나의 글을 입력했을때, 그 글에 사용자가 원하는 문자 혹은 문자열이 몇개 들어있는지를 찾아내는 코드를 작성
        //조건 1)  글과 문자 혹은 문자열은 사용자에게 입력받아야 한다.
        //조건 2)  사용자가 찾고자 하는 문자 혹은 문자열은 종류에 구애받지 않는다.
        /*
        문자열 : 123451231
        찾을 문자 : 1
        출력 : 3
         */

        String string ="123451231";


        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String text1 = sc.nextLine();

        System.out.println("찾고자 하는 문자혹은 문자열을 입력하세요:");
        String text2 = sc.nextLine();

        int count = 0;

        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i) == text1.charAt(0)) {
                count++;
            }
        }System.out.println("입력하신 문자가" + count + "번 포함되어 있습니다.");

    }
}