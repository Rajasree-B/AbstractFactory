package factories;
import headlight.Headlight;
import tire.Tire;

public abstract class Factory {
	
	public abstract Headlight makeHeadlight();
	public abstract Tire makeTire();

}
