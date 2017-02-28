import org.openqa.selenium.Dimension
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

/**
 * Created by guptab4 on 1/13/2017.
 */

baseUrl = "http://www.google.com"

/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer()
capabilities.setBrowserName("iexplore")
capabilities.setVersion("11")
capabilities.setCapability("platform", org.openqa.selenium.Platform.WINDOWS)*/

driver = {
    System.setProperty("webdriver.ie.driver", new File("bin/IEDriverServer.exe").absolutePath)
    new InternetExplorerDriver()
    /*new RemoteWebDriver(new URL(baseUrl), capabilities).with {
        manage().window().setSize(new Dimension(1384, 873))
    }*/
    //new RemoteWebDriver(new URL(baseUrl), capabilities)
}

environments {
    // Specify environment via -D geb.env=ie
    'ie' {
        System.setProperty("webdriver.ie.driver", new File("bin/IEDriverServer.exe").absolutePath)
        driver = {new InternetExplorerDriver()}
        /*driver = {new RemoteWebDriver(new URL(baseUrl), capabilities).with {
            manage().window().setSize(new Dimension(1384, 873))
        }}*/
    }

    'chrome' {
        System.setProperty("webdriver.chrome.driver", new File("bin/chromedriver.exe").absolutePath)
        driver = {new ChromeDriver()}
    }

    'firefox-linux-64' {
        System.setProperty("webdriver.gecko.driver", new File("bin/geckodriver-linux-64bit").absolutePath)
        driver = {new FirefoxDriver()}
    }
}

waiting {
    timeout = 10
    retryInterval = 0.5
    slow { timeout = 12 }
    reallySlow { timeout = 24 }
}

reportsDir = "target/geb-reports"
baseNavigatorWaiting = true
atCheckWaiting = true