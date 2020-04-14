
public class Gerente extends Funcionario {
	private int senhaEspecial;
	private int numeroFuncionariosGerenciados;
	
	public Gerente() {
		this.senhaEspecial = 5700;
	}

	public int getSenhaEspecial() {
		return senhaEspecial;
	}

	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}

	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}

	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
	public void autentica(int senha) {
		if(this.getSenhaEspecial() == senha) {
			System.out.println("Acesso Liberado");
		}
		else {
			System.out.println("Acesso Negado");
		}
	}
}
