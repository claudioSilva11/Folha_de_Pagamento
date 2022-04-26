public class FolhaDePagamento {
    
    public static void main(String[] args) {
		//Funcionario_ Funcionario01 = new Funcionario_();
        FuncionarioComissionado_ COMISSIONADO_1 = new FuncionarioComissionado_("CLÁUDIO", "6453 ", 1.200,0, 0.015);
		COMISSIONADO_1.adicionarVendas(5);
		COMISSIONADO_1.calcularPagamento();
		FuncionarioHora FUN_HORA = new FuncionarioHora("JOSÈ","122343 ", 1.200,  0 , 0.01);
		FUN_HORA.adionarHoras(4);
		FUN_HORA.calcularSalario();
        FuncionarioAssalariado_ FUN_ASSALARIADO = new FuncionarioAssalariado_("CARLA", "1321 ", 1.200 ,  0.50);

		     System.out.println("");
			 System.out.println("-----Funcionario Comissionado-----");
			 System.out.println("");

			 System.out.println("Nome : "+COMISSIONADO_1.getNome());
			 System.out.println("Matricula: "+COMISSIONADO_1.getMatricula());
			 System.out.println("Salario: "+COMISSIONADO_1.getSalario());
			 System.out.println("Quntidade de vendas: "+COMISSIONADO_1.getQuantidadeVendas());
			 System.out.println("Valor da comissao por venda: "+COMISSIONADO_1.getValorPorVenda());
			 System.out.println("Pagamento com comissão: "+COMISSIONADO_1.calcularPagamento());

             System.out.println("");
			 System.out.println("-----Funcionario que faz Hora extra-----");
			 System.out.println("");
			 
			 System.out.println("Nome : "+FUN_HORA.getNome());
			 System.out.println("Matricula  : "+FUN_HORA.getMatricula());
			 System.out.println("Salario : "+FUN_HORA.getSalario());
			 System.out.println("Horas trabalhadas : "+FUN_HORA.getHoras());
			 System.out.println("Valor da Hora : "+FUN_HORA.getValorDaHora());
			 System.out.println("Pagamento com Horas : "+FUN_HORA.calcularSalario());
             
			 System.out.println("");
			 System.out.println("-----Funcionario Asalariado-----");
			 System.out.println("");
			 
			 System.out.println("Nome : "+FUN_ASSALARIADO.getNome());
			 System.out.println("Matricula : "+FUN_ASSALARIADO.getMatricula());
			 System.out.println("Salario : "+FUN_ASSALARIADO.getSalario());
			 System.out.println("Salario Semanal: "+FUN_ASSALARIADO.getSalarioSemanal());
			 System.out.println("Pagamento : "+FUN_ASSALARIADO.calcularPagamentoA());
	//	}
        
    }
    
}

