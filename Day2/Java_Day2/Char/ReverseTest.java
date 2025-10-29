import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReverseTest {

	@Test
	
	public void testThatThereIsNoWordToReverse () {

	Reverse reverse = new Reverse ();
	
	int result = reverse.totalWordGiven();

	assertEquals(result, 0);

}

	@Test
	
	public void testThatAWordIsGivenToReverse () {

	Reverse reverse = new Reverse ();

	String response = reverse.addWord("abcdefd");

	assertEquals(response, "Word added successfully");	


}
	@Test 
	
	public void testThatThereIsAnOccurrenceOfCharInTheWord () {

	Reverse reverse = new Reverse ();

	String response = reverse.checkWord("abcdefd");

	assertEquals(response, "d");	


}
 
	@Test

	public void testThatTheGivenHasBeenReversed() {
	
	Reverse reverse = new Reverse ();

	String response = reverse.checkedWord("dcbaefd");
	
	assertEquals(response, "Reversed");

}


}
