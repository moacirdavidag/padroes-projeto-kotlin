// Objeto protótipo
class Pessoa(nome: String, idade: Int) : Prototype {

    var nome: String ?= nome
    var idade: Int ?= idade

    fun getNome() {
        println(this.nome)
        return
    }

    fun getIdade() {
        println(this.idade)
        return
    }

    override fun clone() : Pessoa {
        return this
    }
}