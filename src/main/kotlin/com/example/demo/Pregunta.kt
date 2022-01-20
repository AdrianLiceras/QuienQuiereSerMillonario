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

       // "Pregunta:\n $pregunta\nRespuestas:\n -$a        -$b        -$c        -$d\n"
        return gson.toJson( this)

    }


}