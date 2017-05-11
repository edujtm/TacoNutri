package taconutri

import edu.ufrn.pdsoft.model.Alimento

class BootStrap {

    def init = { servletContext ->
    	if(Alimento.count() == 0) {
    		new Alimento(nome: "Carambola, crua", calorias: 46, proteinas: 0.9, calcio: 5).save()
    		new Alimento(nome: "Jambo, cru", calorias: 27, proteinas: 0.9, calcio: 14).save()
    		new Alimento(nome: "Laranja, lima, crua", calorias: 46, proteinas:  1.1 , calcio: 31).save()
    	}
    }
    def destroy = {
    }
}
