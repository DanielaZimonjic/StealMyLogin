import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;

import java.net.URL;

public class Zadatak {
    /*Otići na https://www.stealmylogin.com/demo.html, uneti bilo koje kredencijale za login, prisisnuti dugme.
  Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje.
 Ako jeste, štampati “Nice”. Ako nije, štampati “Not nice.”
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.stealmylogin.com/demo.html ");
        WebElement ime = driver.findElement(By.name("username"));
        ime.sendKeys("dumb");
        WebElement lozinka = driver.findElement(By.name("password"));
        lozinka.sendKeys("dumber");
        WebElement prijaviSe = driver.findElement(By.xpath("/html/body/form/input[3]"));
        prijaviSe.click();

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals("https://example.com/")){
            System.out.println("Nice");

        }else{
            System.out.println("Not nice");
        }

        driver.quit();

    }
}
