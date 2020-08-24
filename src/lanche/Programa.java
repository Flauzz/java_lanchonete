package lanche;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Digite o número correspondente ao tipo de lanche desejado: ");
		System.out.println("[1] Sanduíches  [2] Massas  [3] Bolos");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			lanche = new Sanduiche();
			lanche.setTempoPreparo(15);
			menuSanduiche((Sanduiche) lanche);
		} else if (opcao == 3) {
			lanche = new Bolo();
			lanche.setTempoPreparo(10);
			menuBolo((Bolo) lanche);
		} else {
			lanche = new Massa();
			lanche.setTempoPreparo(30);
			menuMassa((Massa) lanche);
		}
	}

	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int i=0;
		int distancia;
		
		System.out.println("Você escolheu a opção sanduiches");
		System.out.println("Escolha os ingredientes (Até 10 itens - Digite 0 para finalizar):");
		
		while(i<10 && !ingrediente.equals("0")) {
			ingrediente = teclado.next();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe a sua distância em km (arredondar para o próximo inteiro superior): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo de chegada até a sua casa: " + lanche.calculaTempo(distancia) + "min.");
		System.out.println("Preço a pagar: R$" + lanche.calculaPreco(lanche.getTempoTotal()) + "0.");
	}
	
	public static void menuMassa(Massa lanche) {
		String ingrediente = "";
		int i=0;
		int distancia, opcao;
		String molho;
		
		System.out.println("Você escolheu a opção massas");
		System.out.println("Digite o número correspondente ao tipo de massa desejada: ");
		System.out.println("[1] Macarrão  [2] Pizza  [3] Lasanha");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			String[] ingredientes = new String[5];
			System.out.println("Ótima escolha. Digite o que você quer em seu macarrão (Até 5 itens - Digite 0 para finalizar): ");
			while(i<5 && !ingrediente.equals("0")) {
				ingrediente = teclado.next();
				ingredientes[i] = ingrediente;
				i++;
			}
			lanche.setIngredientes(ingredientes);
			System.out.println("Digite um molho desejado:");
			molho = teclado.next();	
			lanche.setMolho(molho);
		} else if (opcao == 2) {
			String[] ingredientes = new String[7];
			System.out.println("Ótima escolha. Digite o que você quer em sua pizza (Até 7 itens - Digite 0 para finalizar): ");
			while(i<7 && !ingrediente.equals("0")) {
				ingrediente = teclado.next();
				ingredientes[i] = ingrediente;
				i++;
			}
			lanche.setIngredientes(ingredientes);
			System.out.println("Digite um molho desejado:");
			molho = teclado.next();	
			lanche.setMolho(molho);
		} else {
			String[] ingredientes = new String[7];
			System.out.println("Ótima escolha. Digite o que você quer em sua lasanha (Até 7 itens - Digite 0 para finalizar): ");
			while(i<7 && !ingrediente.equals("0")) {
				ingrediente = teclado.next();
				ingredientes[i] = ingrediente;
				i++;
			}
			lanche.setIngredientes(ingredientes);
			System.out.println("Digite um molho desejado:");
			molho = teclado.next();	
			lanche.setMolho(molho);
		}
		
		System.out.println("Informe a sua distância em km (arredondar para o próximo inteiro superior): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo de chegada até a sua casa: " + lanche.calculaTempo(distancia) + "min.");
	}
	
	public static void menuBolo(Bolo lanche) {
		String[] ingredientes = new String[5];
		String massa = "";
		String recheio = "";
		String cobertura = "";
		int i=0;
		int j=0;
		int k=0;
		int distancia;
		
		System.out.println("Você escolheu a opção bolos");
		
		System.out.println("Escolha os ingredientes para a massa (Até 5 itens - Digite 0 para finalizar): ");
		
		while(i<5 && !massa.equals("0")) {
			massa = teclado.next();
			ingredientes[i] = massa;
			i++;
		}
		
		lanche.setMassa(ingredientes);
		
		System.out.println("Escolha os ingredientes para o recheio (Até 5 itens - Digite 0 para finalizar): ");
		
		while(j<5 && !recheio.equals("0")) {
			recheio = teclado.next();
			ingredientes[j] = recheio;
			j++;
		}
		
		lanche.setRecheio(ingredientes);
		
		System.out.println("Escolha os ingredientes para a cobertura (Até 5 itens - Digite 0 para finalizar): ");
		
		while(k<5 && !cobertura.equals("0")) {
			cobertura = teclado.next();
			ingredientes[k] = cobertura;
			k++;
		}
		
		lanche.setCobertura(ingredientes);
		
		System.out.println("Informe a sua distância em km (arredondar para o próximo inteiro superior): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo de chegada até a sua casa: " + lanche.calculaTempo(distancia) + "min.");
	}
}