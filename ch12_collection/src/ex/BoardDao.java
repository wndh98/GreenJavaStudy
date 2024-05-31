package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BoardDao {
	List<Board> list = new ArrayList<Board>();

	public int insertBoard(Map<String,String> map) {
		list.add(new Board(map.get("title"), map.get("content")));
		return 1;
	}
	
	public List<Board> getBoardList() {
		return list;
	}

}
