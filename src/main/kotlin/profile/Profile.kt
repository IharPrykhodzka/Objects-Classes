package profile

class Profile(
        val id: Int,
        val login: String,
        val name: String,
        val surname: String,
        val status: String,
        val avatar: String) {

    fun fullName(): String {
        return "Полное имя: $name $surname"
    }

    val fullName2: String = "Полное имя: $name $surname"

    override fun toString(): String {
        return """id=$id, 
login='$login', 
name='$name', 
surname='$surname', 
status='$status', 
avatar='$avatar')
""".trimMargin()
    }
}