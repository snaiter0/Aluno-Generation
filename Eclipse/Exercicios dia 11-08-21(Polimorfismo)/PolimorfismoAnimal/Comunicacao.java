package PolimorfismoAnimal;

import java.util.Scanner;

public class Comunicacao 
{
	protected boolean emiteSom;
	protected static boolean BalançaRabo;
	protected boolean Ecolocalizacao;
	Scanner leia = new Scanner(System.in);
	
	
	
	
	public boolean isEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		emiteSom = true;
		this.emiteSom = emiteSom;
	}
	public boolean isBalançaRabo() {
		return BalançaRabo;
	}
	public void setBalançaRabo(boolean balançaRabo) {
		BalançaRabo = emiteSom;
	}
	public boolean isEcolocalizacao() {
		return Ecolocalizacao;
	}
	public void setEcolocalizacao(boolean ecolocalizacao) {
		Ecolocalizacao = emiteSom;
	}
	
	
	
	
}
