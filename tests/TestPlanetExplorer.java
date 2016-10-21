import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	char direction;

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	@Test
	public void test_Facing_North_on_start() {
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		direction = rover.getDirection();
		assertEquals("Should be facing North", 'N', direction);
	}
	@Test
	public void test_turnPlanetExplorer(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		assertEquals("Should be facing North", 'N', direction);
	}
}
