package controller;

public class Ex05Controller {

	public Ex05Controller() {
		super();
	}
	
	public int mdc(int n1, int n2) {
		if(n1 == n2) {
			return n1;
		}
		else if(n1 > n2){
			return mdc(n1-n2, n2);
		}
		else {
			return mdc(n2, n1);
		}
		
	}
	
}
