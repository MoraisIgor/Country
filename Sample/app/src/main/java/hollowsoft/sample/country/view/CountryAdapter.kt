/*
 * Copyright 2017 Igor Morais
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

    override fun onCreateViewHolder(viewGroup: ViewGroup, type: Int) : ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        private val name = view.findViewById<TextView>(R.id.name)
        private val image = view.findViewById<ImageView>(R.id.image)

        fun bind(country: Country) {

            name.text = country.name

            country.image.let {

                image.setImageResource(it)
            }

            view.setOnClickListener {

                listener.onSelect(country)
            }
        }
    }
}
