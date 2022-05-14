import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;


public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ciceksepeti.com/dogum-gunu");
        driver.manage().window().maximize();
        String firstWindow=driver.getWindowHandle();
        String firstWindowUrl= driver.getCurrentUrl();

        //Aradığımız ürünün arama kutusuna yazdık.
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav/ul/li[9]/span/a/span[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("Kol Saati");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/button")).sendKeys(Keys.ENTER);

        //Katagori,fiyat,sıralama ve ücretsiz kargoya göre filtreledik.
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[1]/div/a")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div[1]/ul/li[1]/label")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[6]")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[6]/div/div[1]/div[2]/div/input[1]")).sendKeys("700");
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[6]/div/div[1]/div[2]/div/input[2]")).sendKeys("1200");
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[6]/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[12]/a")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[12]/div/div[1]/ul/li[3]/label")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[11]/a")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[11]/div/div/div")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[11]/div/button")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div/div/a/div[2]/div")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div/div/a/div[2]/div")).click();

        //Tıkladığımız ürün yeni sekmede açıldığı için işlemimize devem etmek için yeni sekmeye geçiyoruz.
        Set<String> allWindows=driver.getWindowHandles();
        for (String window:allWindows){
            driver.switchTo().window(window);
        }

        //Ürünü sepete ekledik
        driver.findElement(By.xpath("/html/body/main/form/div/div/div[2]/div[2]/div[6]/div[13]/div[5]/button")).click();

        //Sepete gittik.
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/nav/ul/li[4]/a/span")).click();




    }
}
