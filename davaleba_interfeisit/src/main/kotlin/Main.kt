import kotlin.math.sqrt

fun main() {
    val m = yvela_figura_ertshi(3.5F, 5F, 1F, 3.14F, 9F, 3.0, 13F, 4F)
    m.funqcia1()
    m.funqcia2()
    m.funqcia3()
}

interface figurebi {
    fun funqcia1()
    fun funqcia2()
    fun funqcia3()
}

class yvela_figura_ertshi(var sigrdze: Float, var sigane: Float, var simagle: Float,var pi: Float, var r: Float,val x: Double, var gverdi: Float, var h: Float): figurebi {
    override fun funqcia1(){
        println("paralelepipedis moculobaa: ${sigrdze * sigane * simagle} santimetr^3")
    }
    override fun funqcia2(){
        println("sferos moculobaa: ${pi * r * r * r * 4 / 3} santimetr^3")
    }
    override fun funqcia3(){
        println("eqvskutxa prizmis moculobaa: ${gverdi*gverdi * x * sqrt(x) /2 * h} santimetr^3")
    }
}


