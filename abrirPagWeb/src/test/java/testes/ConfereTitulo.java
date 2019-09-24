package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfereTitulo {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\eclipse-workspace\\abrirPagWeb\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://estudante.sesisenai.org.br/login");
		assertTrue("Título da página não bate", driver.getTitle().contentEquals("Espaço do Estudante FIESC"));
		Thread.sleep(3000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.get("https://estudante.sesisenai.org.br/login");
		assertTrue("Título da página não bate", driver.getTitle().contentEquals("Espaço do Estudante FIESC"));
		Thread.sleep(3000);
	}

}
