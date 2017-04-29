import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Armada {
	private List<Soldado> armada = new LinkedList<Soldado>();

	public void agregar(Soldado soldado){
		armada.add(soldado);
		
	}
	public List<Soldado> formacionUno(){
		Collections.sort(armada,new ComparadorRango());
		return armada;
	}
	public List<Soldado> formacionDos(){
		Collections.sort(armada,new ComparadorVelocidad());
		return armada;
	}
	public List<Soldado> formacionTres(){
		Collections.sort(armada,new ComparadorRango());
		Collections.sort(armada,new ComparadorTipo());
		return armada;
	}
	public Map<TipoSoldado,List<Soldado>> agrupar(){
		Iterator<Soldado> it = armada.iterator();
		Map<TipoSoldado,List<Soldado>> table = new HashMap<TipoSoldado,List<Soldado>>();
		Soldado aux;
		List<Soldado> listAux = new LinkedList<Soldado>();
		while(it.hasNext()){
			aux = it.next();
			table.put(aux.getNombre(), listAux);
		}
		return table;
	}
	public Set<Soldado> representantes(){
		return new HashSet<Soldado>(armada);
	}
}
