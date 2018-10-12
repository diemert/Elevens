/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// card 1
		Card one  = new Card("ace", "spades", 1);
		System.out.println("Card 1 suit: " + one.suit());
		System.out.println("Card 1 rank: " + one.rank());
		System.out.println("Card 1 point: " + one.pointValue());
		
		// card 2
		Card two  = new Card("ace", "spades", 1);
		System.out.println("Card 2 suit: " + two.suit());
		System.out.println("Card 2 rank: " + two.rank());
		System.out.println("Card 2 point: " + two.pointValue());
		System.out.println("Card 1 matches matches card 2: " + one.matches(two));
		
		// card 3
		Card three  = new Card("queen", "spades", 12);
		System.out.println("Card 3 suit: " + three.suit());
		System.out.println("Card 3 rank: " + three.rank());
		System.out.println("Card 3 point: " + three.pointValue());
		System.out.println("Card 3 matches matches card 2: " + three.matches(two));
	}
}
