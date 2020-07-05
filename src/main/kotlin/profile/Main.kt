package profile

fun main() {

    val my = Profile(id = 12, login = "user", name = "Igor", surname = "Prihodka", status = "Pro100 Cool", avatar = "http...")
    println(my)
    println(my.fullName())
    println(my.fullName2)
}