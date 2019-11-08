import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('User Authentication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Data feed/Data Sources_link'))

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/div_Add'))

String classfound = CustomKeywords.'date.DateAndClassName.ClassNameWithDate'()

WebUI.setText(findTestObject('Data feed/input_Name_taskJobName'), classfound)

WebUI.setText(findTestObject('Data feed/textarea_Description_taskJobDescription'), classfound)

WebUI.delay(10)

WebUI.click(findTestObject('Data feed/div_Sample File_form-control task-job-bind input-form'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Data feed/div_Sample File_form-control task-job-bind input-form'), findTestData('dataIngest').getValue(
        1, 1), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Data feed/div_--cmstatattr'))

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/div_cmstatattr_20190911-201730_1568237429-2019csv'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('raw from data feed/new file'))

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/button_Ok'))

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/button_Done'))

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/next-btn'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Data feed/button_Create'))

WebUI.click(findTestObject('Data feed/div_Places_model-class-icon model-class-bind'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Data feed/select_Class'), '1226', true)

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/button_Create'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Data feed/tickBox'), 10)

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/tickBox'))

WebUI.delay(15)

WebUI.waitForElementClickable(findTestObject('Data feed/div_In Development'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('Data feed/div_In Development'))

