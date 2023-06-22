package com.kata.kataforfun.services

import org.springframework.stereotype.Component
import java.lang.StringBuilder

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        val digits = inputNumber.toString().toList().map { Character.getNumericValue(it) }
        val result = StringBuilder()
        if (inputNumber % 3 == 0) result.append("Kata")
        if (inputNumber % 5 == 0) result.append("For")
        digits.forEach { number ->
            if (number == 3) result.append("Kata")
            if (number == 5) result.append("For")
            if (number == 7) result.append("Fun")
        }
        return if (result.isNotEmpty()) result.toString() else inputNumber.toString()
    }

}