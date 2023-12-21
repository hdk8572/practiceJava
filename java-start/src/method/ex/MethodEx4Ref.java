package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요:");
                int depositAmount = input.nextInt();
                input.nextLine();

                balance = balance += depositAmount;

            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요:");
                int withdrawAmount = input.nextInt();
                input.nextLine();

                if (balance >= withdrawAmount) {
                    balance = balance -= withdrawAmount;
                } else {
                    System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
                }

            } else if (menu == 3) {
                System.out.println("현재 잔액: " + balance);

            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("번호를 다시 입력해주세요");
                continue;
            }
        }
    }
}
