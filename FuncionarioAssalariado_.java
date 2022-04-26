public class FuncionarioAssalariado_ extends Funcionario_{
    private Double salarioSemanal;

    public FuncionarioAssalariado_ (String nome, String matricula, Double salario,Double salarioSemanal){
        super(nome, matricula);
        this.salarioSemanal=salarioSemanal;
    }
    
        @Override
        public double getSalario() {
            return 1.222;
        }
    public Double getSalarioSemanal(){
        return salarioSemanal;
    }
    public void setSalarioSemanal(Double salarioSemanal){
            this.salarioSemanal=salarioSemanal; 
    }
    public double calcularPagamentoA(){
        return getSalario()+getSalarioSemanal();
    }
    public String toString() {
		String FuncionarioAssalariado_ = "NOME: "+this.getNome()+" MATRICULA: "+this.getMatricula()+"SALARIO: "+this.getSalario() + "SALARIO SEMANAL: "+this.getSalarioSemanal();
		return FuncionarioAssalariado_;
	}
    
}
