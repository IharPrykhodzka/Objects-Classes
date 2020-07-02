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


    val title = TextView("Main Screen")
    val main = ViewGroup(title)
    main.addView(title)


    val readMore = Button("Read more")
    val content = ViewGroup(readMore)
    content.addView(readMore)
}