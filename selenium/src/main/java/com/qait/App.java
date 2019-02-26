package com.qait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/yogesh/ooo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement  searchbox = driver.findElement(By.name("q"));
        //searchbox.click();
        String query ="Qa Infotech";
        searchbox.sendKeys(query);
        //WebElement btn = driver.findElement(By.name("btnK"));
        //btn.click();
        searchbox.submit();
        WebElement result = driver.findElement(By.className("iUh30"));
        String link = result.getText();
        WebElement text = driver.findElement(By.className("st"));
        String linktext = text.getText();
        //System.out.println(link);
        //System.out.println(linktext);
        String finalresult = link + linktext;
        System.out.println(finalresult);
    }
}
