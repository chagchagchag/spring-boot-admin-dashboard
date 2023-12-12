package gogo.demo.boot.admin_client1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdminClient1Application

fun main(args: Array<String>){
    runApplication<AdminClient1Application>(*args)
}