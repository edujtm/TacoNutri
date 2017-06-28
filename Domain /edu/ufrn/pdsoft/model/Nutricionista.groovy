package edu.ufrn.pdsoft.model

import java.util.HashMap;
import java.util.Map;

class Nutricionista {
	
	String name
	String localCrn
	String nomeLogin
	String senhaLogin
	double crn
	double cpf
	double rg

	/*static HashMap<String, String> functions = ["Cadastrar alimento": "/Alimento/upload", "Visualizar alimento": "/Alimento/list", "Cadastrar dieta": "/TelaCadastro/cadastroDieta", "Visulizar Dieta": "/TelaCadastro/visualizaDieta"]
	
	static HashMap<String, String> getFunctions() {
		return functions
	}*/

    static constraints = {
    	nomeLogin blank: false, unique: true
    }
}