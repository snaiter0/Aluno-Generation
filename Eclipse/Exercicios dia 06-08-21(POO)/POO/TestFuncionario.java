package POO;

import java.util.Scanner;

public class TestFuncionario 
{

	Scanner Leia = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		Funcionario Colaborador1 = new Funcionario(null, null, null, null, null);
		
		{
			
			Colaborador1.FormatarMoeda();
			Colaborador1.FormatarMoeda1();
			Colaborador1.ImprirmirInfo();
			
		}
		
	}
	
}
