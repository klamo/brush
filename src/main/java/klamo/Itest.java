package klamo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Itest {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.get(
          "https://hz.58.com/huangyezonghe/?key=%E5%BC%80%E9%94%81%E6%8F%90%E4%BE%9B%E5%BC%80%E9%94%81%E6%99%BA%E8%83%BD%E9%94%81%E6%9C%8D%E5%8A%A1&cmcskey=%E5%BC%80%E9%94%81%E6%8F%90%E4%BE%9B%E5%BC%80%E9%94%81%E6%99%BA%E8%83%BD%E9%94%81%E6%9C%8D%E5%8A%A1&final=1&jump=1&specialtype=gls&classpolicy=LBGguide_A,main_B,service_B,hitword_false,uuid_a9fb547efbcc4ad3bd4d3bd9b5c959a2,displocalid_79,from_main,to_jump,strategy,uuid_3aef3c133a204a6b8dc86bf0ad6aced4,displocalid_79,from_394261,to_jump&classpolicy=LBGguide_A%2Cmain_B%2Cservice_B%2Chitword_false%2Cuuid_a9fb547efbcc4ad3bd4d3bd9b5c959a2%2Cdisplocalid_79%2Cfrom_main%2Cto_jump");

      String title = driver.getTitle();
      WebElement search_setting = driver.findElement(By.linkText("开锁提供开锁智能锁服务"));
      Actions action = new Actions(driver);
      action.click(search_setting).perform();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.printf(title);
      driver.quit();
    }
  }
}
