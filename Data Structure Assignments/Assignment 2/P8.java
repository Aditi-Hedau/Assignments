public class P8{
	public static int findStringCount(String str){
		if(str.equals("")){
			return 0;
		} else {
			return findStringCount(str.substring(1)) + 1;
		}
	}

	public static void main(String[] args){
		String str = "Hello World";
		System.out.println(findStringCount(str));
	}
}