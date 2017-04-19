package controller;

import bd.Database;
import model.*;

public class GestaoConta {

	Database db;
	
	public GestaoConta(){
		db = new Database();
	}
	
	public void addC(String nome, String pass){
		
		Pessoa p = new GestaoPessoa().addP(nome);
		
		db.contas.add(new Conta(p,pass));
		
	}

	public boolean login(String nome, String pass){
		for(Conta c : db.contas){
			if(c.getP().getNome() == nome && c.getPass() == pass){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	
}
