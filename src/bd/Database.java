package bd;

import java.util.ArrayList;

import model.Conta;
import model.Pessoa;

public class Database {

	public static ArrayList<Conta> contas;
	public static ArrayList<Pessoa> pessoas;

	public Database(){
		contas = new ArrayList<>();
		pessoas  = new ArrayList<>();
	}
}
