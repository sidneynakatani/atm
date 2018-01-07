package br.com.sidney.atm;

public interface DispenseChain {
	
	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);

}
