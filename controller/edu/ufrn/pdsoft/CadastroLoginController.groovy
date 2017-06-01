package edu.ufrn.pdsoft

import edu.ufrn.pdsoft.model.Nutricionista
import edu.ufrn.pdsoft.model.Usuario

class CadastroLoginController {

    def index() { }

    def cadastroNutricionista() { }

    def cadastroUsuario() { }

    def cadastrarNutricionista() {
    	Nutricionista nutricionista = new Nutricionista()
    	if (params.nomeNutricionista != null || params.localCrn != null || params.nomeLogin != null || params.senhaLogin != null || params.crn != null || params.rg != null) {
			nutricionista.setName(params.nomeNutricionista)
			nutricionista.setLocalCrn(params.localCrn)
			nutricionista.setNomeLogin(params.nomeLogin)
			nutricionista.setSenhaLogin(params.senhaLogin)
			nutricionista.setCrn(Integer.parseInt(params.crn))
			nutricionista.setCpf(Integer.parseInt(params.rg))
			nutricionista.save(flush: true)
			render(view: 'concluirCadastro.gsp')
    	} else {
    		render(view: 'erroCadastro.gsp')
    	}
    }

    def cadastrarUsuario() {
    	Usuario usuario = new Usuario()
    	if (params.nomeCompleto != null || params.nomeLogin != null || params.senhaLogin != null || params.senhaCpf != null || rg != null) {
	    	usuario.setNomeCompleto(params.nomeCompleto)
	    	usuario.setNomeLogin(params.nomeLogin)
	    	usuario.setSenhaLogin(params.senhaLogin)
	    	usuario.setCpf(Integer.parseInt(params.cpf))
	    	usuario.setRg(Integer.parseInt(params.rg))
	    	usuario.save(flush: true)
	    	render(view: 'concluirCadastro.gsp')
    	} else {
    		render(view: 'erroCadastro.gsp')
    	}
    }
}
