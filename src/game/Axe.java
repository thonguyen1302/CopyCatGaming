package game;

public class Axe extends Weapon {
	public double APS = 1.2;
	
	public Axe(double minimum, double maximum, double sTR, int level) {
		super(minimum, maximum, sTR, level);
		punch = new Punch(minimum + level, maximum + level, APS);
		smite = new Smite(minimum + level, maximum + level, APS);
		cleave = new Cleave(minimum + level, maximum + level, APS);
	}

	public double getPunchDPS() {
		return ((punch.getMinimum() + punch.getMaximum()) / 2) * (APS * punch.getPercentAPS());
	}
	
	public double getSmiteDPS() {
		return ((smite.getMinimum() + smite.getMaximum()) / 2) * (APS * smite.getPercentAPS());
	}
	
	public double getCleaveDPS() {
		return ((cleave.getMinimum() + cleave.getMaximum()) / 2) * (APS * cleave.getPercentAPS());
	}
		
}
