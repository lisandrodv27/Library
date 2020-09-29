package library;

public class Journal extends Item {
	
	private String theme;
	
	public Journal(int noOfPages, String writerSurname, int itemAge, String theme) {
		super(noOfPages, writerSurname, itemAge);
		this.theme = theme;
	}
	
	@Override
	public int leaseDaysGiven() {
		return 15;
	}
	
	//getters & setters
		public String getTheme() {
			return theme;
		}
		
		public void setTheme(String theme) {
			this.theme = theme;
		}

}
