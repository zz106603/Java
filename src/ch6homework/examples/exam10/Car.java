package ch6homework.examples.exam10;

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�(�ܷ� : " + gas);
				gas -= 1;
			}else {
				System.out.println("����ϴ�(�ܷ� : " + gas);
				return;
			}
		}
	}
}
