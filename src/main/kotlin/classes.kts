import java.util.*

class User(var id: Int, var firstName: String, var lastName: String, var email:String, var birthDate: Date)
class Post(var id: Int, var idUser: Int, var text: String, var dateCreation: Date)
class Message(var idUserEnvoi: Int, var iduserReception: Int, var text: String, var dateCreation: Date)