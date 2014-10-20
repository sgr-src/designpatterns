package soreco.training.designpatterns.creational.prototype;

public abstract class Beast extends Prototype {
    
    @Override
	public abstract Beast clone() throws CloneNotSupportedException;
    
}
