package cl.tyrell.objeto;

import java.util.ArrayList;
import java.util.List;

public class ListPersona {
	
	private List<Persona> listaPersona;
	
	public ListPersona()
	{
		listaPersona = new ArrayList<Persona>();		
	}
	
	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}
	
	public void listarPersonas(){
		
		for(Persona per : listaPersona)
		{
			System.out.println("ID : " + per.getId());
			System.out.println("Nombre : " + per.getNombre());
			System.out.println("Apellido : " + per.getApellido());
		}
	}
}
