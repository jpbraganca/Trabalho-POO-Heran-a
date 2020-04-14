public class TesterFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setName("Carlos");
		System.out.println("Funcionario: " + func.getName());
		
		func.setCpf("65129626");
		System.out.println("CPF: " + func.getCpf());
		
		func.setSalary(1200);
		System.out.println("Salario: " + func.getSalary());
		
		System.out.println("Bonificação: " + func.getBonificacao());
		
		
		System.out.println("\n--------------------------------------\n");
		
		Gerente gerente = new Gerente();
		
		gerente.setName("Luis");
		System.out.println("Gerente: " + gerente.getName());
		
		gerente.setCpf("15185445");
		System.out.println("CPF: " + gerente.getCpf());
		
		gerente.setSalary(4000);
		System.out.println("Salario: " + gerente.getSalary());
		
		System.out.println("Bonificação: " + gerente.getBonificacao());
		
		gerente.setNumeroFuncionariosGerenciados(8);
		System.out.println("O gerente gerencia " + gerente.getNumeroFuncionariosGerenciados() + " funcionarios");
		
		gerente.autentica(4515);
		
		
		System.out.println("\n--------------------------------------\n");
		System.out.println("Nome: João Pedro Baptista de Bragança");
		System.out.println("\n--------------------------------------\n");
		
	}

}
