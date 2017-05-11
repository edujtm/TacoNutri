package edu.ufrn.pdsoft

import edu.ufrn.pdsoft.model.Alimento

class TelaCadastroController {

    def index() { }

    def visualizaAlimento() { 
    	def alimentos = Alimento.list()
    	[alimentos: alimentos]
    }

    def cadastroAlimento() {

    }

    def buscarAlimento() {
    	Alimento alimento = Alimento.get(params.alimentoBusca)
    	/*def alimentos = Alimento.list()
    	def listaRetorno
    	for (Alimento al : alimentos) {
    		if (alimento.nome.contains(al.nome)) {
    			listaRetorno.add(alimento)
    		}
    	}
    	*/
    }

}
