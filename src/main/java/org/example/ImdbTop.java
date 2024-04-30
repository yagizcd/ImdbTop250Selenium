package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImdbTop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://m.imdb.com/?ref_=nv_home");
        driver.manage().window().maximize();
        driver.findElement(By.id("imdbHeader-navDrawerOpen")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Top 250 Movies']")).click();
        Thread.sleep(500);
        List< WebElement> elements =driver.findElements(By.xpath("//ul[starts-with(@class,'ipc-metadata-list')]//h3"));
        for(WebElement element:elements){
            String movieTitles = element.getText();
            System.out.println(movieTitles);
        }
        driver.quit();
    }
}
