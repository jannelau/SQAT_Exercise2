import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	@Test
	public void test_createPlanetExplorerLanding() {
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
		rover.getDirection()
		assertEquals("Should be facing North", "N", direction);
	}
	@Test
	public void test_turnPlanetExplorer(){
		PlanetExplorer rover = new PlanetExplorer(500,500, "idk");
	}
}
