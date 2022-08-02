package com.seongbin.seongbinmall.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import java.io.File

/**
 * @author Seongbin Lim
 */

@Controller
class MainController {

    @GetMapping("/")
    fun getProducts(): ResponseEntity<Any> {
        return ResponseEntity.ok().body("none time out")
    }

    @GetMapping("/time-out")
    fun getProductsTimeOut(): ResponseEntity<Any> {
        Thread.sleep(2000)
        return ResponseEntity.ok().body("2 sec time out")
    }

    @GetMapping("/health-check")
    fun check(): ResponseEntity<Any> {
        return ResponseEntity.ok().body("ok")
    }

    @GetMapping("/create-file")
    fun createFile(): ResponseEntity<Any> {
        File("filetest.txt").printWriter().use { out ->
            out.println("create file")
        }
        return ResponseEntity.ok().body("ok")
    }
}
