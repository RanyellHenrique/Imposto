package entities;

public class PessoaFisica extends Person {
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
		super(name, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double tax() {
		if(rendaAnual < 20000) {
			return (rendaAnual*0.15) - (gastosComSaude*0.50);
		}else {
			return (rendaAnual*0.25) - (gastosComSaude*0.50);		}
	}

}
