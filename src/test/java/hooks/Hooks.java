package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Hooks {
    public static WebDriver driver;

    public static EdgeOptions GenerateEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments(
                "--no-sandbox",
                "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
        );
        return options;
    }

    @Before
    public void openBrowser(){
        // Setup driver binary
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--no-sandbox",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
        );
        // Use options
        driver = new ChromeDriver(options);

        String appUrl = "https://www.rafiimalfa.com";
        driver.get(appUrl);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        if (driver != null) {
            driver.quit();
        }
    }
}
