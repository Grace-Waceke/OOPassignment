fun main(){
    var me=Humans("Dylan", 15, 50.7)
    me.eat(3)
    println(me.weight)

    me.speak("I am in school")
    me.birthday()

    var you=Humans("brenda", 22, 43.2)
    you.eat(3)
    println(you.weight)

    you.speak("It is her birthday")
    you.birthday()

    var lovely= user("Mary","Wambui", "marywambui@gmail.com", "0756345216", "stui354")
println(lovely.firstName)
    println(lovely.phoneNumber)
}
//Create a class called Human with these attributes: name, age, weight.
class Humans(var name: String, var age: Int, var weight:Double) {

    fun eat(foodWeight: Int) {
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")

    }
//speak(speech: String) :Prints the string passed to it
    fun speak(speech: String) {
        println(speech)

    }
    fun birthday(){
        age+=1
        println(age)

    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
data class user(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String )





