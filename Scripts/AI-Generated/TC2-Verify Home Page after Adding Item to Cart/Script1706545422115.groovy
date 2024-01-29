import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page  inventory html'

WebUI.navigateToUrl(GlobalVariable.application_domain + 'inventory.html')

'Step 2: At Page inventory html, click on button add to cart sauce labs backpack'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_add_to_cart_sauce_labs_backpack'))

'Step 3: At Page inventory html, click on hyperlink 2 > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/hyperlink_object'))

'Step 4: Add visual checkpoint at Page home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Home Page after Adding Item to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
