package gogo.demo.boot.admin_dashboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdminDashboardApplication

fun main(args: Array<String>) {
	runApplication<AdminDashboardApplication>(*args)
}
