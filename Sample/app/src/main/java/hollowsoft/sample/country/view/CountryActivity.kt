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
