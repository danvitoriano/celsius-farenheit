import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		List<String> stocks = new ArrayList<>();
		stocks.add("ORCL");
		stocks.add("AAPL");
		stocks.add("GOOG");
		stocks.add("IBM");
		stocks.add("MCD");
		System.out.println("stocks: " + stocks);
		stocks.remove(3);
		System.out.println("stocks new: " + stocks);
	}

}
