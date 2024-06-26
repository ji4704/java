package StudyGroup.Study0411;


/*
[if문 사용]
a가 10일때
1) a와 10이 같다면 True, 다르다면 False를 출력하는 코드를 작성하시오.
2) b = 20, c = 50이다. b와 c의 합이 a보다 클 경우 True, 작을 경우 False를 출력하는 코드를 작성하시오.
3) x = 120, y = 60, z = 30 이다. z를 a로 나눈 몫이 x를 y로 나눈 몫보다 크면 "A팀 승"를 작으면 "Y팀 승",
   같으면 "동점" 을 출력하는 코드를 작성하시오.
 */
public class HW01 {
    public static void main(String[] args) {
       // 1) a와 10이 같다면 True, 다르다면 False를 출력하는 코드를 작성하시오.
        int a =10;
        if (a==10) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // 2) b = 20, c = 50이다. b와 c의 합이 a보다 클 경우 True, 작을 경우 False를 출력하는 코드를 작성하시오.
        int b = 20;
        int c = 50;
        int sum = 0;
        sum = b + c;

        if (sum>a) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        /* 3) x = 120, y = 60, z = 30 이다. z를 a로 나눈 몫이 x를 y로 나눈 몫보다 크면 "A팀 승"를 작으면 "Y팀 승",
           같으면 "동점" 을 출력하는 코드를 작성하시오
           if (z / a > x / y)
           */
        int x = 120, y =60, z = 30;
        int div1;
        int div2;
        div1 = z / a;
        div2 = x / y;

        if (div1>div2) {
            System.out.println("A팀 승");
        } else if (div1<div2) {
            System.out.println("Y팀 승");
        } else{
            System.out.println("동점");
        }
    }
}
