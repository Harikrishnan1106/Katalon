import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.instagram.android')

Mobile.waitForElementPresent(findTestObject('Instagram/Log in to another account'), 3)

Mobile.tap(findTestObject('Instagram/Log in to another account'), 4)

if (true) {
    Mobile.waitForElementPresent(findTestObject('Instagram/NONE OF THE ABOVE'), 5)

    Mobile.tap(findTestObject('Instagram/NONE OF THE ABOVE'), 3)
}

Mobile.waitForElementPresent(findTestObject('Instagram/Username'), 5)

Mobile.tap(findTestObject('Instagram/Username'), 3)

Mobile.tap(findTestObject('Instagram/CrossMark'), 3)

Mobile.setText(findTestObject('Instagram/Username'), 'harikrishnan_muruganantham', 0)

Mobile.tap(findTestObject('Instagram/InstaLogo'), 3)

Mobile.tap(findTestObject('Instagram/BeforeClickPassword'), 3)

Mobile.setText(findTestObject('Instagram/Password'), 'Tamil*1106', 0)

Mobile.tap(findTestObject('Instagram/InstaLogo'), 3)

Mobile.tap(findTestObject('Instagram/Log in'), 3)

Mobile.waitForElementPresent(findTestObject('Instagram/Your story'), 10)

Mobile.closeApplication()

