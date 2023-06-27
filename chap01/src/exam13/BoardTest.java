package exam13;

import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("title1", "content1", "writer1"));
		list.add(new Board("title2", "content2", "writer2"));
		list.add(new Board("title3", "content3", "writer3"));
		list.add(new Board("title4", "content4", "writer4"));
		list.add(new Board("title5", "content5", "writer5"));
		
		System.out.println(list.get(4));
		
		list.remove(2);
		list.remove(3);
		list.remove(new Board("title4","content4","writer4"));
		
		for (Board board : list) {
			System.out.println(board);
		}
	}

}
