package testrisk.dictionary.tests

import org.junit.Before
import org.junit.Test
import testrisk.dictionary.pages.DictionaryScreen
import testrisk.dictionary.pages.HomeScreen

class DictionaryScreenTests : BaseTest() {
    private var dictionaryScreen = DictionaryScreen()
    private var homeScreen = HomeScreen()

    @Before
    override fun setUp() {
        homeScreen.goToSozluk()
    }

    @Test
    fun testSozlukLoaded() {
        dictionaryScreen.validateDictionaryLoaded()
    }
}
