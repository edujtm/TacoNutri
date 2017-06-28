package edu.ufrn.pdsoft

import edu.ufrn.pdsoft.model.Nutricionista
import edu.ufrn.pdsoft.model.Usuario
import java.util.Map

class LoginController {

    def index() { }

    def autenticarUsuario() {
    	def nutricionistas = Nutricionista.list()
    	def usuarios = Usuario.list()
        def userLogin
    	boolean autenticado = false

    	nutricionistas.each { nutricionista -> 
			if (nutricionista.nomeLogin.equals(params.nomeUsuario) && nutricionista.senhaLogin.equals(params.senhaUsuario)) {
				autenticado = true
                userLogin = nutricionista
			} 
    	}

    	usuarios.each { usuario ->
    		if (usuario.nomeLogin.equals(params.nomeUsuario) && usuario.senhaLogin.equals(params.senhaUsuario)) {
				autenticado = true
                userLogin = usuario
			} 
    	}

    	if (autenticado) {
            /*
            if (userLogin instanceof Nutricionista) {
                def functions = Nutricionista.getFunctions()
                List<String> nomes = new ArrayList<>();
                List<String> links = new ArrayList<>();  
                functions.each {
                    key, value ->
                    nomes.add(key)
                    links.add(value)
                }
                
                redirect(controller: "TelaCadastro", params: [nomes: nomes, links: links])

            } else {
                def functions = Usuario.getFunctions()
                List<String> nomes = new ArrayList<>();
                List<String> links = new ArrayList<>();  
                functions.each {
                    key, value ->
                    nomes.add(key)
                    links.add(value)
                }
                redirect(controller: "TelaCadastro", params: [nomes: nomes, links: links])
            } */
            redirect(controller: "TelaCadastro")
    	} else {
    		render(view: "erroAutenticacao.gsp")
    	}
    }

}
