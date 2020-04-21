package com.demo;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class Selenide_Test {

	@Test
	public void firstTest() {

		open("http://google.com");
		$(By.name("q")).setValue("selenide").pressEnter();
		

	}
}
