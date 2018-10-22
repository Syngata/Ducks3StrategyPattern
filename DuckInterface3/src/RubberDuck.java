
public class RubberDuck extends Duck{

	public RubberDuck(){
		
		flyBeh= new FlyNoWay();
		quackBeh= new Squeek();
	}

	@Override
	protected void diplay() {
		// TODO Auto-generated method stub
		System.out.println("I am a RubbeDuck");
	}
}
