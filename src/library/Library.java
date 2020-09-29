package library;

import java.awt.List;
import java.util.ArrayList;

public class Library {
	
	java.util.List<Item> items = new ArrayList<>();
	
	public Library() {
		super();
	}
	
	public boolean addItem(Item item) {
		return items.add(item);
	}
	
	//public boolean removeItem(Item item) {
	//	return item.remove(item);
	//}


	//public float checkItemIn() {

	//}

	//public float checkItemOut() {

	//}
	

}
