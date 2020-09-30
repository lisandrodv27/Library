package library;

public class Book extends Item {

	private boolean hasHardCover = true;

	public Book() {
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

	public boolean getIsHardCover() {
		return hasHardCover;
	}

	public void setIsHardCover(boolean hasHardCover) {
		this.hasHardCover = hasHardCover;
	}

}
