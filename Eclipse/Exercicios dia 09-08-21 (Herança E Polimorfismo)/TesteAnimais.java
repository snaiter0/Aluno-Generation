package Herança;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro ("Caramelo", 1,true, "Tomba-lata",  
				"Medio", "Laranja", false, true);
		Cavalo cavalo1 = new Cavalo ("Carpeado", 5,true, "Marrom",  
				"Grande", "Acinzentado", true, true, "Inglaterra");
		Preguiça preguiça1 = new Preguiça ("Day",43,true,
				"Preguiça GG", true, 100.78);
		
		cachorro1.imprimir();
		
		cavalo1.imprimir();
		
		preguiça1.imprimir();
		
		
		
		
	}

}