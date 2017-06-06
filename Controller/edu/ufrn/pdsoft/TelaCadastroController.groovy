package edu.ufrn.pdsoft

import edu.ufrn.pdsoft.model.Alimento
import edu.ufrn.pdsoft.model.Nutricionista
import edu.ufrn.pdsoft.model.Receita

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
        // Tem que checar se o alimento já existe ou se não foi digitado
        // Não sei fazer isso de uma forma simples
    	double qntCalorias = Double.parseDouble(params.qntCalorias)
    	double qntProteinas = Double.parseDouble(params.qntProteinas)
    	double qntCalcio = Double.parseDouble(params.qntCalcio)

    	Alimento alimento = new Alimento(nome: params.nomeAlimento, calorias: qntCalorias , proteinas: qntProteinas , calcio: qntCalcio )
    	alimento.save(flush: true);
    	render(view: 'cadastroFeito.gsp')
    }

    def cadastroReceita() { }

    def visualizaReceita(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [recipesList: Receita.list(params), recipeTotal: Receita.count()]
     }

    def cadastrarReceita() {
        def receitas = Receita.list()
        boolean exists = false

        for (Receita receita : receitas) {
            if (params.nomeReceita == receita.nome) {
                exists = true
            }
        }
        // Para evitar ter que redirecionar pra outra página seria preciso usar ajax ou jQuery, que não tenho conhecimento ainda
        if (exists) {
            render(view: "receitaExiste.gsp");
        } else {
            String nomeReceita = params.nomeReceita
            String descricao = params.descricaoReceita
            String tipo = params.tipoReceita

            Alimento cafeManha = Alimento.findByNome(params.alimentoCafe)
            Alimento lancheManha = Alimento.findByNome(params.lancheManha)
            Alimento almoco = Alimento.findByNome(params.alimentoAlmoco)
            Alimento lancheTarde = Alimento.findByNome(params.lancheTarde)
            Alimento jantar = Alimento.findByNome(params.jantar)

            Receita receita = new Receita(nome: nomeReceita, descricao: descricao, tipo: tipo)
            receita.cafeDaManha.add(cafeManha)
            receita.lancheManha.add(lancheManha)
            receita.almoco.add(almoco)
            receita.lancheTarde.add(lancheTarde)
            receita.jantar.add(jantar)
            receita.save(flush: true)
            redirect(action: "visualizaReceita")
        }
    }
}
