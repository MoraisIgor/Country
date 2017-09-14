package hollowsoft.sample.country

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * @author Igor Morais
 */
class CountryAdapter {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.name) as TextView
        val image: ImageView = view.findViewById(R.id.image) as ImageView

        fun bind(country: Country) {

            Log.d("Igor", "Nome: " + country.name + " acc: " + country.id)

            name.text = country.name
            image.setImageResource(country.image)
        }
    }
}
