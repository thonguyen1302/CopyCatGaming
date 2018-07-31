package game;

public class Cleave extends Skill {
	// Attacks at 90% of weapon’s APS for 120% of the weapon’s DMG as Cold.
	double percentAPS = 0.9;
	double percentDMG = 1.2;
	
	public Cleave(double minimum, double maximum, double APS) {
		super(minimum, maximum, APS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMinimum() {
		// TODO Auto-generated method stub
		return minimum * percentDMG;
	}

	@Override
	public double getMaximum() {
		// TODO Auto-generated method stub
		return (maximum + (maximum * 0.04)) * percentDMG;
	}
	
	public double getPercentAPS() {
		// TODO Auto-generated method stub
		return percentAPS;
	}
	
}
