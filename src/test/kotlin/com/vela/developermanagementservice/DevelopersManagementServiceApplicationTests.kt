package com.vela.developermanagementservice

import com.vela.developermanagementservice.infrastructure.presenter.controller.DeveloperController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@WebMvcTest(DeveloperController::class)
class DevelopersManagementServiceApplicationTests() {

	@Test
	fun contextLoads() {
	}



}
