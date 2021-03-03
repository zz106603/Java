package ch15homework.problems.Exercise07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public static List getBoardList() {
		
		Board board1 = new Board("力格1", "郴侩1");
		Board board2 = new Board("力格2", "郴侩2");
		Board board3 = new Board("力格3", "郴侩3");
		
		List<Board> list = new ArrayList<Board>();
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		
		return list;
	}
	
	
}

