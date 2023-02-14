
fun main(args: Array<String>) {
    var moacir = Pessoa("Moacir", 20)
    println("${moacir.getNome()} ${moacir.getIdade()}")
    var cloneMoacir = moacir.clone()
    println("${cloneMoacir.getNome()} ${cloneMoacir.getIdade()}")
}