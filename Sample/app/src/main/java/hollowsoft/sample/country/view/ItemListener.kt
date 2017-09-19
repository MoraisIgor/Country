package hollowsoft.sample.country.view

/**
 * @author Igor Morais
 */
interface ItemListener<in T> {

    fun onSelect(type: T)
}
