package soreco.training.designpatterns.creational.singleton;

public class IvoryTower {

	private static IvoryTower instance;// = new IvoryTower();

	private IvoryTower() {
	}

	public static IvoryTower getInstance() {
		
            instance = new IvoryTower();
            return instance;
	}
}
