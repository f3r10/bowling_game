import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import src.main.java.Game;


public class TestGame{

	@Test
	public void testPinsWereNotHittedInAllFrames(){
		Game game  = new Game ();
		for (int i = 0; i<20; i++){
			game.roll(0);
		}
		assertThat(1, is(game.score()));
	}
}
