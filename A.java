package aa.bb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class A {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main2(String... args) {

         IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
     }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(2342342332L);
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
       int j;
        j = addition.operation(34,44);


        Integer invalidInput = 234;

 //        final Consumer<Integer> tConsumer = x -> {
//            (x + 34) == 344
//        };



        System.setProperty("webdriver.chrome.driver", "/Users/master/downloads/chromedriver");
        System.out.println("starting selenium web driver");

        ChromeDriver driver = new ChromeDriver();
//       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

         String alertMessage = "";

        driver.get("https://www.taiwannews.com.tw/");

//        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
//        alertMessage = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();

//        System.out.println(alertMessage);
                 Actions act1 = new Actions(driver).moveToElement(
                driver.findElementByClassName("categories")).
                doubleClick();

act1.build().perform();
         ((JavascriptExecutor)driver).executeScript("window.scroll(0,window.scrollY + 400);");
         Actions act2 = new Actions(driver).moveToElement(
                driver.findElementByLinkText("Sports & Entertainment"));
        act2.build().perform();


        System.out.println(111);
        if (true) return;
        System.out.println(222);
        Actions act = new Actions(driver).moveToElement(
                driver.findElementByClassName("categories")).
                clickAndHold().moveByOffset(0,800);

        act.build().perform();

        if (true) return;
        Thread.sleep(3000);



        JavascriptExecutor js  =  (JavascriptExecutor)driver;
        js.executeScript("console.log('hello');");

        js.executeScript("window.scroll(0,2000);");

try {
    driver.findElement(By.cssSelector("[name='ctl00$cphContent$LoginBox$btnLogin']")).click();


    WebElement elem = driver.findElement(By.id("cphContent_cphMainForm_txtLoginID"));
    elem.click();
    elem.sendKeys("lindawoods");

    elem = driver.findElement(By.id("cphContent_cphMainForm_txtMyword"));
    elem.click();
    elem.sendKeys("lindawoods");

    elem = driver.findElementById("cphContent_cphMainForm_ddlTakeMeTo");
    Select sel = new Select(elem);
    sel.selectByVisibleText("Loan Detail");


    driver.findElement(By.id("cphContent_cphMainForm_txtLoginID")).click();
    Actions s = new Actions(driver).moveToElement(
            driver.findElementByTagName("body")).
            clickAndHold().moveByOffset(0, 800);

    s.build().perform();
}catch(Exception e){

}
//        driver.quit();

    }
}
