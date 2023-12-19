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

                if (count >= maxProduct) {
                    System.out.println("더 이상 상품을 추가 할 수 없습니다.");
                    break;
                }

            if (menu == 1) {
                System.out.print("상품 이름을 입력하세요 :");
                productName[count] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 :");
                productPrice[count] = scanner.nextInt();

                count++;
            } else if (menu == 2) {

                    if (count == 0) {
                        System.out.println("추가된 상품이 없습니다.");
                        continue;
                    }

                    for (int i = 0; i < count; i++) {
                        System.out.println(productName[i] + " :" + productPrice[i] + "원");
                    }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("번호를 잘못 입력하였습니다.");
                continue;
            }
        }




    }

}


