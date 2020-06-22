package hiearchy

class ViewGroup(): View() {

    fun addView(view: View): View {
        println(view)
        return view
    }
}