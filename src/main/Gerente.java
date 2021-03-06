package main;

public class Gerente extends Funcionario implements Autenticavel{
	
	private Autenticador autenticador;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação gerente");
		return super.salario;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}


}
