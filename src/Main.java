import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Soldado s1 = new Soldado(TipoSoldado.hondero,2,3);
		Soldado s2 = new Soldado(TipoSoldado.hoplita,4,2);
		Soldado s3 = new Soldado(TipoSoldado.caballero,3,9);
		Soldado s4 = new Soldado(TipoSoldado.hoplita,3,9);
		Soldado s5 = new Soldado(TipoSoldado.lanzajabalina,5,2);
		Soldado s6 = new Soldado(TipoSoldado.arquero,1,8);
		Soldado s7 = new Soldado(TipoSoldado.hoplita,7,3);
		Armada arm = new Armada();
		arm.agregar(s1);
		arm.agregar(s2);
		arm.agregar(s3);
		arm.agregar(s4);
		arm.agregar(s5);
		arm.agregar(s6);
		arm.agregar(s7);
		List<Soldado> form1 = arm.formacionUno();
		List<Soldado> form2 = arm.formacionDos();
		List<Soldado> form3 = arm.formacionTres();
//		Iterator<Soldado> it1 = form1.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next().getRango());
//		}
//		Iterator<Soldado> it2 = form2.iterator();
//		while(it2.hasNext()){
//			System.out.println(it2.next().getVelocidad());
//		}
//		Iterator<Soldado> it3 = form3.iterator();
//		Soldado aux;
//		while(it3.hasNext()){
//			aux = it3.next();
//			System.out.println(aux.getNombre() + " Rango: " + aux.getRango());
//		}
		Map<TipoSoldado,List<Soldado>> map = arm.agrupar();
		for(TipoSoldado key : map.keySet()){
			System.out.println(key.toString() + " " + map.get(key).toString());
		}
	}

}
