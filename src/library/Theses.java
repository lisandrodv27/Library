package library;

public class Theses extends Item {
	
	private int noOfChapters;
	
	public Theses() {
		super();
	}
	
	public Theses(int noOfPages, String writerSurname, int itemAge, int noOfChapters) {
		super(noOfPages, writerSurname, itemAge);
		this.noOfChapters = noOfChapters;
	}

	@Override
	public int leaseDaysGiven() {
		return 10;
	}
	
	//getters & setters
	public int getNoOfChapters() {
		return noOfChapters;
	}
	
	public void setNoOfChapters(int noOfChapters) {
		this.noOfChapters = noOfChapters;
	}
}