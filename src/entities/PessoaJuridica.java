package entities;

public class PessoaJuridica extends Person {
	private Integer numeroDeFuncionario;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionario) {
		super(name, rendaAnual);
		this.numeroDeFuncionario = numeroDeFuncionario;
	}
	
	public Integer getNumeroDeFuncionario() {
		return numeroDeFuncionario;
	}

	public void setNumeroDeFuncionario(Integer numeroDeFuncionario) {
		this.numeroDeFuncionario = numeroDeFuncionario;
	}

	@Override
	public double tax() {
		if(numeroDeFuncionario <= 10) {
			return (rendaAnual * 0.16);
		}else {
			return (rendaAnual * 0.14);
		}
	}

}
