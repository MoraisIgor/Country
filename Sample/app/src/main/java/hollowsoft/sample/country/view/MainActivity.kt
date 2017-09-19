package hollowsoft.sample.country.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import hollowsoft.country.Country
import hollowsoft.country.extension.all
import hollowsoft.sample.country.R
import hollowsoft.sample.country.helper.Constants
import java.util.*

/**
 * @author Igor Morais
 */
class MainActivity : AppCompatActivity(), ItemListener<Country> {

    private val recyclerView by lazy { findViewById<RecyclerView>(R.id.recycler_view) }

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContentView(R.layout.main)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = CountryAdapter(this, Country.all(Locale.ENGLISH))
    }

    override fun onSelect(type: Country) {

        val intent = Intent(this, CountryActivity::class.java)
                .putExtra(Constants.Bundle.COUNTRY, type)

        startActivity(intent)
    }
}
