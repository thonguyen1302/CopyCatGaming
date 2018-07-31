package game;

public abstract class Weapon {
	public double APS = 0;
	public double minimum;
	public double maximum;	
	public double STR;
	public int level;
	public Skill punch;
	public Skill smite;
	public Skill cleave;
	
	public Weapon(double minimum, double maximum, double sTR, int level) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.STR = sTR;
		this.level = level;
	}
	
	public Skill getPunch() {
		return punch;
	}
	
	public double getPunchDPS() {
		return 0;
	}

	public Skill getSmite() {
		return smite;
	}
	
	public double getSmiteDPS() {
		return 0;
	}

	public Skill getCleave() {
		return cleave;
	}
	
	public double getCleaveDPS() {
		return 0;
	}
}
