import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.guru99.com/test/upload/')

WebUI.delay(10)

WebDriver driver = DriverFactory.getWebDriver()

WebElement uploadElement = driver.findElement(By.id('uploadfile_0'))

//uploadElement.sendKeys("c:\\Users\\sshejwal\\OneDrive - R4 Technologies, LLC\\Desktop\\Katalon practise\\Login.txt");
//String filed = FileName

//WebUI.setText(findTestObject('Data feed/xpathFortable'), FileName)

