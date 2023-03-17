package entidade;

public class Carro{

	private String cor;
	private String modelo;
	private double velocidadeAtual = 0;
	private double velocidadeMaxima;
	
	private Motor motor;
	
	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public Carro() {
		super();
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
		
	public String ligar() {
		return "O carro est� ligado!";
	}
	
	public String acelerar(double quantidade) {
		
		if (quantidade > 0 && (quantidade + this.velocidadeAtual) <= this.velocidadeMaxima) {
			this.velocidadeAtual = velocidadeAtual + quantidade;
			
			return "Voc� acelerou, sua velocidade atual �:" + velocidadeAtual;

		} 
		
		if (quantidade < 0 && (quantidade + this.velocidadeAtual) >= 0) {
			return "Voc� desacelerou, sua velocidade atual �: " + velocidadeAtual;
		}
		
		return "Velocidade M�xima permitida �: " + this.velocidadeMaxima;
		
	}
	
	public String pegarMarcha() {
		
		if (this.velocidadeAtual < 0) {
			return "Marcha atual: -1 ";
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return "Marcha atual: 1 ";
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return "Marcha atual: 2 ";
		}
		if (this.velocidadeAtual >= 80) {
			return "Marcha atual: 3 ";
		}
		return "Marcha n�o encontrada!";
		
		
	}
}
