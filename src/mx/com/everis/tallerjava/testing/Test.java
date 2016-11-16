package mx.com.everis.tallerjava.testing;

import mx.com.everis.tallerjava.excepciones.Excepcion;;

public class Test {
	private static int [] array = {1,2,1};
	
	public static void main(String [] args){
		System.out.println("Reglas del negocio:\n"
				+ "Un array no puede contener más de 5 elementos enteros.\n"
				+ "En un array no se pueden tener valores mayores a 9.\n"
				+ "Un array no puede contener valores negativos.\n\n");
		
		if(array.length > 5){
			try{
				throw new Excepcion();
			}catch(Excepcion e){
				e.printStackTrace();
				System.out.println("Un array no puede contener más de 5 elementos enteros.\n");
			}
		}else{
			boolean cumpleRegla2 = true;
			boolean cumpleRegla3 = true;
			for(int i = 0; i < array.length; i++){
				if(array[i]>9){
					cumpleRegla2 = false;
					break;				
				}
				if(array[i]<0){
					cumpleRegla3 = false;
					break;
				}
			}
			
			if(cumpleRegla2 == false){
				try{
					throw new Excepcion();
				}catch(Excepcion e){
					e.printStackTrace();
					System.out.println("En un array no se pueden tener valores mayores a 9.\n");
				}
			}else{
					if(cumpleRegla3 == false){
					try{
						throw new Excepcion();
					}catch(Excepcion e){
						e.printStackTrace();
						System.out.println("Un array no puede contener valores negativos.");
					}
				}else{
					System.out.println("El programa cumple con todas las reglas del negocio");
				}
			}
		}
	}

}
