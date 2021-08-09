package POO;

public class Aviao 
{
	
	private String 	aviao;
	private String 	CompanhiaAerea;
	private int		passageiros;
	
	public Aviao(String A,String C,int P)
	
	{
		this.setAviao(A);
		this.setCompanhiaAerea(C);
		this.setPassageiros(P);
		
	}

	public String getAviao() {
		return aviao;
	}

	public void setAviao(String aviao) {
		this.aviao = aviao;
	}

	public String getCompanhiaAerea() {
		return CompanhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		CompanhiaAerea = companhiaAerea;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	
	public void ImprimirInfo()
	{
		System.out.println(" O avião: "+aviao+" da companhia aerea: "+CompanhiaAerea+", Possui um limite de: \n"+passageiros+" Passageiros.");
	}
	
	
}
