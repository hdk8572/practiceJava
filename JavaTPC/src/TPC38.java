import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C", 17000, "에이콘", 700));
		list.add(new BookDTO("Python", 15000, "제이펍", 690));
		
		for (int i = 0; i < list.size(); i++) {
			//Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
			
		}
		System.out.println(list.size());
		
	}	
}
