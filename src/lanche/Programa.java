package lanche;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Digite o n�mero correspondente ao tipo de lanche desejado: ");
		System.out.println("[1] Sandu�ches  [2] Massas  [3] Bolos");
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
		
		System.out.println("Voc� escolheu a op��o sanduiches");
		System.out.println("Escolha os ingredientes (At� 10 itens - Digite 0 para finalizar):");
		
		while(i<10 && !ingrediente.equals("0")) {
			ingrediente = teclado.next();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe a sua dist�ncia em km (arredondar para o pr�ximo inteiro superior): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo de chegada at� a sua casa: " + lanche.calculaTempo(distancia) + "min.");
		System.out.println("Pre�o a pagar: R$" + lanche.calculaPreco(lanche.getTempoTotal()) + "0.");
	}
	
	public static void menuMassa(Massa lanche) {
		String ingrediente = "";
		int i=0;
		int distancia, opcao;
		String molho;
		
		System.out.println("Voc� escolheu a op��o massas");
		System.out.println("Digite o n�mero correspondente ao tipo de massa desejada: ");
		System.out.println("[1] Macarr�o  [2] Pizza  [3] Lasanha");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			String[] ingredientes = new String[5];
			System.out.println("�tima escolha. Digite o que voc� quer em seu macarr�o (At� 5 itens - Digite 0 para finalizar): ");
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
			System.out.println("�tima escolha. Digite o que voc� quer em sua pizza (At� 7 itens - Digite 0 para finalizar): ");
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
			System.out.println("�tima escolha. Digite o que voc� quer em sua lasanha (At� 7 itens - Digite 0 para finalizar): ");
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
		
		System.out.println("Informe a sua dist�ncia em km (arredondar para o pr�ximo inteiro superior): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo de chegada at� a sua casa: " + lanche.calculaTempo(distancia) + "min.");
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
		
		System.out.println("Voc� escolheu a op��o bolos");
		
		System.out.println("Escolha os ingredientes para a massa (At� 5 itens - Digite 0 para finalizar): ");
		
		while(i<5 && !massa.equals("0")) {
			massa = teclado.next();
			ingredientes[i] = massa;
			i++;
		}
		
		lanche.setMassa(ingredientes);
		
		System.out.println("Escolha os ingredientes para o recheio (At� 5 itens - Digite 0 para finalizar): ");
		
		while(j<5 && !recheio.equals("0")) {
			recheio = teclado.next();
			ingredientes[j] = recheio;
			j++;
		}
		
		lanche.setRecheio(ingredientes);
		
		System.out.println("Escolha os ingredientes para a cobertura (At� 5 itens - Digite 0 para finalizar): ");
		
		while(k<5 && !cobertura.equals("0")) {
			cobertura = teclado.next();
			ingredientes[k] = cobertura;
			k++;
		}
		
		lanche.setCobertura(ingredientes);
		
		System.out.println("Informe a sua dist�ncia em km (arredondar para o pr�ximo inteiro superior): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo de chegada at� a sua casa: " + lanche.calculaTempo(distancia) + "min.");
	}
}