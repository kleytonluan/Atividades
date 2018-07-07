package Atividade.data;

public class Data {
	int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public boolean verificarBissexto() {
		if (ano % 4 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public String mostrarData() {
		return dia +"/"+mes+"/"+ano;
	}
	public void diaSeguinte() {
		dia++;
		if((dia==32)&&(mes==1 || mes==3 || mes==5 || mes==7)){
			mes ++;
			dia = 1;
		}else {
			if((dia==31) && (mes==4 || mes==6 || mes==11)){
				mes ++;
				dia = 1;
			}else{
				if(dia==29 && mes==12 ){
					mes ++;
					dia = 1;
				}
			}
		}
	}
	public boolean validarData() {
		if(dia <= 31 && dia > 0 && mes <= 12 && mes > 0 ){
			return true;
		}else{
			throw new DataInvalidaException("Data inválida!");
		}
	}
}
