package ch05;

public class Exam01 {
	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 10;
		
		System.out.println(var1 == var2);
		System.out.println(var1 != var2);
		
		String var3 = "자바";
		String var4 = "자바";
		
		System.out.println(var3 == var4);
		System.out.println(var3 != var4);
		
		String var5 = "자바";
		String var6 = new String("자바");
		System.out.println(var5 == var6);
		System.out.println(var5 != var6);
	}
	

}
