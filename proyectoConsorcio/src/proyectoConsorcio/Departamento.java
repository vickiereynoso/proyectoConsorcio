package proyectoConsorcio;

public class Departamento {

	private int nroUnidad;
	private String dniPropietario;
	private String nombrePropietario;
	private double deuda = 0;
	private boolean moroso = false;
	
	public Departamento(int nroUnidad, String dniPropietario, String nombrePropietario) {
		super();
		this.nroUnidad = nroUnidad;
		this.dniPropietario = dniPropietario;
		this.nombrePropietario = nombrePropietario;
	}
	
	public Departamento(int nroUnidad) {
		super();
		this.nroUnidad = nroUnidad;
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

	public double getDeuda() {
		return deuda;
	}

	public boolean isMoroso() {
		return moroso;
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

	public void setDeuda(double deuda) {
		this.deuda =+ deuda;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	@Override
	public String toString() {
		return "Departamento [nroUnidad=" + nroUnidad + ", dniPropietario=" + dniPropietario + ", nombrePropietario="
				+ nombrePropietario + ", deuda=" + deuda + ", moroso=" + moroso + "]";
	}

	
	
}