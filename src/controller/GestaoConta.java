package controller;

import java.util.ArrayList;

import bd.Database;
import model.*;

public class GestaoConta {
	
	
	Database db;
	
	public void addC(String nome, String pass){
		
		Pessoa p = new Pessoa (nome);
		
		db.contas.add(new Conta(p,pass));
		
	}

	public boolean login(String nome, String pass){
		for(Conta c1 : db.contas){
			System.out.println(c1.getP().getNome() + " " + c1.getPass() + "\n");
			if(c1.getP().getNome().equals(nome) && c1.getPass().equals(pass)){
				return true;
			}
		}
		return false;
	}
	
}
