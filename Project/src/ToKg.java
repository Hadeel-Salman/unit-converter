
public class ToKg extends Transfer {
	
	@Override
	public Double Trans(int unit) {
		double x = unit*0.453;
		return x;
	}
}
