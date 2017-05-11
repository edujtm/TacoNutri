package taconutri

import edu.ufrn.pdsoft.model.Alimento
import edu.ufrn.pdsoft.model.Usuario

class BootStrap {

    def init = { servletContext ->
    	if(Alimento.count() == 0) {
    		new Alimento(nome: "Carambola, crua", calorias: 46, proteinas: 0.9, calcio: 5).save()
    		new Alimento(nome: "Jambo, cru", calorias: 27, proteinas: 0.9, calcio: 14).save()
    		new Alimento(nome: "Laranja, lima, crua", calorias: 46, proteinas:  1.1 , calcio: 31).save()
    	}
    	if (Usuario.count() == 0) {
    		new Usuario(nomeCompleto: "administrador", nomeLogin: "admin", senhaLogin: "aldairplayboy", cpf: 0, rg: 0).save()
    	}
    }

    def destroy = {
    }
}
