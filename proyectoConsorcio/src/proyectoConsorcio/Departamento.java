package proyectoConsorcio;

public class Departamento {

	private int nroUnidad;
	private String dniPropietario;
	private String nombrePropietario;
	private boolean moroso = false;
	
	
	
	
	public Departamento(int nroUnidad, String dniPropietario, String nombrePropietario) {
		super();
		this.nroUnidad = nroUnidad;
		this.dniPropietario = dniPropietario;
		this.nombrePropietario = nombrePropietario;
	}
	public void setNroUnidad(int nroUnidad) {
		this.nroUnidad = nroUnidad;
	}
	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}
	public int getNroUnidad() {
		return nroUnidad;
	}
	public String getDniPropietario() {
		return dniPropietario;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public boolean isMoroso() {
		return moroso;
	}
	@Override
	public String toString() {
		return "Departamento [nroUnidad=" + nroUnidad + ", dniPropietario=" + dniPropietario + ", nombrePropietario="
				+ nombrePropietario + ", moroso=" + moroso + "]";
	}
	
	
	
}
