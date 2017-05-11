package edu.ufrn.pdsoft.model

class Alimento {

	//Duvida como fazer o id ser autoincrementavel

	// int id  
	String nome
	double calorias  // em [kcal]
	double proteinas // em [g]
	double calcio  // em [mg]

	//Adicionar mais informações dos alimentos aqui

    static constraints = {
    }
}
