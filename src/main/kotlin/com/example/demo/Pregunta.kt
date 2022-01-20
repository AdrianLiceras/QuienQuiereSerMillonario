package com.example.demo

import com.google.gson.Gson

class Pregunta(
    var pregunta:String,
    var a:String,
    var b:String,
    var c:String,
    var d:String,
    var respuestaCorrecta:String,
    var id:Int) {

    override fun toString(): String {
        val gson = Gson()

        return gson.toJson("Pregunta: $pregunta Respuestas: -$a        -$b        -$c        -$d")


    }


}