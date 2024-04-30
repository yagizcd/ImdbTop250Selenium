package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://tr.wikipedia.org/wiki/Anasayfa");
        String suanki = driver.getCurrentUrl();
        /*
        if(suanki.contains("apple.com")){
            System.out.println(suanki);
        }
        String title = driver.getTitle();

        if (title.contains("pple"))
            System.out.println(title);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.etsy.com");

        driver.navigate().back();
        if (title.contains("pple"))
            System.out.println(title);

        driver.navigate().forward();
        title = driver.getTitle();
        System.out.println(title);
        */
        WebElement seckinMaddeHucre = driver.findElement(By.id("mp-tfa"));
        String butunMetin = seckinMaddeHucre.getText();
        String bol = butunMetin.split(",")[0];
        System.out.println(bol);
        WebElement kaliteliMadde = driver.findElement(By.id("mf-tfp"));
        String kaliteMMetin = kaliteliMadde.getText().split(",")[0];
        System.out.println(kaliteMMetin);
        driver.quit();

    }
}