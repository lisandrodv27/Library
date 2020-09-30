package main;

import library.Book;
import library.Item;
import library.Journal;
import library.Library;
import library.Theses;

public class Runner {

	public static void main(String[] args) {
		Item book1 = new Book(200, "Smith", 10, true);
		Item theses1 = new Theses(150, "Garcia", 3, 10);
		Item journal1 = new Journal(50, "Bailey", 30, "Political Ecology");
		Item journal2 = new Journal(5, "Baruah", 1, "Software Engineering");

		Library library = new Library();

		library.addItem(book1);
		library.addItem(theses1);
		library.addItem(journal1);

		library.removeItem(journal2);

		System.out.println(library.getClass().getSimpleName());
		
		for (int i = 0, i < items.size(), i++) {
			System.out.println(items.get(i));
			
		}

	}

}
