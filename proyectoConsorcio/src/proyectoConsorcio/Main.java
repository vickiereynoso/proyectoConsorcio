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
		e.habitarUnidad(1,"123456" , "Juan Gómez"); //Repetido.
		e.habitarUnidad(-8,"123456" , "Juan Gómez"); //Tiene que dar error.
		e.habitarUnidad(11,"123456" , "Juan Gómez");
		
    
	}

}
