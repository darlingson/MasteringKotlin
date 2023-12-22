fun main() {
    var person = Person()
    person.setName("Darlingson")
    person.setOccupation("Programmer")
    println(person.getDes())
}
class Person(){
    private var name:String = ""
        private set
    fun setName(n:String){
        this.name = n
    }
    private var occuputation = ""
        private set
    fun setOccupation(occ:String) {
        this.occuputation = occ
    }
    fun getDes(): String{
        var description : String = this.name + " is a " + this.occuputation
        return description
    }
}