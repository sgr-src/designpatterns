package soreco.training.designpatterns.creational.prototype.test;

import org.junit.Before;
import org.junit.Test;
import soreco.training.designpatterns.creational.prototype.Beast;
import soreco.training.designpatterns.creational.prototype.HeroFactory;
import soreco.training.designpatterns.creational.prototype.HeroFactoryImpl;
import soreco.training.designpatterns.creational.prototype.Mage;
import soreco.training.designpatterns.creational.prototype.Warlord;

public class PrototypeTest {
    
    HeroFactory factory;
    Mage mage;
    Warlord warlord;
    Beast beast;   
    
    @Before
    public void init(){
             
    }
    
    /**
     * ELFs
     */    
    @Test
    public void testPrototypeElf(){        
        factory = 
                new HeroFactoryImpl( new ElfMage(), new ElfWarlord(), new ElfBeast());		
        mage = factory.createMage();
	warlord = factory.createWarlord();
	beast = factory.createBeast();
                
        AssertNotNull(mage);        
        AssertNotNull(warlord);
        AssertNotNull(beast);
    }
    
    /**
     * ORCs
     */    
    @Test
    public void testOrcPrototype(){
        factory = 
                new HeroFactoryImpl(new OrcMage(), new OrcWarlord(), new OrcBeast());
		mage = factory.createMage();
		warlord = factory.createWarlord();
		beast = factory.createBeast();
        
        AssertNotNull(mage);        
        AssertNotNull(warlord);
        AssertNotNull(beast);
    }
    
}
