/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] regRanks = {"ace", "two", "three", "four", "five", "six", "seven", "eight",
				"nine", "ten", "jack", "queen", "king"};
		String[] regSuits = {"clubs", "diamonds", "spades", "hearts"};
		int[] regValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck one = new Deck(regRanks, regSuits, regValues);
		Deck two = new Deck(regRanks, regSuits, regValues);
		Deck three = new Deck(regRanks, regSuits, regValues);
		
		System.out.println("Deck one is empty: " + one.isEmpty());
		System.out.println("Deck one toString: ");
		System.out.println(one);
		
		System.out.println("Deck two is empty: " + two.isEmpty());
		System.out.println("Deck two toString: ");
		System.out.println(two);
		
		while (!three.isEmpty()) {
			three.deal();
		}
		
		
		
		System.out.println("Deck three is empty: " + three.isEmpty());
		System.out.println("Deck three toString: ");
		System.out.println(three);
	}
}
