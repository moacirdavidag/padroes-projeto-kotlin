import validator.CPFValidatorAdapter
import validator.ICPFValidator

fun main(args: Array<String>) {

    val cpfValidator = CPFValidatorAdapter()

    // Validando os CPFs
    fun validarCPF(validator: ICPFValidator, value:
    String) {
        if(validator.isCPF(value)) {
            println("O CPF ${value} está em um formato " +
                    "válido!")
        } else {
            println("O CPF ${value} não está em um " +
                    "formato" +
                    " válido!")
        }
    }

    validarCPF(cpfValidator, "233.234.325-06")
    validarCPF(cpfValidator, "19234345603")

}