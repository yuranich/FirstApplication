package home.yuranich.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val max = intent.getIntExtra(TOTAL_COUNT, 0)
        val randomInt = if (max > 0) Random.nextInt(max+1) else 0

        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_heading, max)
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
