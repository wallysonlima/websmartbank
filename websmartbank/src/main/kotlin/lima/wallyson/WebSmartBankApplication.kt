package lima.wallyson

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebSmartBankApplication

fun main(args: Array<String>) {
	runApplication<WebSmartBankApplication>(*args)
}
