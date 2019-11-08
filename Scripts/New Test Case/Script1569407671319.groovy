import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ipsilon.r4cloud.com/idp/login/form?ipsilon_transaction_id=3294baac-b50d-4445-aa11-1e4dfaad6d66')

WebUI.setText(findTestObject('Object Repository/ok/input_Username_login_name'), 'testuser-admin')

WebUI.setEncryptedText(findTestObject('Object Repository/ok/input_Password_login_password'), 'DAa4LTRindcaUhZwSqgezg==')

WebUI.click(findTestObject('Object Repository/ok/button_Log In'))

WebUI.click(findTestObject('Object Repository/ok/a_Try to login again'))

WebUI.setText(findTestObject('Object Repository/ok/input_Username_login_name'), 'testuser-admin')

WebUI.setEncryptedText(findTestObject('Object Repository/ok/input_Password_login_password'), 'egEsBSkeffvnoFbf4z26kg==')

WebUI.click(findTestObject('Object Repository/ok/button_Log In'))

WebUI.click(findTestObject('Object Repository/ok/span_Data Sources'))

WebUI.click(findTestObject('Object Repository/ok/div_Add'))

