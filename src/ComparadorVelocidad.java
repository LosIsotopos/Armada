import java.util.Comparator;

public class ComparadorVelocidad implements Comparator<Soldado> {

	@Override
	public int compare(Soldado o1, Soldado o2) {
		
		return o1.getVelocidad() - o2.getVelocidad();
	}

}
