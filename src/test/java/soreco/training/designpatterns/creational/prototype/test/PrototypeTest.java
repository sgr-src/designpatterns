package soreco.training.designpatterns.creational.prototype.test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import soreco.training.designpatterns.creational.prototype.Beast;
import soreco.training.designpatterns.creational.prototype.ElfBeast;
import soreco.training.designpatterns.creational.prototype.ElfMage;
import soreco.training.designpatterns.creational.prototype.ElfWarlord;
import soreco.training.designpatterns.creational.prototype.HeroFactory;
import soreco.training.designpatterns.creational.prototype.HeroFactoryImpl;
import soreco.training.designpatterns.creational.prototype.Mage;
import soreco.training.designpatterns.creational.prototype.OrcBeast;
import soreco.training.designpatterns.creational.prototype.OrcMage;
import soreco.training.designpatterns.creational.prototype.OrcWarlord;
import soreco.training.designpatterns.creational.prototype.Warlord;

public class PrototypeTest {
    
    HeroFactory elfFactory;
    HeroFactory orcFactory;
    Mage mage;
    Warlord warlord;
    Beast beast;   
    
    @Before
    public void init(){
        
        elfFactory = 
                new HeroFactoryImpl( 
                        new ElfMage(), 
                        new ElfWarlord(), 
                        new ElfBeast());        
        orcFactory = 
                 new HeroFactoryImpl(
                         new OrcMage(), 
                         new OrcWarlord(), 
                         new OrcBeast());             
    }
    
    /**
     * ELFs
     */     
    @Test 
    public void testCreateElfMage() {        
        mage = elfFactory.createMage();        
        
        assertTrue(mage instanceof ElfMage);        
    }
    
    @Test 
    public void testCreateElfBeast() {        
        beast = elfFactory.createBeast();        
        
        assertTrue(beast instanceof ElfBeast);        
    }
    
    @Test 
    public void testCreateElfWarlord() {        
        warlord = elfFactory.createWarlord();        
        
        assertTrue(warlord instanceof ElfWarlord);        
    }
    
    /**
     * ORCs
     */    
    @Test 
    public void testCreateOrcMage() {        
        mage = orcFactory.createMage();        
        
        assertTrue(mage instanceof OrcMage);        
    }
    
   @Test 
    public void testCreateOrcBeast() {        
        beast = orcFactory.createBeast();        
        
        assertTrue(beast instanceof OrcBeast);        
    }
 
     @Test 
    public void testCreateOrcWarlord() {        
        warlord = orcFactory.createWarlord();        
        
        assertTrue(warlord instanceof OrcWarlord);        
    }
    
}
