package navigation;

import static org.hamcrest.Matchers.emptyIterable;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PirateTest {
	Pirate wimund;

	@Test
	public void test() {
		
		     wimund = new Pirate("Wimund", 60);
		     
		     
		     
		     
		     assertThat(Navire.getEquipage(), emptyIterable());
		  
		     
		}
	}


