package testrisk.dictionary.utils

import androidx.annotation.IdRes
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Assert
import testrisk.dictionary.pages.BaseScreen
import java.lang.Thread.sleep

fun waitUntilElementVisible(element: ViewInteraction, timeOut: Int = BaseScreen.defaultWaitTime) {
    waitUntil(timeOut) { element.check(ViewAssertions.matches(isDisplayed()))}
}

private fun waitUntil(timeOut: Int, @IdRes assertion: () -> Any) {
    val endTime = System.currentTimeMillis() + timeOut
    do {
        runCatching { assertion() }
            .onSuccess { return }
            .onFailure { sleep(100) }
    } while (System.currentTimeMillis() < endTime)
    Assert.fail("Failed to wait for element")
}
fun textVisible(element: ViewInteraction, text: String) = runCatching {
    element.check(ViewAssertions.matches(withText(text))) }.isSuccess

