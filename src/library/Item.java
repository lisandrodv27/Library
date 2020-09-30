package library;

import java.util.HashMap;
import main.Runner;

public abstract class Item {

	private int noOfPages;
	private String writerSurname;
	private int itemAge;
	private static int itemID = 0;
	private final int id;
	

	public Item() {
		super();
		this.id = ++itemID;
	}

	public Item(int noOfPages, String writerSurname, int itemAge) {
		super();
		this.noOfPages = noOfPages;
		this.writerSurname = writerSurname;
		this.itemAge = itemAge;
		this.id = ++itemID;
	}

	public int leaseDaysGiven() {
		return 30;
	}

	

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

	public int getId() {
		return id;
	}
	
	

}