package factories;
import headlight.Headlight;
import headlight.MercedesHeadLight;
import tire.MercedesTire;
import tire.Tire;

public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {

		return new MercedesHeadLight();
	}

	@Override
	public Tire makeTire() {

		return new MercedesTire();
	}

}
