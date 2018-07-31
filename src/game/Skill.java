package game;

public abstract class Skill {
	public double minimum;
	public double maximum;
	public double APS;
	
	public Skill(double minimum, double maximum, double APS) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.APS = APS;
	}

	public abstract double getMinimum();

	public abstract double getMaximum();
	
	public double getPercentAPS();
	
}
