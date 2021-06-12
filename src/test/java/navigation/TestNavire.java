package navigation;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNavire {
	private Navire monBeauNavire;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
    public void ajoutMarin() {

        Marin surcouf = new Marin("surcouf") ;
        Marin jeanbart = new Marin("jeanbart") ;

        monBeauNavire = new Navire() ;
        monBeauNavire.ajoutMarin(surcouf);
        monBeauNavire.ajoutMarin(jeanbart);

        assertThat(monBeauNavire.getEquipage(), hasItems(surcouf));
        assertThat(monBeauNavire.getEquipage(), containsInAnyOrder(surcouf,jeanbart)) ;


    }

}
