package cl.tyrell.objeto;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	public static void main(String[] args)
	{
		Persona p = new Persona();
		List<Persona> listap = new ArrayList<Persona>();
		
		ListPersona lista = new ListPersona();
		
		p.setId(100);
		p.setNombre("Guillermo");
		p.setApellido("Basualto");
		listap.add(p);
		
		lista.setListaPersona(listap);
		
		lista.listarPersonas();
		
	}
}
