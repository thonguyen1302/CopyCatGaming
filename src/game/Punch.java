package game;

public class Punch extends Skill {
	// Attacks at 100% of weapon’s APS for 100% of the weapon’s DMG as Physical.
	double percentAPS = 1;
	double percentDMG = 1;

	public Punch(double minimum, double maximum, double APS) {
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
		return maximum * percentDMG + (maximum * 0.04);
	}

	public double getPercentAPS() {
		// TODO Auto-generated method stub
		return percentAPS;
	}

}
