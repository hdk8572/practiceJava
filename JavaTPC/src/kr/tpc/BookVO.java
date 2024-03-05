package kr.tpc;

public class BookVO {

	public String title;
	public int price;
	public String company;
	public int page;
	
	public BookVO() {
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 700;
		
	}
	
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	

}
