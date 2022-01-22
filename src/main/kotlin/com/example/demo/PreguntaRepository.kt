package com.example.demo

import com.google.gson.Gson

 class PreguntaRepository {
    companion object {
        var listaPreguntas = listOf(
            Pregunta("¿De que tipo es Charmander?","Lucha","Fuego","Acero","Hielo","Fuego",0),
            Pregunta("¿De que tipo es Mudkip?","Tierra","Fuego","Agua","Veneno","Agua",1),
            Pregunta("¿Cual es el primer juego de Pokemon?","Rojo","Amarillo","Verde","Rubi","Rojo",2),
            Pregunta("¿Cual de estos Pokemon es único en su rama evolutiva?","Lucario","Pikachu","Spiritom","Chansei","Spiritom",3),
            Pregunta("¿Que pokemon tiene las mismas estadisticas base que charizard en todas sus fases evolutivas?","Typhlosion","Dragonite","Evee","Magmar","Typhlosion",4),
            Pregunta("¿Que pokemon es abandonado por el rival de Ash en Pokemon Diamante y Perla?","Charmander","Chimchar","Pikachu","Keldeo","Charmander",5),
            Pregunta("¿Cuantas medallas hay que conseguir para entrar a la Liga Pokemon?","5","10","8","20","8",6),
            Pregunta("¿Como se llaman los pokemon que vienen de otra dimension en Pokemon Sol y Luna?","Visitantes","Ultraentes","Pokeastros","Legendarios","Ultraentes",7) ,
            Pregunta("¿De que tipo es Piplup?","Agua","Fuego","Acero","Psiquico","Agua",8),
            Pregunta("¿De que tipo es Charizard?","Fuego","Fuego-Volador","Dragon","Volador","Fuego-Volador",9)
        )
    }

}