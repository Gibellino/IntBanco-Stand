package bd;

import java.util.ArrayList;

import model.Conta;
import model.Pessoa;

public class Database {

	public ArrayList<Conta> contas;
	public ArrayList<Pessoa> pessoas;

	public Database(){
		contas = new ArrayList<>();
		pessoas  = new ArrayList<>();
	}
}
