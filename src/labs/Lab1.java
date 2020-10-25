package labs;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !1 = 1
		// !2 = 2 * 1
		// !3 = 3 * 2 * 1
		// !4 = 4 * 3 * 2 * 1
		System.out.println("Summation");
		System.out.println(summation(0));
		System.out.println(summation(1));
		System.out.println(summation(2));
		System.out.println(summation(3));
		System.out.println(summation(4));
		
		System.out.println("Factorial");
		System.out.println(fac(0));
		System.out.println(fac(1));
		System.out.println(fac(2));
		System.out.println(fac(3));
		System.out.println(fac(4));
		
		System.out.println("Minimum, Average and Maximum");
		int[] numbers = {30, 60, 10, 20};
		System.out.println(min(numbers));
		System.out.println(ave(numbers));
		System.out.println(max(numbers));
	}
	
	public static int summation(int n) {
		if (n== 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (n + summation(n-1));
	}
	
	public static int fac(int n) {
		if (n== 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (n * fac(n-1));
	}
	
	public static int min(int[] n) {
		int min = n[0];
		for (int i=1;i<n.length;i++) {
			if (min > n[i]) {
				min = n[i];
			}			
		}
		return (min);
	}
	
	public static int ave(int[] n) {
		int sum = 0;
		for (int i=0;i<n.length;i++) {
			sum = sum + n[i];
		}
		return (sum / n.length);
	}
	
	public static int max(int[] n) {
		int max = n[0];		
		for (int i=1;i<n.length;i++) {
			if (max < n[i]) {
				max = n[i];
			}			
		}
		return (max);
	}

}
