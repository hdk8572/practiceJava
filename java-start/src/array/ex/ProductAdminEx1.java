package array.ex;

import java.util.Scanner;

public class ProductAdminEx1 {
    public static void main(String[] args) {
        int maxProduct = 10;
        String[] productName = new String[maxProduct];
        int[] productPrice = new int[maxProduct];
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 :");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("상품 이름을 입력하세요 :");
                productName[count] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 :");
                productPrice[count] = scanner.nextInt();

                count++;
            }
        }




    }

}


