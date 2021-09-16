package testrisk.dictionary.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Assert
import testrisk.dictionary.R

class HomeScreen : BaseScreen() {
    private var btnHomeScreen = Espresso.onView(withId(R.id.navigation_home))
    private var btnSozluk = Espresso.onView(withId(R.id.navigation_dictionary))
    private var btnLicense = Espresso.onView(withId(R.id.navigation_about))
    private var titleHomeScreen = Espresso.onView(withId(R.id.header))
    private var contentHomeScreen = Espresso.onView(withId(R.id.message))
    private var loader = Espresso.onView(withId(R.id.loadingPanel))

    fun validateReadmeLoaded() {
        btnHomeScreen.check(ViewAssertions.matches(isDisplayed()))
        btnSozluk.check(ViewAssertions.matches(isDisplayed()))
        btnLicense.check(ViewAssertions.matches(isDisplayed()))

        // How to check if text view equals to som text
        // Junit assert lib gives result and expected more clearly
        // Junit assertEquals
        // val textView: TextView = device.findObject()
        // Assert.assertEquals("Neden Sözlük", textView.text)

        // Espresso matcher
        titleHomeScreen.check(ViewAssertions.matches(withText("Neden Sözlük")))

        Assert.assertTrue(contentHomeScreen.toString().contains("test"))
    }

    fun validateSozlukLoaded() {
        goToSozluk()
        loader.check(ViewAssertions.matches(isDisplayed()))
    }

    fun goToSozluk() {
        btnSozluk.check(ViewAssertions.matches(isClickable())).perform(ViewActions.click())
    }

    fun goToLicense() {
        btnLicense.check(ViewAssertions.matches(isClickable())).perform(ViewActions.click())
    }
}
