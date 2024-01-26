package katalon.truetest

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

public class TrueTestScripts {
    
    public static void login() {
        try {
            
            WebUI.callTestCase(findTestCase('Test Cases/Login'), null)
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
}


