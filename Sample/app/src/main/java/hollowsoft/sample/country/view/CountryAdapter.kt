package hollowsoft.sample.country.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import hollowsoft.country.Country
import hollowsoft.country.extension.image
import hollowsoft.sample.country.R

/**
 * @author Igor Morais
 */
class CountryAdapter(private val listener: ItemListener<Country>, private val list: List<Country>) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    override fun getItemCount() : Int = list.size

    override fun onCreateViewHolder(viewGroup: ViewGroup?, type: Int) : ViewHolder {

        val view = LayoutInflater.from(viewGroup?.context).inflate(R.layout.item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(list[position])
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        private val name = view.findViewById<TextView>(R.id.name)
        private val image = view.findViewById<ImageView>(R.id.image)

        init {

            view.setOnClickListener {

            }
        }

        fun bind(country: Country) {

            name.text = country.name

            country.image?.let {

                image.setImageResource(it)
            }

            view.setOnClickListener {

                listener.onSelect(country)
            }
        }
    }
}
