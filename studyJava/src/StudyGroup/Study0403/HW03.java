package StudyGroup.Study0403;


<<<<<<< Updated upstream
//st1, st2,st3 3명의 학생 의 성적을 입력받아 배열에 저장한다.
//그 학생들의 평균성적을 구한 뒤 구한 평균 성적을 바탕으로 학생들의 성적을 분류하여 출력한다.
// 결과값 예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하)
//*이하는 기준점을 포함한 그보다 아랫수자를 의미함*

import java.util.Scanner;

//1.학생들의 성적을 입력받을 배열을 선언한다
//2.학생들의 성적을 입력받는다
//== 학생 1의 성적을 입력받으면 배열 0번지에 저장한다 이런식으로 세번째 학생의 점수 까지 입력받아야 한다
//tip.)) 학생(1~3)번째 배열[0~2]번지 라는 규칙이 있으므로 포문이 사용 가능하다
//학생들의 점수가 저장되어있는 배열을 이용하여 학생 점수의 총점을 구한다. (총점을 넣을 변수 필요)
//학생 총점을 이용해 학생들의 평균값을 구한다(총점/인원수 ==> 인원수를 카운트하는 변수를 선언한 뒤 포문이 돌아가는 동안 카운트 한다면 그것이  곧 학생 수가 될것이다)ㅇ
//평균값을 기준으로 크면 이상, 같거나 작으면(tip.))큰 것을 제외한 모든것) 이하를 출력하는 코드를 작성한다 (조건이 있으므로 00문을 사용한다.)
public class HW03 {
    public static void main(String[] args) {


        int[] Student = new int[0];

        System.out.println("학생들의 성적 : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=0; i<Student.length; i++) {
            System.out.println(i);
        }












    }
=======
//st1, st2,st3 3명의 학생의 성적을 입력받아 배열에 저장한다.
//그 학생들의 평균성적을 구한 뒤 구한 평균 성적을 바탕으로 학생들의 성적을 분류하여 출력한다.
// 결과값 예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하)
//*이하는 기준점을 포함한 그보다 아랫수자를 의미함*
public class HW03 {
    public static void main(String[] args) {

    }

>>>>>>> Stashed changes
}
