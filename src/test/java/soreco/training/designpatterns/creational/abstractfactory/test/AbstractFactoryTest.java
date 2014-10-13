package soreco.training.designpatterns.creational.abstractfactory.test;

import org.junit.Before;
import org.junit.Test;
import soreco.training.designpatterns.creational.abstractfactory.*;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sergej Grebenjuk on 08.10.14.
**/ 
public class AbstractFactoryTest {

    @Before
    public void init () {

    }
    
    /**
     * Elf Kingdom
     */

    @Test
    public void testCreateElfKingdomSize () {
        
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
    public void testCreateElfKingdomKing () {
        KingdomFactory factory = new ElfKingdomFactory();
        King king = factory.createKing();
        assertTrue(king instanceof ElfKing);
    }
    
    @Test
    public void testCreateElfKingdomCastle () {
        KingdomFactory factory = new ElfKingdomFactory();
        Castle castle = factory.createCastle();
        assertTrue(castle instanceof ElfCastle);
    }
    
    @Test
    public void testCreateElfKingdomArmy () {
        KingdomFactory factory = new ElfKingdomFactory();
        Army army = factory.createArmy();
        assertTrue(army instanceof ElfArmy);
    }
    
    /**
     * Orc Kingdom
     */

    @Test
    public void testCreateOrcKingdomSize () {

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
    
    @Test
    public void testCreateOrcKingdomKing () {
        KingdomFactory factory = new OrcKingdomFactory();
        King king = factory.createKing();
        assertTrue(king instanceof OrcKing);
    }
    
    @Test
    public void testCreateOrcKingdomCastle () {
        KingdomFactory factory = new OrcKingdomFactory();
        Castle castle = factory.createCastle();
        assertTrue(castle instanceof OrcCastle);
    }
    
    @Test
    public void testCreateOrcKingdomArmy () {
        KingdomFactory factory = new OrcKingdomFactory();
        Army army = factory.createArmy();
        assertTrue(army instanceof OrcArmy);
    }
}

