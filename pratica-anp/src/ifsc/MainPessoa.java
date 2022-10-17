package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		Professor bruna = new Professor();
		bruna.setNome("Bruna");
		bruna.setCpf("287.910.837-97");
		bruna.setSiape(123456);
		System.out.println(bruna.getNome());
		System.out.println(bruna.getCpf());
		System.out.println(bruna.getSiape());
		System.out.println("");
		
		Aluno maria = new Aluno();
		maria.setNome("Maria Eduarda Mendes");
		maria.setCpf("986.237.234-65");
		maria.setMatricula(111700235);
		System.out.println(maria.getNome());
		System.out.println(maria.getCpf());
		System.out.println(maria.getMatricula());

	}

}
