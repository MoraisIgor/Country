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

package hollowsoft.country.extension

import hollowsoft.country.Country
import hollowsoft.country.R
import java.util.*

/**
 * @author Igor Morais
 */
val Country.image : Int
    get() = try { R.drawable::class.java.getField(id.toLowerCase()).getInt(null) } catch (e: NoSuchFieldException) { R.drawable.none }

fun Country.Companion.all(locale: Locale = Locale.getDefault()) : List<Country> {

    val array = ArrayList<Country>(Locale.getISOCountries().size)

    Locale.getISOCountries().forEach {

        val l = Locale(String.EMPTY, it)

        array.add(Country(l.isO3Country, l.getDisplayCountry(locale)))
    }

    return array
}
