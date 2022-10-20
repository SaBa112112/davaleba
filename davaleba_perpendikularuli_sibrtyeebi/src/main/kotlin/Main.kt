fun main(){

    val gantoleba1 = sibrtye(3,5,8,11,51,1,7,2)

    gantoleba1.sibrtye1()
    gantoleba1.sibrtye2()

    gantoleba1.pasuxi()
}

class sibrtye(var A1: Int, var B1: Int, var C1: Int, var D1: Int,  var A2: Int, var B2: Int, var C2: Int, var D2: Int ){

    fun sibrtye1(){
        println("pirveli sibrtyis gantolebaa: $A1*x + $B1*y + $C1*z + $D1 = 0")
    }
    fun sibrtye2(){
        println("meore sibrtyis gantolebaa: $A2*x + $B2*y + $C2*z + $D2 = 0")
    }

    fun pasuxi(){
        if(A1*A2 + B1*B2 + C1*C2 == 0){
            println("sibrtyeebi martobulia")
        }
        else{
            println("sibrtyeebi araa perpendikularuli")
        }
    }
}
