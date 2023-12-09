package com.example.kotlincrud1.pr1

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

fun main() {
    var f1 = Mono.just("Ind")
    println(f1)
    var f2 = Mono.just("SL")
    println(f2)
}