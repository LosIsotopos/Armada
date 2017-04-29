import java.util.Comparator;

public class ComparadorTipo implements Comparator<Soldado> {

	@Override
	public int compare(Soldado s0, Soldado s1) {
		
		return s0.getNombre().compareTo(s1.getNombre());
	}

}
