package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class PokemonController {
    var preg=0
    @GetMapping("dameUnaPregunta")
    fun getPregunta():String{
        preg=Random.nextInt(0,PreguntaRepository.listaPreguntas.size)
        return PreguntaRepository.listaPreguntas[preg].toString()
    }

    @GetMapping("responderPregunta/{respuesta}")
    fun getPokemonFavorito(@PathVariable respuesta: String) : String {
        if (respuesta.toLowerCase().equals(PreguntaRepository.listaPreguntas[preg].respuestaCorrecta.toLowerCase())) {
            println("Respuesta Correcta")
            return "Respuesta Correcta\n"
        }
        else {
            println("Respuesta Incorrecta")
            return "Respuesta Incorrecta\n"
        }
    }
}