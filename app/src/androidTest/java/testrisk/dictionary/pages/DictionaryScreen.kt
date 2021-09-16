package testrisk.dictionary.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import testrisk.dictionary.R

class DictionaryScreen : BaseScreen() {
    private var recyclerViewSozluk = Espresso.onView(withId(R.id.recyclerView))
    private var searchImage = Espresso.onView(withId(R.id.imageSearch))

    fun validateDictionaryLoaded() {
        searchImage.check(ViewAssertions.matches(isDisplayed()))
        recyclerViewSozluk.check(ViewAssertions.matches(isDisplayed()))
    }

}
