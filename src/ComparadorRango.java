import java.util.Comparator;

public class ComparadorRango implements Comparator<Soldado> {

	@Override
	public int compare(Soldado o1, Soldado o2) {
		
		return o2.getRango() - o1.getRango();
	}

}
