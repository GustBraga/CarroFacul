package apresentacao;

import java.util.Scanner;

import entidade.Carro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		String op;
		
		Carro c = new Carro();
		
		do {
			
			System.out.println("1 - ligar!");
			System.out.println("2 - Acelerar ou Desacelerar!");
			System.out.println("3 - Pegar Marcha!");
			System.out.println("4 - Ver velocidade!");
			System.out.println("5 - Cadastrar Carro!");
			System.out.println("s - Sair!");
			System.out.print("Selecione uma opção:");
			
			op = ler.nextLine();
			
			switch (op) {
			case "1":{
				
				System.out.println(c.ligar());
				
				break;
			}
			
			case "2":{
				
				System.out.print("Digite o valor para acelerar(Ex: 10) ou desacelerar(Ex: -10): ");
				double quantidade = Double.parseDouble(ler.nextLine());
				
				System.out.println(c.acelerar(quantidade));
				
				break;
			}
			
			case "3":{
				
				System.out.println(c.pegarMarcha());
				
				break;
			}
			
			case "4":{
				
				System.out.println(c.getVelocidadeAtual());
				
				break;
			}
			
			case "5":{
				
				System.out.println("Digite a cor: ");
				String cor = ler.nextLine();
				System.out.println("Digite o modelo: ");
				String modelo = ler.nextLine();
				System.out.println("Digite a velocidade máxima: ");
				double velocidadeMaxima = Double.parseDouble(ler.nextLine());
				
				c.setCor(cor);
				c.setModelo(modelo);
				c.setVelocidadeMaxima(velocidadeMaxima);
				
				break;
			}
				
			default:
				break;
			}

			
		} while (!op.equalsIgnoreCase("s"));
		
		ler.close();
		
	}

}
