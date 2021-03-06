import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	char direction;
	@Test
	public void test_Facing_North_on_start() {
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		direction = rover.getDirection();
		assertEquals("Should be facing North", 'N', direction);
	}//a
	@Test
	public void test_turnPlanetExplorerLeft(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		rover.executeCommand("l");
		direction = rover.getDirection();
		assertEquals("Should be facing West", 'W', direction);
	}	
	@Test
	public void test_turnPlanetExplorerLeftTwice(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		rover.executeCommand("ll");
		direction = rover.getDirection();
		assertEquals("Should be facing South", 'S', direction);
	}	
	@Test
	public void test_turnFullCircleLeftplus1(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		rover.executeCommand("llll");
		direction = rover.getDirection();
		assertEquals("Should be facing West", 'W', direction);
	}
}
