import javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MallardDuck md = new MallardDuck();
		DecoyDuck dd = new DecoyDuck();
		
		dd.performFly();
		dd.setFlyBehavior(new MehanicalDuck());
		dd.performFly();
	}

}
