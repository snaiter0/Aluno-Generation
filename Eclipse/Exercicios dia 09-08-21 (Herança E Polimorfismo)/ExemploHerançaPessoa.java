package Herança;
public class ExemploHerançaPessoa extends ExemploHerança


{
private int codigoSetor;
private float salarioBase;
private float imposto;


public ExemploHerançaPessoa(String nome, String endereco,
String cpf, int telefone, int idade, int
codigoSetor, float salarioBase, float imposto) 

{
super (nome, endereco, cpf, telefone, idade);
this.codigoSetor = codigoSetor;
this.salarioBase = salarioBase;
this.imposto = imposto;
}


public void imprimirInfo() 
{
System.out.println("\nNome do empregado: " +
getNome() + "\nCPF: " + getCpf()
+ "\nIdade: " + getIdade()
+ "\nTelefone: " + getTelefone()
+ "\nEndereço: " + getEndereco() + "\nCódigo"+
"do setor:"  + codigoSetor + "\nSalário base: "
+ salarioBase + "\nValor em porcentagem(sem o"+
"%) de imposto a ser retido do salário:" + imposto);
}

public void calcularSalario() {
double salario_total = salarioBase -
(salarioBase * (imposto/100));
System.out.println("O salário total a ser"+
"recebido pelo empregado: "+ getNome() + " é igual a" 
		+ salario_total);
}
}