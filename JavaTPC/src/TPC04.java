public class TPC04 {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		hap(a, b, c);
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap1(arr);
		
	}
	
	public static void hap(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	public static void hap1(int[] arr) {
		
		// int sum = arr[0] + arr[1] + arr[2];
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
	
}
