package profile

class Profile(
        val id: Int,
        val login: String,
        val name: String,
        val surname: String,
        val status: String,
        val avatar: String,
        fullName2: String) {

    fun fullName(): String {
        return "Полное имя: $name $surname"
    }

    var fullName2: String = fullName2
    get() = this.name + " " + this.surname


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