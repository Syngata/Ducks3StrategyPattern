
public abstract class Duck {
	
	FlyBehavior flyBeh;
	
	QuackBehavior quackBeh;
	
	public void performQuack() {
		quackBeh.quack();
	}
	
	protected void performFly() {
		flyBeh.fly();
	}
	
	protected void swim() {
		System.out.println("I am swimming");
	}
	
	protected abstract void diplay();
	
}
