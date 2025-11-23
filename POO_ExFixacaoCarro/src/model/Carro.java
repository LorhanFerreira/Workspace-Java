package model;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	public String acelerar(int valor) {
		if ( this.motorLigado ) {
			this.velocidade = this.velocidade + valor; //acelerando
			return this.modelo + 
					" --> ACELEROU!!! Velocidade atual:" +
					this.velocidade + " Km/h.";
		} else {//motor desligado
			return this.modelo + 
					"--> ATENÇÃO: Não é possível acelerar "
					+ "com o motor desligado!";
		}
	}//fim do acelerar()
	
	public String desligarMotor() {
		if ( !this.motorLigado ) {
			return "O motor do " + this.modelo + " já estava desligado.";
		} else { //daqui em diante o motor está ligado
			if ( this.velocidade != 0 ) { //ligado e em movimento
				return "ATENÇÃO: O motor do " + this.modelo + 
						" não foi desligado pois o carro "
						+ "está em movimento.";
			} else { //ligado e parado
				this.motorLigado = false; //desligando o motor
				return "O motor do "+this.modelo+" foi desligado agora.";
			}
		}
	}//fim do desligarMotor()

	public String ligarMotor() {
		
		if ( this.motorLigado ) {
			return "O motor do " + this.modelo + " já estava ligado.";
		} 
		
		this.motorLigado = true; //ligando o motor
		return "O motor do " + this.modelo + " foi ligado agora.";
		
	}// fim do ligarMotor()
	
	public String situacaoMotor() {
		if ( this.motorLigado ) {
			return this.modelo + " --> Motor LIGADO.";
		} else {
			return this.modelo + " --> Motor DESLIGADO.";
		}
	}
	
	public void detalhes() {
		System.out.println("\nDetalhes:");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
	}

	// Método construtor simples
	public Carro() {
		super();
	}

	// Método construtor completo
	public Carro(String fabricante, String modelo, int ano, 
			boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	// Método construtor personalizado
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}

	// métodos getters e setters
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Carro [fabricante=" + fabricante + 
				", modelo=" + modelo + 
				", ano=" + ano + 
				", motorLigado=" + motorLigado + 
				", velocidade=" + velocidade + "]";
	}

}
