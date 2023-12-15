package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];    // 행 2, 열 3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;


        System.out.print(arr[0][0] + " ");  // 0열 출력
        System.out.print(arr[0][1] + " ");  // 0열 출력
        System.out.print(arr[0][2] + " ");  // 0열 출력
        System.out.println();               // 한 행이 끝나면 라인을 변경한다.

        System.out.print(arr[1][0] + " ");  // 1열 출력
        System.out.print(arr[1][1] + " ");  // 1열 출력
        System.out.print(arr[1][2] + " ");  // 1열 출력
        System.out.println();               // 한 행이 끝나면 라인을 변경한다.

    }
}
