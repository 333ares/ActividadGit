package ActividadGit;

public class ActividadGit {

	public static void main(String[] args) {

		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		int resultado = 0;
		
		// User 1 fer la suma dels elements de sumArray
				
		int resultadoSuma = 0; //Creamos la variable para almacenar el resultado.

		for (int i = 0; i < sumArray.length; i++) {
			resultadoSuma = resultadoSuma + sumArray[i];
		}
		
		System.out.print("Tus números sumados dan " + resultadoSuma);
		
		// User 2 fer la resta dels elements de subArray
		
		int resultadosub = 0;//Creamos la variable
		
		for (int i = 0; i < prodArray.length; i++) {
			resultadosub = resultadosub + subArray[i];
		}
		
	System.out.print("Los números restados son igual: " +  resultadosub);
		// User 3 fer la multiplicació dels elements de prodArray
	
	int resultadoprod = 0;
	
	for (int i = 0; i < prodArray.length; i++) {
		resultadoprod = resultadoprod + prodArray[i];
	}
	System.out.print("Los números multiplicados son igual: " + resultadoprod);
	}

}
