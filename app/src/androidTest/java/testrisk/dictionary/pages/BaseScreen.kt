package testrisk.dictionary.pages

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice

open class BaseScreen {

    // we are still free to use the UIAutomator
    val device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    companion object {
        const val defaultWaitTime = 10000
    }
}
