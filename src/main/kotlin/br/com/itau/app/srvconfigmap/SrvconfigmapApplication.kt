package br.com.itau.app.srvconfigmap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SrvconfigmapApplication

fun main(args: Array<String>) {
	runApplication<SrvconfigmapApplication>(*args)
}
