package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];  // 행 2, 열 3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");  // 0열 출력
            }
            System.out.println();               // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
