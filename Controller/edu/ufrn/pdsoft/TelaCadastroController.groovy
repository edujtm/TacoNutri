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

    def cadastrarAlimento() {
    	double qntCalorias = Double.parseDouble(params.qntCalorias)
    	double qntProteinas = Double.parseDouble(params.qntProteinas)
    	double qntCalcio = Double.parseDouble(params.qntCalcio)

    	Alimento alimento = new Alimento(nome: params.nomeAlimento, calorias: qntCalorias , proteinas: qntProteinas , calcio: qntCalcio )
    	alimento.save(flush: true);
    	render(view: 'cadastroFeito.gsp')
    }
}
