package ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardEx {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();

		for (int i = 0; i < 3; i++) {
			String title = "title - " + i;
			String content = "content - " + i;
			Map<String, String> map = new HashMap<String, String>();
			map.put("title", title);
			map.put("content", content);
			int result = dao.insertBoard(map);
			if (result == 1) {
				System.out.println("입력성공");
			}
		}
		
		System.out.println("-----------------");
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle());
			System.out.println(board.getContent());
		}

	}

}
