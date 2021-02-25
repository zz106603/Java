package ch11.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		board.setBno(1);
		board.setTitle("제목");
		board.setContent("내용");
		board.setWriter("작성자");
		board.setWirteData(new Date());
		
		service(board);

	}
	
	public static void service(Board board) {
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.getWirteData());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String strDate = sdf.format(board.getWirteData());
		System.out.println(strDate);
	}

}
