package ch06.exam08;

public class Example {

	public static void main(String[] args) {
		
		BoardService bs = new BoardService(100,5);
		bs.Registered("����1", "����1", "�۾���1", 0);
		bs.Registered("����2", "����2", "�۾���2", 0);
		//bs.showList();
		
		String[] board = bs.read(2);
		for(String value : board) {
			System.out.println(value + "\t");
		}
	}

}
