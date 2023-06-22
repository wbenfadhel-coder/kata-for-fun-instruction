package com.kata.kataforfun

import com.kata.kataforfun.services.KataForFunService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Disabled("Disabled until the implementation of the service")
class KataForFunApplicationTests {

    @InjectMocks
    private lateinit var kataForFunService: KataForFunService


    @Test
    fun should_return_1_when_input_is_1() {
        Assertions.assertEquals("1", kataForFunService.convertNumber(1))
    }

    @Test
    fun should_return_KataKata_when_input_is_3() {
        Assertions.assertEquals("KataKata", kataForFunService.convertNumber(3))
    }

    @Test
    fun should_return_ForFor_when_input_is_5() {
        Assertions.assertEquals("ForFor", kataForFunService.convertNumber(5))
    }

    @Test
    fun should_return_Fun_when_input_is_7() {
        Assertions.assertEquals("Fun", kataForFunService.convertNumber(7))
    }

    @Test
    fun should_return_Kata_when_input_is_9() {
        Assertions.assertEquals("Kata", kataForFunService.convertNumber(9))
    }

    @Test
    fun should_return_KataFor_when_input_is_51() {
        Assertions.assertEquals("KataFor", kataForFunService.convertNumber(51))
    }

    @Test
    fun should_return_ForKata_when_input_is_53() {
        Assertions.assertEquals("ForKata", kataForFunService.convertNumber(53))
    }

    @Test
    fun should_return_KataKataKata_when_input_is_33() {
        Assertions.assertEquals("KataKataKata", kataForFunService.convertNumber(33))
    }

    @Test
    fun should_return_KataFun_when_input_is_27() {
        Assertions.assertEquals("KataFun", kataForFunService.convertNumber(27))
    }

    @Test
    fun should_return_KataForFor_when_input_is_15() {
        Assertions.assertEquals("KataForFor", kataForFunService.convertNumber(15))
    }


}
