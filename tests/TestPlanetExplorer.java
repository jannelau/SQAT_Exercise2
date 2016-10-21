import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	char direction;
	@Test
	public void test_Facing_North_on_start() {
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		direction = rover.getDirection();
		assertEquals("Should be facing North", 'N', direction);
	}
	@Test
	public void test_turnPlanetExplorerLeft(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		rover.executeCommand("l");
		direction = rover.getDirection();
		assertEquals("Should be facing West", 'W', direction);
	}	@Test
	public void test_turnPlanetExplorerLeftTice(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		rover.executeCommand("ll");
		direction = rover.getDirection();
		assertEquals("Should be facing West", 'S', direction);
	}
}
