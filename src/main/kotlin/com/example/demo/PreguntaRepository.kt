package com.example.demo

import com.google.gson.Gson

data class PreguntaRepository(var nombre: String, var nivel: Int) {
    companion object {
        var listaPreguntas = listOf(
            Pregunta("¿De que tipo es Charmander?","Lucha","Fuego","Acero","Hielo","Fuego",1),
            Pregunta("¿De que tipo es Mudkip?","Tierra","Fuego","Agua","Veneno","Agua",2),
            Pregunta("¿Cual es el primer juego de Pokemon?","Rojo","Amarillo","Verde","Rubi","Rojo",3),
            Pregunta("¿Cual de estos Pokemon es único en su rama evolutiva?","Lucario","Pikachu","Spiritom","Chansei","Spiritom",4),
            Pregunta("¿Que pokemon tiene las mismas estadisticas base que charizard en todas sus fases evolutivas?","Typhlosion","Dragonite","Evee","Magmar","Typhlosion",5),
            Pregunta("¿Que pokemon es abandonado por el rival de Ash en Pokemon Diamante y Perla?","Charmander","Chimchar","Pikachu","Keldeo","Charmander",6),
            Pregunta("¿Cuantas medallas hay que conseguir para entrar a la Liga Pokemon?","5","10","8","20","8",7),
            Pregunta("¿Como se llaman los pokemon que vienen de otra dimension en Pokemon Sol y Luna?","Visitantes","Ultraentes","Pokeastros","Legendarios","Ultraentes",8) ,
            Pregunta("¿De que tipo es Piplup?","Agua","Fuego","Acero","Psiquico","Agua",9),
            Pregunta("¿De que tipo es Charizard?","Fuego","Fuego-Volador","Dragon","Volador","Fuego-Volador",10)
        )
    }

}