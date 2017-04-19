package model;

public class Conta {

	private Pessoa p;
	private String pass;
	private float saldo;
	
	public Conta(Pessoa p, String pass) {
		this.p = p;
		this.pass = pass;
		this.saldo = 0;
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	public String getPass(){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
