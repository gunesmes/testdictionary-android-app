package testrisk.dictionary.tests

import org.junit.Test
import testrisk.dictionary.pages.HomeScreen

class HomeScreenTests : BaseTest() {
    private var homeScreen = HomeScreen()

    @Test
    fun test_validateReadmeLoaded() {
        homeScreen.validateReadmeLoaded()
    }

    @Test
    fun test_validateSozlukLoaded() {
        homeScreen.validateSozlukLoaded()
    }
}
