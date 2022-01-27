package com.example.demo

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class PokemonController {

    @GetMapping("dameUnaPregunta")
    fun getPregunta():String{
        val i=Random.nextInt(0,PreguntaRepository.listaPreguntas.size)
        val json=PreguntaRepository.listaPreguntas[i].toString()
        val gson=Gson()
        val mapType=object : TypeToken<MutableMap<String,Any>>(){ }.type
        val mapaPreguntasRspuesta=gson.fromJson<MutableMap<String,Any>>(json,mapType)
        mapaPreguntasRspuesta.remove("respuestaCorrecta")
        return gson.toJson(mapaPreguntasRspuesta)

    }

    @GetMapping("responderPregunta/{id}/{respuesta}")
    fun getPokemonFavorito(@PathVariable respuesta: String,@PathVariable id:Int) :String  {
        val gson = Gson()
        var i=0
        var mensaje=""
        do {
            if (PreguntaRepository.listaPreguntas[i].id==id) {

                if (PreguntaRepository.listaPreguntas[id].respuestaCorrecta.equals(respuesta, ignoreCase = true)) {
                    println("Respuesta Correcta")
                    mensaje= "Respuesta Correcta"
                } else {
                    println("Respuesta Incorrecta")
                   mensaje="Respuesta Incorrecta"
                }
            }
            i++
        }while (i<PreguntaRepository.listaPreguntas.size)


        return mensaje
    }
}
