package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		
		Map<User, Board> map = new HashMap<>(); 
		
		map.put(new User("winter", "´Ê°Ü¿ï"), new Board(1, "´Ê°Ü¿ï"));
		map.put(new User("winter", "º½"), new Board(2, "ÀÔÃá"));
		
		Board board = map.get(new User("winter", null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());

	}

}
