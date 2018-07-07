package Atividade.data;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(10, 03, 1993);
		Data d2 = new Data(1, 02, 2016);
		Data d3 = new Data(31, 15, 1840);
				
		System.out.println("========Datas========");
		System.out.println("Data 01: "+d1.mostrarData());
		System.out.println("Data 02: "+d2.mostrarData());
		System.out.println("Data 03: "+d3.mostrarData());

		System.out.println("======Testando Datas======");
		try {
			System.out.println("Data 1: " +d1.validarData());	
		}catch(DataInvalidaException d) {
			System.out.println("Erro: " +d);
		}
		try {
			System.out.println("Data 2: " +d2.validarData());	
		}catch(DataInvalidaException d) {
			System.out.println("Erro: " +d);
		}
		try {
			System.out.println("Data 3: " +d3.validarData());	
		}catch(DataInvalidaException d) {
			System.out.println("Erro: " +d);
		}
		System.out.println("======Verificando Bissexto======");
		System.out.println("Data 1: "+d1.ano +" é " + d1.verificarBissexto());
		System.out.println("Data 2: "+d2.ano +" é " + d2.verificarBissexto());
		System.out.println("Data 3: "+d3.ano +" é " + d3.verificarBissexto());
		
	}

}
