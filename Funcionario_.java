public abstract class Funcionario_{
    private String nome;
    private String matricula;
 
    public Funcionario_ (String nome,String matricula){
        this.nome=nome;
        this.matricula=matricula;
    }
    public String toString() {
		String funcionario_ = "NOME: "+this.nome+" MATRICULA: "+this.matricula+ "SALARIO"+getSalario();
		return funcionario_;
	}
    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public abstract double getSalario();
    
}
