package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
            {1,2,3},
            {4,5,6}
        };  // 행 2, 열 3

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");  // 0열 출력
            }
            System.out.println();               // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
