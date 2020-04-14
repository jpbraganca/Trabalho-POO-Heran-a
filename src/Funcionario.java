public class Funcionario {
	//ATRIBUTES
	private String name;
	private String cpf;
	private double salary;
	
	//METHODS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getBonificacao() {	
		return ((this.getSalary() * 1.1) - this.getSalary());
	}
}
