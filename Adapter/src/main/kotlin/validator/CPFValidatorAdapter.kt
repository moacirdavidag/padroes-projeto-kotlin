package validator

// Adapter
class CPFValidatorAdapter : ICPFValidator {

    private val validator = Validators()

    override fun isCPF(value: String): Boolean {
        return validator.isCPF(value)
    }
}