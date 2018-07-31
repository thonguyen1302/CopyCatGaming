package game;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon axe = new Axe(50, 65, 20, 10);
		Warrior warrior = new Warrior(10, axe);
		
		System.out.println("Punch Minimum " + warrior.weapon.getPunch().getMinimum() + " ");
		System.out.println("Punch Maximum " + warrior.weapon.getPunch().getMaximum());
		
		System.out.println("Punch DPS " + warrior.weapon.getPunchDPS());
		
		System.out.println("Smite Minimum " + warrior.weapon.getSmite().getMinimum() + " ");
		System.out.println("Smite Maximum " + warrior.weapon.getSmite().getMaximum());
		
		System.out.println("Smite DPS " + warrior.weapon.getSmiteDPS());
		
		System.out.println("Cleave " + warrior.weapon.getCleave().getMinimum() + " ");
		System.out.println("Cleave " + warrior.weapon.getCleave().getMaximum());
		
		System.out.println("Cleave DPS " + warrior.weapon.getCleaveDPS());
	}

}
