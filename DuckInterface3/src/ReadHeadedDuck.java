
public class ReadHeadedDuck extends Duck{

	public ReadHeadedDuck() {
		flyBeh = new FlyWithWings();
		quackBeh= new Quack();
		
	}

	@Override
	protected void diplay() {
		// TODO Auto-generated method stub
		System.out.println("I am ReadHeadedDuck");
	}
}
