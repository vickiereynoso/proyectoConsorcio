package proyectoConsorcio;

import java.util.ArrayList;

public class Edificio {

	private String direccion;
	private int cantDptos;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Departamento> morosos;
	
	public Edificio(String direccion, int cantDptos) {
		super();
		this.direccion = direccion;
		this.cantDptos = cantDptos;
		this.departamentos = new ArrayList<>();
		this.morosos = new ArrayList<>();
		
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCantDptos() {
		return cantDptos;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public ArrayList<Departamento> getMorosos() {
		return morosos;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCantDptos(int cantDptos) {
		this.cantDptos = cantDptos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public void setMorosos(ArrayList<Departamento> morosos) {
		this.morosos = morosos;
	}

	@Override
	public String toString() {
		return "Edificio [direccion=" + direccion + ", cantDptos=" + cantDptos + ", departamentos=" + departamentos
				+ ", morosos=" + morosos + "]";
	}
	
	
	
}
