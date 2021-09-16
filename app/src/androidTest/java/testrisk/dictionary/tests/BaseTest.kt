package testrisk.dictionary.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import testrisk.dictionary.MainActivity

@RunWith(AndroidJUnit4::class)
open class BaseTest {
    @Before
    open fun setUp() {
    }

    @Rule
    @JvmField
    var activityTestsRule = ActivityTestRule(MainActivity::class.java, true, true)
}
