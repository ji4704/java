package StudyGroup.Study0402;

import java.util.Scanner;

//사칙연산 계산기 코드를 작성하시오.
//조건 1.) 사용자에게 2개의 숫자를 입력 받는다.
// 사용자가 원하는 사칙연산의 숫자를 입력받는다. ex. 1. 덧셈 2. 뺄셈 3. 곱셈 4.나눗셈 중 원하는 연산의 숫자를 입력하시오.
//조건 2.) 사용자가 원하는 사칙연산을 수행하는 코드를 작성한다.
//조건 3.) 범위를 벗어나는 행동을 할 경우 Error를 출력한다.
public class HW01 {
    public static void main(String[] args) {


        System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4.나눗셈 중 원하는 연산의 숫자를 입력하시오");
        Scanner scanner1 = new Scanner(System.in);
        int userNum1 = scanner1.nextInt();

        int sum = 0;

        sum = sum + userNum1;

        System.out.println(sum);




        Scanner scanner2 = new Scanner(System.in);
        int userNum2 = scanner2.nextInt();



    }
}
