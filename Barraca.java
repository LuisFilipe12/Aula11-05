import java.util.Scanner;

public class Barraca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Produtos produto = new Produtos();

		System.out.println("� no card�pio t�m: Lanches, bebidas, por��es e pratos executivos");
		produto.lanches = sc.nextLine();
		produto.bebidas = sc.nextInt();
		produto.porcoes = sc.nextLine();
		produto.pratosexecutivos = sc.nextLine();
		
		System.out.println("Digite L para lanches, B para bebidas, P para por��es e E para pratos executivos: ");
	int opcao = sc.nextInt();
	
		switch(opcao) {
		case 1: {
			
		System.out.println("Quantos ?: ");	
		itens = sc.nextDouble();
		
		break;
		}
		case 2:{
			System.out.println("Quantas bebidas ?: ");
			itens = sc.nextDouble();
		
			break;
		
		}
		
		default{
			
			System.out.println("Erro, tente de novo");
		itens = sc.nextDouble();
		
		}
		
		
		
		
		
		}
		
		
		
		sc.close();
	}

}
