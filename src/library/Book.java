package library;

public class Book extends Item {
	
	private boolean hasHardCover = true;
	
	public Book {
		super();
	}
	
	public Book(int noOfPages, String writerSurname, int itemAge, boolean hasHardCover) {
		super(noOfPages, writerSurname, itemAge);
		this.hasHardCover = hasHardCover;
	}
	
	@Override
	public int leaseDaysGiven() {
		int lowerLease;
		int higherLease;
		if (hasHardCover == true) {
			return lowerLease = 20;
		} else {
			return higherLease = 35;
		}
		
			
	}
	
	
	//getters & setters
		public boolean get() {
			return hasHardCover;
		}
		
		public void setNoOfChapters(boolean hasHardCover) {
			this.hasHardCover = hasHardCover;
		}
	
	
	
	
	
}
