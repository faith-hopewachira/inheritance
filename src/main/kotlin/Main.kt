fun main() {
//    val mercy = Banker("Mercy", 45)
//    mercy.talk("Hello there")
//    mercy.eat()
    //    var amount = mercy.countMoney(arrayOf(100, 100, 200, 1000, 50, 100, 50))

//    var amount = mercy.countMoney(arrayOf(100, 100, 200, 1000, 50, 100, 50))
//    println(amount)



//    val rehema = Doctor("Rehema", 38)
//    rehema.sleep()
//    rehema.eat()
//    rehema.talk("")
//    rehema.treatPatient("Wato", "Malaria")




//    val wanjiku = Farmer("Wanjiku", 90)
//    wanjiku.cultivateLand()
//    wanjiku.eat()
//    wanjiku.sleep()

    val banker = Banker("Mercy", 45)
    val doctor = Doctor("Rehema", 90)
    val farmer = Farmer("Wanjiku", 47)


    banker.introduction()
    doctor.introduction()
    farmer.introduction()


    mystring("akirachix")

    var journalists = Journalists("me",27)
    journalists.eat()

    var police= Police("Stacy",90)
    police.run()

    val a = 90
    val b = 20
    val max = if( a>b) a else b
    println(max)

    allSum(arrayOf(10,10))















}
//OPEN MAKES IT POSSIBLE FOR OTHER CLASSES TO OWN PERSON
//THE PARENT/BASE CLASS
open class Person(var name: String,var age: Int){
    fun talk(words: String) {
        println(words)

    }

    //OVERIDING A FUNCTION- OPEN
    open fun eat() {
        println("yum")
    }

    open fun sleep() {
        println("zzzzzz")
    }
    open fun introduction(){
        println("Hi, I am $name")
    }
}




//INHERIT from person class
class Banker(name: String, age: Int): Person(name,age){


    fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        //TAKING EVERY ELEMENT IN NOTES ARRAY AND ADDING IT TO SUM
        notes.forEach { note -> sum += note }
        return sum

    }

    override fun eat() {
        println("Chop money!")
    }


}


class Doctor(name: String, age: Int): Person(name,age){



    fun countMoney(notes: Array<Int>): Int {
        var sum = 0

        //TAKING EVERY ELEMENT IN NOTES ARRAY AND ADDING IT TO SUM
        notes.forEach { note -> sum += note }
        return sum

    }


    fun treatPatient(patient: String, disease: String) {
        println("Treat $patient for $disease")

    }

    override fun introduction() {
        println("Hi, my name is Dr.$name")
    }



}


//WE PUT THE NAME AND AGE AS THE PARAMETERS SINCE THE FARMER AND THE DOCTOR ARE PEOPLE WHO HAVE NAME AND AGE
class Farmer(name: String, age: Int): Person(name,age){


    fun cultivateLand() {
        println("")
    }

    override fun eat() {
        //REFERENCING TO THE PARENT CLASS
//        super.eat()
        println("I am the food that I have grown")
    }


}

fun mystring(words: String){
    println(words.last())
}


//USING THE SPLIT FUNCTION
fun me(names: String){
//    var newAge = age + 1
    println(names.split(","))


}

class Journalists(name: String, age: Int): Person(name, age){
    fun reporting(){
        println("This is KBC")
    }

    override fun eat() {
        super.eat()
        println("Hi, I am eating")
    }



}

class Police(name: String,age: Int): Person(name, age){
    fun run(){
        println("fast")

    }

    override fun sleep() {
        super.sleep()
        println("zzz")
    }





}

fun allSum(numbers: Array<Int>){
    var nums = numbers.reduce{acc, curr -> acc + curr}
    println(nums)

}







