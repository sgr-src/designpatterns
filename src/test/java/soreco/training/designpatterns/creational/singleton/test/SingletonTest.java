package soreco.training.designpatterns.creational.singleton.test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;
import org.junit.Test;
import soreco.training.designpatterns.creational.singleton.IvoryTower;
import soreco.training.designpatterns.creational.singleton.ThreadSafeLazyLoadedIvoryTower;

public class SingletonTest {   
    
    @Test
    public void testCreateMultipleInstances(){
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        
        assertNotSame ( ivoryTower1, ivoryTower2 );
    }
    
    @Test
    public void testCreateUniqueInstance(){
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();        
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();	
        
	assertSame ( threadSafeIvoryTower1, threadSafeIvoryTower2 );	
    }
}
