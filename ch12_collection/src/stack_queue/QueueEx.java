package stack_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		System.out.println("도움말: help 입력");

		while (true) {
			System.out.println(">>  ");

			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();

			if ("".equals(input)) {
				continue;
			}

			if (input.equalsIgnoreCase("exit")) {
				System.exit(0);
			} else if (input.equalsIgnoreCase("help")) {
				System.out.println("help - 도움말");
				System.out.println("exit - 종료");
				System.out.println("history - 최근 입력한 명령 5개 출력");
				save(input);
			}else if (input.equalsIgnoreCase("history")) {
				int i=0;
				LinkedList<String> tmp = (LinkedList)q;
				System.out.println(q.size());
				Iterator<String> it = tmp.iterator();
				
				while(it.hasNext()) {
					System.out.println(++i + ". " + it.next());
				}
				save(input);
			}else {
				save(input);
				System.out.println(input);
			}

		}
	}

	private static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		if(q.size()>MAX_SIZE) {
			q.remove();
		}
		
	}

}
