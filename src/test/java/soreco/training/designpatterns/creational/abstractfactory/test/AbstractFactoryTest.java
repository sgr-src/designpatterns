package soreco.training.designpatterns.creational.abstractfactory.test;

import org.junit.Before;
import org.junit.Test;
import soreco.training.designpatterns.creational.abstractfactory.*;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sergej Grebenjuk on 08.10.14.
 */
public class AbstractFactoryTest {

    @Before
    public void init () {

    }

    @Test
    public void testCreateElfKingdom () {

        KingdomFactory factory = new ElfKingdomFactory();

        King king = factory.createKing();
        Castle castle = factory.createCastle();
        Army army = factory.createArmy();

        ArrayList<Object> elfKingdom = new ArrayList();

        elfKingdom.add(king);
        elfKingdom.add(castle);
        elfKingdom.add(army);

        assertTrue(elfKingdom.size() == 3);
    }

    @Test
    public void testCreateOrcKingdom () {

        KingdomFactory factory = new OrcKingdomFactory();

        King king = factory.createKing();
        Castle castle = factory.createCastle();
        Army army = factory.createArmy();

        ArrayList<Object> orcKingdom = new ArrayList();

        orcKingdom.add(king);
        orcKingdom.add(castle);
        orcKingdom.add(army);

        assertTrue(orcKingdom.size() == 3);
    }

}
