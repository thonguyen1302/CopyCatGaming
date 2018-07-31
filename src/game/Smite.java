package game;

public class Smite extends Skill {
	//	Attacks at 120% of weapon’s APS for 90% of the weapon’s DMG as Fire.
	double percentAPS = 1.2;
	double percentDMG = 0.9;
	
	public Smite(double minimum, double maximum, double APS) {
		super(minimum, maximum, APS);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getMinimum() {
		return (minimum * percentDMG) + (((minimum * percentDMG)) * 0.1);
	}

	public double getMaximum() {
		double baseMaximum = maximum * percentDMG;
		baseMaximum = baseMaximum + (baseMaximum * 0.1);
		baseMaximum = baseMaximum + (baseMaximum * 0.04);
		return baseMaximum;
	}
	
	public double getPercentAPS() {
		// TODO Auto-generated method stub
		return percentAPS;
	}
	
}
