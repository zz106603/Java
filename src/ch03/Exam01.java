package ch03;

public class Exam01 {

	public static void main(String[] args) {

		//������ �پ��� ����

		int var1 = 1;
		var1 = var1 + 1;
		var1 += 1;
		var1++;
		System.out.println(var1);

		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		System.out.println(var2);

		int var3 = 16;
		var3 = var3 / 2;
		var3 /= 2;

		// �ڹ��� ����/(������)�� ����� ����.
		int var4 = 11;
		int var5 = 4;
		int var6 = var4/var5;
		System.out.println(var6);
		
		double var7 = 1.0* var4 / var5;
		System.out.println(var7);
		
		double var9 = (double)var4 / var5;
		System.out.println(var9);
		
		//������ ���ϱ�
		int var8 = var4 % var5;
		System.out.println(var8);
		

		
		
	}
}