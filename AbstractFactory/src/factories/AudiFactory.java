package factories;
import headlight.AudiHeadLight;
import headlight.Headlight;
import tire.AudiTire;
import tire.Tire;

public class AudiFactory extends Factory{
	
	@Override
	public Headlight makeHeadlight()
	{
		return new AudiHeadLight();
	}

	@Override
	public Tire makeTire() 
	{
		return new AudiTire();
	}

}
