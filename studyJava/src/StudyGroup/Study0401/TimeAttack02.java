package StudyGroup.Study0401;

import java.util.Scanner;


/*
사용자에게 1~10까지의 수 중 하나를 입력받는다. ///////////////////
(조건1. 입력받은 값이 1~10의 범위를 넘어간 경우 Error 출력)
사용자가 입력한 값을 userInput으로 받은 뒤
그 수가 짝수인 경우 입력 받은 수 부터 10까지의 숫자를 모두 더한 값을 출력하고,
그 숫자가 홀수인지 짝수 인지 출력하는 코드를 짜시오.
또한 사용자가 입력한 값이 홀 수 인 경우
입력 받은 수부터 10까지의 숫자를 모두 곱한 값을 출력하고,
그 숫자가 홀수인지 짝수 인지 출력하는 코드를 짜시오.

(조건2. 계산 결과값이 20보다 클 경우)
"결과값은 20보다 큰 수 입니다"
작을 경우
"결과값은 20보다 작은 수 입니다."
를 출력하시오.
 */
public class TimeAttack02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); /// 사용자에게 임의의 값을 입력받는 코드
        System.out.println("1~10까지의 숫자중 하나를 입력하시오");
        int userInput = scanner.nextInt();              // 사용자에게 임의의 값을 입력받는 코드

        if (userInput >= 1 && userInput <= 10) {
            System.out.println();

        }
    }
}