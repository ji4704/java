package StudyGroup.Study0418;

import java.util.Arrays;

//(본인이름)의 교과점수가 저장되는 배열을 만들고 평균 점수를 구하시오.
//조건 : 국어(80점), 수학(60), 영어(70) ,사회(55), 과학(42)
public class HW02 {
    public static void main(String[] args) {
        int[] HongSeongGyu = new int[] {80,60,70,55,42};

        float sum = 0;
        float average = 0;
        HongSeongGyu[0] = 80;
        HongSeongGyu[1] = 60;
        HongSeongGyu[2] = 70;
        HongSeongGyu[3] = 55;
        HongSeongGyu[4] = 42;

        sum = HongSeongGyu[0] + HongSeongGyu[1] + HongSeongGyu[2] + HongSeongGyu[3] + HongSeongGyu[4];

        average = sum / HongSeongGyu.length;

        System.out.println(sum);
        System.out.println(average);
    }
}
