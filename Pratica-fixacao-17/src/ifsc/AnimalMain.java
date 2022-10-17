package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		Gato eva = new Gato();
		eva.setNome("Eva");
		eva.setRaca("Viralata");
		eva.setComprimento(22.4f);
		eva.setNumeroPatas(4);
		eva.setCor("branca com manchas pretas e laranjas");
		eva.setEcossistema ("Casa");
		
		Gato mingau = new Gato();
		mingau.setNome("Mingau");
		mingau.setRaca("Siamês");
		mingau.setComprimento(20.4f);
		mingau.setNumeroPatas(4);
		mingau.setCor("branca com as estremidades prtas");
		mingau.setEcossistema ("Apartamento");
		
		Gato Garfield = new Gato();
		Garfield.setNome("Garfield");
		Garfield.setRaca("Persa");
		Garfield.setComprimento(39.4f);
		Garfield.setNumeroPatas(4);
		Garfield.setCor("Laranja com manchas pretas");
		Garfield.setEcossistema ("Cozinha");
		
		Cachorro brisa = new Cachorro();
		brisa.setNome ("Brisa");
		brisa.setRaca("Viralata");
		brisa.setComprimento(50.0f);
		brisa.setNumeroPatas(4);
		brisa.setCor("Marrom");
		brisa.setEcossistema("Jardim");
		
		Cachorro Eros = new Cachorro();
		Eros.setNome ("Eros");
		Eros.setRaca("Lulu da pomerânia");
		Eros.setComprimento(25.0f);
		Eros.setNumeroPatas(4);
		Eros.setCor("Branco com manchas caramelo");
		Eros.setEcossistema("Apartamento");
		
		Cachorro Churros = new Cachorro();
		Churros.setNome ("Churros");
		Churros.setRaca("Salsicha");
		Churros.setComprimento(30.0f);
		Churros.setNumeroPatas(4);
		Churros.setCor("Caramelo");
		Churros.setEcossistema("Casa");
		
		ArrayList <Gato> gatos = new ArrayList<>();
		gatos.add(eva);
		gatos.add(Garfield);
		gatos.add(mingau);
		
		for (Gato gato : gatos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getRaca());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getNumeroPatas());
			System.out.println(gato.getCor());
			System.out.println(gato.getEcossistema());
			System.out.println("");

		}
		
		ArrayList <Cachorro> Cachorros = new ArrayList<>();
		Cachorros.add(brisa);
		Cachorros.add(Eros);
		Cachorros.add(Churros);
		for (Cachorro cachorro : Cachorros) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getNumeroPatas());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getEcossistema());
			System.out.println("");
		}
	}

}
