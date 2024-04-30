package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://the-internet.herokuapp.com/login");

        //İstenileni yapıyor mu? Pozitif test



        //İstenmeyeni yapıyor mu? Negatif Test

        //Internet login sayfasına git.
        //Kullanıcı ad
        // - şifre gir
        // - login butonuna bas

        //Yanlis kullanıcı adında  Your username is invalid! mesajı görünecek

        //Sifre yanlis ise Your password is invalid! hatası görünecek

        //İkisi de doğru ise https://the-internet.herokuapp.com/secure bu linke gidecek
        // You logged into a secure area! bu mesajı görecek

        //Negatif test 1 yanlis id

        chromeDriver.findElement(By.id("username")).sendKeys("asdas");

        chromeDriver.findElement(By.className("radius")).click();

        String wronUsName = chromeDriver.findElement(By.id("flash")).getText();
        System.out.println("Wrong Usarname Test");
        if (wronUsName.contains("username is invalid"))
            System.out.println("Tebrikler test basarili");
        else
            System.out.println("Test basarisiz.");

        chromeDriver.navigate().refresh();

        chromeDriver.findElement(By.id("username")).sendKeys("tomsmith");
        chromeDriver.findElement(By.id("password")).sendKeys("ascasc");
        chromeDriver.findElement(By.className("radius")).click();

        String wrongPassword = chromeDriver.findElement(By.id("flash")).getText();

        System.out.println("Wrong Password Test");
        if (wrongPassword.contains("password is invalid"))
            System.out.println("Tebrikler test basarili");
        else
            System.out.println("Test basarisiz.");

        chromeDriver.navigate().refresh();

        chromeDriver.findElement(By.id("username")).sendKeys("tomsmith");
        chromeDriver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        chromeDriver.findElement(By.className("radius")).click();

        String truePassandUs = chromeDriver.findElement(By.id("flash")).getText();
        String link = chromeDriver.getCurrentUrl();

        System.out.println("Positive test");
        if (truePassandUs.contains("You logged") && link.contains("secure"))
            System.out.println("Tebrikler test basarili");
        else
            System.out.println("Test basarisiz");

        chromeDriver.quit();




    }

}
