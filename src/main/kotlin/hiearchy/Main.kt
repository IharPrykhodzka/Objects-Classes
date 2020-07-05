package hiearchy

fun main() {

    val text = TextView("qwe")
    text.click() // вызывается метод из `View`

    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    val button = Button("sdf")
    button.click() // вызывается метод из `View`

    println(button.button) // Click me
    button.button = "Don't click me"
    println(button.button) // Don't click me


    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)


    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}