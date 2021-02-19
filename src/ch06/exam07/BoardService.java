package ch06.exam07;

public class BoardService {
	//Field
	int count = 0; 
	
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}

	void write(String title, String content){
		int bno = getNewBno();
		System.out.println("번호 : " + bno);
		System.out.println(title + "을 저장합니다.");
		System.out.println(content + "을 저장합니다.");
	}
	
	int getSum(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		
		return result;
	}
	
	int getSum2(int ... values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		
		return result;
	}
}
