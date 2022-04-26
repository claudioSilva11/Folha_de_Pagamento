public class FuncionarioHora extends Funcionario_{
    private int horas;
    private Double valorDaHora;

    public FuncionarioHora(String nome, String matricula, Double getSalario, int horas, Double valorDaHora){
        super(nome, matricula);
        this.horas=horas;
        this.valorDaHora=valorDaHora;
    }
    
    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
            this.horas=horas;   
    }
    public Double getValorDaHora(){
        return valorDaHora;
    }
    public void setValorDaHora(Double valorDaHora){
            this.valorDaHora=valorDaHora;   
    }
    public double calcularSalario(){
        return getSalario()+( horas*valorDaHora);
    }
    public void adionarHoras(int horas){
        this.horas=this.horas+horas;
    }
    public int excluirHoras(){
        return horas=0;
    }
   
   
    @Override
	public double getSalario() {
		return 1.222;
	}
    public String toString() {
		String funcionarioHora = "NOME: "+this.getNome() + " MATRICULA: "+this.getMatricula()+ " SALARIO: "+this.getSalario()+ " HORAS TRABALHADAS: "+this.getHoras() + " VALOR DA HORA: "+this.getValorDaHora();
		return funcionarioHora;
	}
    
}
