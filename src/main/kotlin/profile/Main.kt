package profile

fun main() {

    val my = Profile(id = 12, login = "user", name = "Igor", surname = "Prihodka", status = "Pro100 Cool", avatar = "http...", fullName2 = "dew")
    println(my)
    println(my.fullName())
    println(my.fullName2)
}