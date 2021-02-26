package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board(1, "力格1"));
		list.add(new Board(2, "力格2"));
		list.add(new Board(3, "力格3"));
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.print(board.getBno() + " ");
			System.out.println(board.getTitle());
		}
		
		for(Board board : list) {
			System.out.print(board.getBno() + " ");
			System.out.println(board.getTitle());
		}
		
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());

	}

}
