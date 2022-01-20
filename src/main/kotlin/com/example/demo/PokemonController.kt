package com.example.demo

import com.google.gson.Gson
import com.google.gson.JsonObject
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class PokemonController {

    @GetMapping("dameUnaPregunta")
    fun getPregunta():String{

        return  PreguntaRepository.listaPreguntas.random().toString()
    }

    @GetMapping("responderPregunta/{respuesta}")
    fun getPokemonFavorito(@PathVariable respuesta: String,@PathVariable id:Int) :String  {
        val gson = Gson()


        if (PreguntaRepository.listaPreguntas[id].respuestaCorrecta.toLowerCase().equals(respuesta.toLowerCase())) {
            println("Respuesta Correcta")
             return gson.toJson("Respuesta Correcta")
        }
        else {
            println("Respuesta Incorrecta")
            return gson.toJson("Respuesta Incorrecta\n")
        }
    }
}
