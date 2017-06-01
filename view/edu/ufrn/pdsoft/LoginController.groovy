package edu.ufrn.pdsoft

import edu.ufrn.pdsoft.model.Nutricionista
import edu.ufrn.pdsoft.model.Usuario

class LoginController {

    def index() { }

    def autenticarUsuario() {
    	def nutricionistas = Nutricionista.list()
    	def usuarios = Usuario.list()
    	boolean autenticado = false

    	nutricionistas.each { nutricionista -> 
			if (nutricionista.nomeLogin.equals(params.nomeUsuario) && nutricionista.senhaLogin.equals(params.senhaUsuario)) {
				autenticado = true
			} 
    	}

    	usuarios.each { usuario ->
    		if (usuario.nomeLogin.equals(params.nomeUsuario) && usuario.senhaLogin.equals(params.senhaUsuario)) {
				autenticado = true
			} 
    	}

    	if (autenticado) {
    		redirect(controller: "TelaCadastro")
    	} else {
    		render(view: "erroAutenticacao.gsp")
    	}
    }

}
