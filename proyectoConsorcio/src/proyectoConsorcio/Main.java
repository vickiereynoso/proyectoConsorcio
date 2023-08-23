package proyectoConsorcio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Edificio e = new Edificio("Libertador 5275 ",10);
		System.out.println("");
		//System.out.println(e);
		System.out.println("");
		e.listarUnidades();
		System.out.println("");
		e.habitarUnidad(1,"123456" , "Juan Gómez");
		e.habitarUnidad(1,"123456" , "Juan Gómez"); //Tiene que dar error. Repetido.
		e.habitarUnidad(-8,"123456" , "Juan Gómez"); //Tiene que dar error. Número negativo.
		e.habitarUnidad(11,"123456" , "Juan Gómez"); //Tiene que dar error. El edificio tiene sólo 10 unidades.
		e.habitarUnidad(5,"654321" , "María Laura Ybañez");
		e.habitarUnidad(9,"111111" , "Evangelina Suárez");
		e.habitarUnidad(3,"223344" , "Ignacio Méndez");
		System.out.println("-----------------------------");
		e.agregarDeuda(-1, 2000); //Tiene que dar error. Número negativo.
		e.agregarDeuda(11, 2000); //Tiene que dar error. El edificio tiene sólo 10 unidades.
		e.agregarDeuda(1, -2000); //Tiene que dar error. El importe no puede ser negativo.
		e.agregarDeuda(1, 5000);
		e.agregarDeuda(1, 300);
		System.out.println("");
		e.listarMorosos();
		System.out.println("");
		e.cancelarDeuda(1, 300);
		e.cancelarDeuda(1, 5000);
		//e.agregarDeuda(1, 5000);
		e.agregarDeuda(2, 300); //Tiene que dar error. No se puede asignar deuda a un dpto no habitado.
		System.out.println("");
		e.listarMorosos();
		System.out.println("");
		
	}

}
