public class FuncionarioComissionado_ extends Funcionario_ {
    private double valorPorVenda;
    private int quantidadeVendas;
 
    public FuncionarioComissionado_ (String nome, String matricula,Double getSalario , int quantidadeVendas , double valorPorVenda){
        
        super(nome, matricula);
        this.quantidadeVendas=quantidadeVendas;
        this.valorPorVenda=valorPorVenda;
    }
    @Override
	public double getSalario() {
		  return 1.222 ;
	}
    public int getQuantidadeVendas(){
        return quantidadeVendas;
    }
    public void setQuantidadeVendas(int quantidadeVendas){
            this.quantidadeVendas=quantidadeVendas;   
    }
    public Double getValorPorVenda(){
        return valorPorVenda;
    }
    public void setValorPorVenda(Double valorPorVenda){
            this.valorPorVenda=valorPorVenda;   
    }
    public double calcularPagamento(){
    	return getSalario()+( valorPorVenda * quantidadeVendas );
    }
    public void adicionarVendas(int quantidadeVendas){
        this.quantidadeVendas=this.quantidadeVendas+quantidadeVendas;
    }
     public void redefinirVendas(){
        quantidadeVendas=0;
    }
    public String toString() {
		String funcionarioComissionado_ = "NOME: "+this.getNome()+" MATRICULA: "+this.getMatricula()+" SALARIO: "+this.getSalario()+ " QUANTIDADE DE VENDAS: "+this.getQuantidadeVendas()+ " COMISSÃO: "+this.getValorPorVenda();
		return funcionarioComissionado_;
	}
}
