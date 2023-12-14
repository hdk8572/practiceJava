package operator.loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (;;) {
            sum += i;
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 되는 i는 " + i + ", sum 값은 " + sum);
                break;
            }
            i++;
        }

    }
}
