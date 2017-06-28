package edu.ufrn.pdsoft.model

import java.util.HashMap
import java.util.Map

class Usuario {  
	String nomeCompleto
	String nomeLogin
	String senhaLogin
	int cpf
	int rg

	/*
	static HashMap<String, String> functions = ['Visualizar dieta': '/TelaCadastro/visualizaDieta']

	static HashMap<String, String> getFunctions() {
		return functions
	} */


	//adicionar classe da dieta
    static constraints = {
    	nomeLogin blank: false, unique: true
    	senhaLogin blank: false
    	cpf blank: false
    }
}
