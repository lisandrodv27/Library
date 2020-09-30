package library;

import java.awt.List;
import java.util.ArrayList;

public class Library {

	java.util.List<Item> items = new ArrayList<>();
	java.util.List<People> members = new ArrayList<>();

	public Library() {
		super();
	}

	public String checkItemIn(Item item) {
		return item.getClass().getSimpleName() + "has been checked in!";
	}

	public String checkItemOut(Item item) {
		return item.getClass().getSimpleName() + "has been checked out!";
	}

	public boolean addItem(Item item) {
		checkItemIn(item);
		return items.add(item);

	}

	public boolean removeItem(Item item) {
		checkItemOut(item);
		return items.remove(item);

	}

	public boolean removePeople(People people) {
		return members.remove(people);
	}

	public void registerPeople(People people) {
		People people1 = new People("Jon", "Jones", 35);
		People people2 = new People("Jack", "Gonzalez", 28);

	}

}
