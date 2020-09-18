package entidades;
public class Terceiros  extends Funcionario
{
	private double horasAdicionais;
	
	public Terceiros() {
		
	}
	
	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override  // mudan�a apenas para esta situa��o - puxadinho do metodo
	public double pagamento()
	{
		
		return super.pagamento() + (this.horasAdicionais * super.getValorPorHora());
		
		//return (this.horasTrabalhadas*this.valorPorHora) + (horasAdicionais*valorPorHora)
	}
	public double pagamento(int horasTrabalhadas, double valorPorHora)
	{
		double recebimento;
		recebimento = (horasTrabalhadas * valorPorHora) + (this.getHorasAdicionais()*valorPorHora);
		
		super.setValorPorHora(valorPorHora);
		super.setHorasTrabalhadas(horasTrabalhadas);
		
		return recebimento;
	}
	
	
}