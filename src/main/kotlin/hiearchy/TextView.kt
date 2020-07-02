package hiearchy

open class TextView(open var text: String) : View() {
    constructor() : this("Some Text")

}