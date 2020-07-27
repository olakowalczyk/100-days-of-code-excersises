package base.chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3ExerciseTest {

    private WebDriver driver;

    public static void main(String[] args){
        Chapter3ExerciseTest test = new Chapter3ExerciseTest();
        test.setUp();
    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> menu = driver.findElements(By.cssSelector("ul > li"));
        System.out.println("There's " + menu.size() + " menu elements.");

        driver.quit();
    }
}
