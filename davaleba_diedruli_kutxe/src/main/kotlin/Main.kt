import kotlin.math.sqrt

fun main(){
    var x = Angle(1.0,8.0,3.0,7.0,9.0,12.0,4.0,2.0)
    x.sibrtye1()
    x.sibrtye2()
    x.pasuxi()
}

class Angle(var A1: Double,var B1: Double,var C1: Double,var D1: Double,var A2: Double,var B2: Double,var C2: Double,var D2: Double){

    fun sibrtye1(){
        println("pirveli sibrtyis gantolebaa: $A1 x + $B1 y + $C1 z + $D1 = 0")
    }
    fun sibrtye2(){
        println("meore sibrtyis gantolebaa: $A2 x + $B2 y + $C2 z + $D2 = 0")
    }

    fun pasuxi(){
        println("pirveli sibrtyis normalis koordinatebia: ($A1,$B1,$C1)")
        println("meore sibrtyis normalis koordinatebia: ($A2,$B2,$C2)")

        var gamomtvleli = (A1*A2 + B1*B2 + C1*C2) / (sqrt(A1*A1 + B1*B1 + C1*C1) * sqrt(A2*A2 + B2*B2 + C2*C2))

        println("diedruli kutxis cos = $gamomtvleli")

        if(gamomtvleli < -1 || gamomtvleli > 1){
            println("es sibrtyeebi ver sheqmnian diedrul kutxes")
        }
        else {
            println("kutxe = arccos ${gamomtvleli + 2 * Math.PI}*k ; k (- Z")
            println("kutxe = - arccos ${gamomtvleli + 2 * Math.PI}*k ; k (- Z")
        }
    }
}
