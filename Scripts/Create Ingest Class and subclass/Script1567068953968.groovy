import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('User Authentication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Ingest Class and subclass/Data Strategy_Link'))

WebUI.click(findTestObject('Object Repository/Ingest Class and subclass/button_'))

WebUI.click(findTestObject('Object Repository/Ingest Class and subclass/open space'))

WebUI.waitForAlert(5, FailureHandling.STOP_ON_FAILURE)

String classfound = CustomKeywords.'date.DateAndClassName.ClassNameWithDate'()

CustomKeywords.'date.DateAndClassName.enterClassNameAndDesc'()

WebUI.click(findTestObject('Ingest Class and subclass/option_Things'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Ingest Class and subclass/button_OK'))

WebUI.delay(5)

//focus on circle to create sub class
CircleforSubClass = new TestObject('xpathFortable')

CircleforSubClass.addProperty('xpath', ConditionType.EQUALS, ('//*[local-name()=\'svg\'][1]//*[local-name()=\'g\']/*[text()=\'' + 
    classfound) + '\']//following-sibling::*[@class=\'dataMapNodeGear\']/*[@class=\'configGearIconWrapper\']')

WebUI.focus(CircleforSubClass)

WebUI.delay(5)

//click on circle to create sub class
CircleforSubClass2 = new TestObject('circleButton')

CircleforSubClass2.addProperty('xpath', ConditionType.EQUALS, ('//*[local-name()=\'svg\'][1]//*[local-name()=\'g\']/*[text()=\'' + 
    classfound) + '\']//following-sibling::*[@class=\'dataMapNodeGear\']/*[@class=\'configGearIconWrapper d3ToolTipEnabled\']')

WebUI.click(CircleforSubClass2)

WebUI.delay(5)

//click on 'Add subclass button' to create sub class
Addsubclassbutton = new TestObject('Add subclass button')

Addsubclassbutton.addProperty('xpath', ConditionType.EQUALS, ('//*[local-name()=\'svg\'][1]//*[local-name()=\'g\']/*[text()=\'' + 
    classfound) + '\']//following-sibling::*[@class=\'dataMapNodeGear toggleGearMenu\']//child::*[@class=\'configGearMenu\']//child::*[@class=\'configGearIcon\'][2]')

WebUI.click(Addsubclassbutton)

WebUI.delay(5)

String SubClass = CustomKeywords.'date.DateAndClassName.SubClassNameWithDate'()

WebUI.sendKeys(findTestObject('Ingest Class and subclass/SubclassName'), SubClass)

/*SubClassStorageName = new TestObject('Add subclass button')
SubClassStorageName.addProperty('xpath', ConditionType.EQUALS, ('//*[local-name()=\'svg\'][1]//*[local-name()=\'g\']/*[text()=\'' +
	classfound) + '\']//following-sibling::*[@class=\'dataMapNodeGear\']/*[@class=\'configGearIconWrapper\']')
WebUI.focus(SubClassStorageName)

WebUI.setText(findTestObject('Ingest Class and subclass/SubclassName'), 'Sub Class')*/
WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Ingest Class and subclass/select_StorageType'), 
    '1', false)

WebUI.click(findTestObject('Object Repository/Ingest Class and subclass/button_Create'))

