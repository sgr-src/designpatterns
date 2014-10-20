package soreco.training.designpatterns.creational.builder.test;


import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import soreco.training.designpatterns.creational.builder.Armor;
import soreco.training.designpatterns.creational.builder.HairColor;
import soreco.training.designpatterns.creational.builder.HairType;
import soreco.training.designpatterns.creational.builder.Hero;
import soreco.training.designpatterns.creational.builder.Hero.HeroBuilder;
import soreco.training.designpatterns.creational.builder.Profession;
import soreco.training.designpatterns.creational.builder.Weapon;

public class BuilderTest {    
    
    @Before
    public void init(){        
    }
    
    @Test
    public void testBuildMage(){
        Hero mage = 
                new HeroBuilder(Profession.MAGE, "Riobard")
                        .withHairColor(HairColor.BLACK)
                        .withWeapon(Weapon.DAGGER)
                        .build();
        
        assertTrue(mage instanceof Hero);
    }    
    
    @Test
    public void testBuildWarrior(){
        Hero warrior = 
                new HeroBuilder(Profession.WARRIOR, "Amberjill")
                        .withHairColor(HairColor.BLOND)
                        .withHairType(HairType.LONG_CURLY)
                        .withArmor(Armor.CHAIN_MAIL)
                        .withWeapon(Weapon.SWORD)
                        .build();
        
        assertTrue(warrior instanceof Hero);
    }
    
    @Test
    public void testBuildThief(){
        Hero thief = 
                new HeroBuilder(Profession.THIEF, "Desmond")
                        .withHairType(HairType.BALD)
                        .withWeapon(Weapon.BOW)
                        .build();
	
        assertTrue(thief instanceof Hero);        
    }   
}
