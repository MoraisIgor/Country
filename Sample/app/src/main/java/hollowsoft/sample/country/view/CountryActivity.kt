package hollowsoft.sample.country.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import hollowsoft.country.Country
import hollowsoft.country.extension.image
import hollowsoft.sample.country.R
import hollowsoft.sample.country.helper.Constants

/**
 * @author Igor Morais
 */
class CountryActivity : AppCompatActivity() {

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContentView(R.layout.country)

        val country = intent.getParcelableExtra<Country>(Constants.Bundle.COUNTRY)

        findViewById<ImageView>(R.id.image).setImageResource(country.image)
    }
}