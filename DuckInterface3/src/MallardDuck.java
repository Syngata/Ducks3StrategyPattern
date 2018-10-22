
public class MallardDuck extends Duck{

	@Override
	protected void diplay() {
		// TODO Auto-generated method stub
		System.out.println("I am a MallardDuck");
	}
	
 public MallardDuck() {
	 flyBeh = new FlyWithWings();
	 quackBeh= new Quack();
	 
 }

	
}
