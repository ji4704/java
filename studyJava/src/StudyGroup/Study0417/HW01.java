package StudyGroup.Study0417;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("몇 단까지 출력 할까요? : ");
        int input = scn.nextInt();
        int a = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (input >= i) {
                    a = i * j;
                    System.out.print(a + " ");
                    if(j==9){
                        System.out.println();
                    }
                }
            }
        }
    }
}
