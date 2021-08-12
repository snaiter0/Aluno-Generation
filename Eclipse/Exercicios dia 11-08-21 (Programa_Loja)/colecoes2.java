package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class colecoes2 
{
	public static void main(String[] args) {
		
	
	int op;
	
	Scanner ler = new Scanner(System.in);
	
	ArrayList<String> estoque = new ArrayList();
	
	do
	{
		
		System.out.println("\n\t\tDigite uma opção: ");
		System.out.println("--------------------------------");
		System.out.println("\n(1) Deseja adicionar produtos aos estoque?"
				+ "\n(2) Deseja remover produtos do estoque?"
				+ "\n(3) Substituir produtos da lista."
				+ "\n(4) Exibir lista de produtos."
				+ "\n(0) Encerrar o programa");
			System.out.println("--------------------------------");
			op = ler.nextInt();
		
			switch(op)
			
			{
			case 1:
	
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			
			case 2:
				ler.nextLine();
				System.out.println("Digite o produto para remover do estoque.");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}else
				{
					System.out.println("\nEste produto não existe!");
				}
				break;
				
				case 3:
					ler.nextLine();
					System.out.println("\nDigite o produto que quer atualizar");
					String verifica = ler.nextLine();
					System.out.println("\nDigite o nome do produto que substituirá: "+verifica+".");
					String novo = ler.nextLine();
			
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\nProduto não existe no estoque!!!");
					}
					System.out.println("\n"+estoque);
					break;
				
					
				case 4:
					System.out.println("\nProdutos do estoque: ");
					System.out.println("\n"+estoque);
					break;
					
					default:
						System.out.println("\nVocê finalizou o programa!!! Volte sempre!!!");
					
			
			
			
			}	
	}while(op!=0);
	

}
}
