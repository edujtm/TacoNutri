package edu.ufrn.pdsoft.model

import edu.ufrn.pdsoft.model.Alimento

class Receita {

	String nome;
	String descricao;
	String tipo;
	List<Alimento> cafeDaManha = new ArrayList<>(); // Vetor de alimentos da refeição
	List<Alimento> lancheManha = new ArrayList<>();
	List<Alimento> almoco = new ArrayList<>();
	List<Alimento> lancheTarde = new ArrayList<>();
	List<Alimento> jantar = new ArrayList<>();

    static constraints = {
    }
}
