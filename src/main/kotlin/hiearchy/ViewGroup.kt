package hiearchy

class ViewGroup(): View() {

    fun addView(view: View) {
        view.click()
    }

}