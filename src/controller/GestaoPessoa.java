package controller;

import bd.Database;
import model.Pessoa;

public class GestaoPessoa {

	static Database db;
	
	public GestaoPessoa(){
		db = new Database();
	}
	
	public Pessoa addP(String nome){
		
		db.pessoas.add(new Pessoa(nome));
		
		return db.pessoas.get(db.pessoas.size()-1);
	}
}
