package ch06.exam07;

public class Example {

	public static void main(String[] args) {
		
		BoardService bs = new BoardService();
		
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.write("제목1", "내용1");
		bs.write("제목2", "내용2");

		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum(arr);
		System.out.println(sum);
		
		sum = bs.getSum2(1,2,3);
		System.out.println(sum);
		sum = bs.getSum2(1,2,3,4);
		System.out.println(sum);
		sum = bs.getSum2(1,2,3,4,5);
		System.out.println(sum);
	}

}
