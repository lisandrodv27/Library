package library;

public abstract class Item {

	private int noOfPages;
	private String writerSurname;
	private int itemAge;

	//public Item {
	//super();
	//}

	public Item(int noOfPages, String writerSurname, int itemAge) {
		super();
		this.noOfPages = noOfPages;
		this.writerSurname = writerSurname;
		this.itemAge = itemAge;
	}
	
	public int leaseDaysGiven() {
		return 30;
	}
	
	public int idSystem() {
		
	}

	// setters & getters
	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getWriterSurname() {
		return writerSurname;
	}
	
	public void setWriterSurname(String writerSurname) {
		this.writerSurname = writerSurname;
	}
	
	public int getItemAge() {
		return itemAge;
	}
	
	public void setItemAge(int itemAge) {
		this.itemAge = itemAge;
	}
	
}