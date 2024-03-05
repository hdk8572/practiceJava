import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		
		String title = "스프링";
		int price = 25000;
		String company = "제이팝";
		int page = 890;
		
		BookDTO dto = new BookDTO(title, price, company, page);
		
		bookPrint(dto);
		
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
	
}
