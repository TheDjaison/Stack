import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Aprendendo Estrutura de dados!!
		// Passo 1: importando blibliotecas
		// Passo 2: Criar Menu do programa
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int op;
		do {
			showMenu();
			op = sc.nextInt();
			switch(op) {
			case 1: {
				System.out.println("Insira elemento na lista:");
				break;
			}
			case 2: {
					System.out.println("Lista: ");
				break;
			}		
			case 3: {
				System.out.println("Fim do programa");
				break;
			}
			default:
				System.out.println("Erro na execução do programa!");
			}

		}while(op !=3);
		
		
		
		
		
		sc.close();

	}
	public static void showMenu() {
		System.out.println("1 - Inserir elemento na lista ");
		System.out.println("2 - Mostrar lista ");
		System.out.println("3 - Sair ");
	}

}
