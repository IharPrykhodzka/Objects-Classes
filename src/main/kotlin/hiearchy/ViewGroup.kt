package hiearchy

class ViewGroup(var someView: View): View() {

    fun addView(view: View) {
        println(view)
    }

}