package soreco.training.designpatterns.creational.singleton.test;

import org.junit.Before;
import org.junit.Test;
import soreco.training.designpatterns.creational.singleton.IvoryTower;
import soreco.training.designpatterns.creational.singleton.ThreadSafeLazyLoadedIvoryTower;

public class SingletonTest {
    
    @Before
    public void init(){        
    }   
    
    @Test
    public void testCreateMultipleInstances(){
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
	IvoryTower ivoryTower2 = IvoryTower.getInstance();        
        
        AssertTrue ( ivoryTower1 instanceof IvoryTower );
        AssertTrue ( ivoryTower2 instanceof IvoryTower );
    }
    
    @Test
    public void testCreateUniqueInstance(){
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = 
                ThreadSafeLazyLoadedIvoryTower
                .getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = 
                ThreadSafeLazyLoadedIvoryTower
                .getInstance();	
        
	AssertSame ( threadSafeIvoryTower1, threadSafeIvoryTower2 );	
    }
}
