
public class DecoyDuck extends Duck{

	public DecoyDuck() {
		flyBeh= new FlyNoWay();
		quackBeh= new MuteQuack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBeh= fb;
	}

	@Override
	protected void diplay() {
		// TODO Auto-generated method stub
		System.out.println("I am a decoyDuck");
	}
}
