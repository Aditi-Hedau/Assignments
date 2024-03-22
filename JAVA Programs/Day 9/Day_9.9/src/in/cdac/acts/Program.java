package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		int n = 6;
		
		System.out.print("Seieres : ");
		for(int i=1; i<=n; i++) {
			int num;
			if(i % 2 == 0) {
				num = i * i;
			} else {
				num = i * i * i;
			}
			System.out.print(num + " ");
		}
	}
}
