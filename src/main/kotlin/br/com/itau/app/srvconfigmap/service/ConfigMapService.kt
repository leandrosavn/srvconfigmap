package br.com.itau.app.srvconfigmap.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime


@Component
@EnableScheduling
@Configuration
@ConfigurationProperties(prefix ="myconfig")
class ConfigMapService

 {

     @Autowired lateinit var chave1: String
     @Autowired lateinit var chave2: String

    @Scheduled(fixedDelay = 1000)
    fun listVars() {
        println(LocalDateTime.now().toString() + " - "+ arrayListOf(chave1,chave2))
    }


}