fun main() {
var truth=Human("Patience",29,89.6.toFloat())
truth .eat(4)
var speech=("Everything in life is about balance")
    println(speech)
    println(truth.age+1)
    var person=User("Anita","Arinda","anitaarinda@gmail.com","flora",777726064)
    println(person.firstName)
    println(person.Email)




}
class Human(var name:String,var age:Int,var weight:Float){
    fun eat(foodWeight:Int) {
        weight = foodWeight + weight
        println("I am eating $foodWeight Kgs of food")

        fun speak(speech: String) {
            println("Everything in life is about balance")

        }

        fun birthday(age: Int) {
            println(age + 1)
        }
    }
    }
data class User( var firstName:String, var lastName:String, var Email:String, var passWord:String, var phoneNumber:Int){

}
