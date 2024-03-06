import kotlin.contracts.Returns

//fun main() {
//    school(name = "Akirachix")
//    school(name = "Johannesburg")
//    school(name = "i a n an introvert")
//    sentence(name = "My name is Martha Mutua")
//    school2("University of Nairobi")
//    sentence("Martha",24)
//    add(5,7)
//    add(5,7)
//
//    var identity = sentence("Martha",34)
//    println(identity)
//
//}
//fun school(name:String){
//    println(name[0].toString()+name[2].toString()+name[3].toString())
//}
//fun sentence(name: String){
//    println(name[1].toString()+name[5].toString()+name[9].toString()+name[11])
//}
//fun school2(name:String){
//    print(name[0])
//    print(name[3])
//    print(name[5])
//}
//
//fun sentence(x:String,y:Int) :String {
//    var identity = "Hi, my name is $x and I am $y years old"
//    return identity
//}
//
//fun add(a:Int,b:Int):Int{
//    var sum=a+b
//    return sum
//
//}
////fun sum(m:String,n:Int):String{
////    var add= m+n
////    println(add)
////}
//fun main(){
//    var salutation=sentence("Thomas",56)
//    println(salutation)
//    var statement=sentence("mangoes","apples")
//    println(statement)
//    school("University")
//    var fruit=word("orange")
//    println(fruit)
//    var book=word("lost")
//    println(book)
//    myName("Martha")
//
//}
//fun sentence(x:String,y:Int):String{
//    var salutation="Hello, my name is $x and am $y years old"
//    return salutation
//
//}
//fun sentence(name:String,name2: String):String{
//    var statement="I went to the market and bought $name and $name2 for my kids"
//    return statement
//}
//fun school(name: String){
//    println(name[1].toString() + name[3].toString() + name[4].toString())
//}
//fun word(name: String) :Int{
//    var fruit= name.length
//    return fruit
//}
//fun word2(name: String):Int{
//    var book=name.length
//    return book
//
//}
//fun myName(name: String) {
//    if (name == "Martha")
//        println("That's me!")
//    else {
//        println("I dont know who that is")
//    }
//}
fun main(){
    school("Akirachix")
    var statement=sentence("Martha",56)
    println(statement)
    var name=word("Encyclopaedia")
    println(name)
    name("Martha")


}
fun school(name:String){
    println(name[0].toString()+name[2].toString()+name[3].toString())
}
fun sentence(x:String,y:Int):String{
    var statement="Hi, my name is $x and I am $y years old"
    return statement
}
fun word(name: String):Int{
    var name=name.length
    return name
}
fun name(name: String) {
    if (name == "Martha")
        println("That's me!")
    else {
        println("I don't know who that is")
    }

}



