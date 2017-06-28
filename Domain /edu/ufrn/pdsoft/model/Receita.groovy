package edu.ufrn.pdsoft.model

import edu.ufrn.pdsoft.model.Alimento

class Receita {

	// A receita precisa ter uma conexão com os pacientes e com o nutricionista, mas não sei como fazer para determinar essa relação no form GSP

	String nome;
	String descricao;
	String tipo;
	List<Alimento> cafeDaManha = new ArrayList<>(); // Vetor de alimentos da refeição
	List<Alimento> lancheManha = new ArrayList<>();
	List<Alimento> almoco = new ArrayList<>();
	List<Alimento> lancheTarde = new ArrayList<>();
	List<Alimento> jantar = new ArrayList<>();

    static constraints = {
    	nome blank: false, unique: true
    	tipo blank: false
    }
}
