package access.ex2;

public class MaxCounter {
    private int count = 0;
    private int max = 0;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count > max) {
            System.out.println("최댓값을 초과 할 수 없습니다.");
            return;
        }
        count++;
    }


    public int getCount() {
        return count;
    }
}
