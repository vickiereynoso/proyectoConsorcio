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
		
		for(int i=0 ; i<=cantDptos; i++) {
			this.departamentos.add(new Departamento(i));
			System.out.println("Unidad "+i+ " creada.");
			
		}
	}

	public void habitarUnidad(int nroUnidad, String dniPropietario, String nombrePropietario) {
		if(buscarDpto(nroUnidad)== null) {
			System.out.println("Unidad inexistente.");	
		}else if(buscarDpto(nroUnidad).getNroUnidad() == nroUnidad && buscarDpto(nroUnidad).getDniPropietario()== null && buscarDpto(nroUnidad).getNombrePropietario()== null) {
			this.departamentos.get(nroUnidad).setDniPropietario(dniPropietario);
			this.departamentos.get(nroUnidad).setNombrePropietario(nombrePropietario);
			System.out.println("Alta de unidad exitosa! "+this.departamentos.get(nroUnidad));
		}else {
			System.out.println("La unidad se encuentra actualmente habitada.");
			System.out.println("Estas otras unidades se encuentran libres:");
			for(Departamento d : buscarUnidadesLibres()) {
				System.out.println(d);
			}
		}
	}
	
	public void agregarDeuda(int nroUnidad, double importe) {
		if(nroUnidad <0 || nroUnidad > this.departamentos.size()) {
			System.out.println("N�mero de unidad inexistente.");	
		}else if(importe < 0) {
			System.out.println("El importe no puede ser negativo.");
		}else if(buscarDpto(nroUnidad)==null){
				System.out.println("La unidad no existe.");
		}else {
			buscarDpto(nroUnidad).setMoroso(true);
			buscarDpto(nroUnidad).setDeuda(importe);
			this.morosos.add(buscarDpto(nroUnidad));
			System.out.println("Deuda actualizada."+ "/n" + "La unidad " + nroUnidad+ " se encuentra ahora en la lista de morosos.");
		}
		
	}
	
	public void cancelarDeuda(int nroUnidad, double importe) {
		if(nroUnidad <0 || nroUnidad > this.departamentos.size()) {
			System.out.println("N�mero de unidad inexistente.");	
		}else if(importe < 0) {
			System.out.println("El importe no puede ser negativo.");
		}else if(buscarDpto(nroUnidad)==null){
				System.out.println("La unidad no existe.");
		}else {
			buscarDpto(nroUnidad).setDeuda(-(importe));
			if(buscarDpto(nroUnidad).getDeuda() == 0){
				buscarDpto(nroUnidad).setMoroso(false);
				this.morosos.remove(nroUnidad);
				System.out.println("Deuda actualizada.");
				System.out.println("Su deuda actual es $"+ buscarDpto(nroUnidad).getDeuda());
				System.out.println("La unidad "+nroUnidad + "ha sido removida de la lista de morosos.");
			}
			System.out.println("Deuda actualizada.");
			System.out.println("Su deuda actual es $"+ buscarDpto(nroUnidad).getDeuda());
		}		
	}
	
	public void listarMorosos() {
		for(Departamento d: this.morosos) {
			System.out.println(d);
		}
	}
	
	public void listarUnidades() {
		for(Departamento d: this.departamentos) {
			System.out.println(d);
		}
	}
	
	
	private Departamento buscarDpto(int nroUnidad) {
		Departamento dptoBuscado = null;
		int i = 0;
		while(i<this.departamentos.size() && dptoBuscado==null) {
			if(this.departamentos.get(i).getNroUnidad() == nroUnidad) {
				dptoBuscado = this.departamentos.get(i);
			}else {
				i++;
			}
		}
		return dptoBuscado;
	}
	
	private ArrayList<Departamento> buscarUnidadesLibres() {
		ArrayList<Departamento> unidadesLibres = new ArrayList<>();
		for(Departamento d : this.departamentos) {
			if(d.getDniPropietario()== null && d.getNombrePropietario()==null && d.isMoroso()==false) {
				unidadesLibres.add(d);
			}
		}
		return unidadesLibres;
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
