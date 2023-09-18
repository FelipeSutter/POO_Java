package br.com.poo.Empresa.enums;

public enum departamentoEnum {
	INVEST_JA("Invest Já",1),
	SUPORTE_AO_CLIENTE("Suporte ao Cliente",2),
	DEPARTAMENTO_DE_GRAFICOS("Departamento de Gráficos",3),
	DEPARTAMENTO_DE_CARTOES("Departamento de Cartões",4),
	INFRAESTRUTURA_EMPRESARIAL("Infraestutura Empresarial",5);
	
	private String tipoDepartamento;
	private int id;
	
	private departamentoEnum(String tipoDepartamento, int id) {
		this.tipoDepartamento = tipoDepartamento;
		this.id = id;
	}

	public String getTipoDepartamento() {
		return tipoDepartamento;
	}

	public int getId() {
		return id;
	}
	
	
}
