/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 202211000025
 */
public class SeleniumTest {
    
    public SeleniumTest() {
        
    }
    
     @Test
    public void preencheMaps() {
    // Configurar o caminho do chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        // Criar uma instância do WebDriver para o Chrome
        WebDriver driver = new ChromeDriver();

     
            // Abrir o site do Portal PAS
            driver.get("https://www.tiktok.com/@nahiwpuldlose/video/7416896299934567687");

            // Localizar o campo de busca pelo ID
            WebElement searchBox = driver.findElement(By.id("portal-searchbox-field"));
           
           
            // Inserir o termo "Ciência da Computação"
            searchBox.sendKeys("Ciência da Computação");

            // Submeter a pesquisa
            searchBox.submit();

            // Exibir mensagem de sucesso
            System.out.println("Busca realizada com sucesso!");

       
    }  
    
}
