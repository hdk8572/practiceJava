package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();
            int temp;

            if (a == 0 && b == 0) {
                System.out.println("프로그램 종료 했습니다.");
                break;
            }
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
                System.out.println("첫 번째 값은 " + a + ", 두 번째 값은 " + b);
            } else {
                System.out.println("첫 번째 값은 " + a + ", 두 번째 값은 " + b);
            }

            for (int i = a; i <= b; i++) {
                System.out.print(i);
                if(i != b) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
