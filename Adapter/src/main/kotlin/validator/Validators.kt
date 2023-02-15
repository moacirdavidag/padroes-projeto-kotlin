package validator

import java.util.regex.Pattern

// Adaptee

class Validators {
    fun isCPF(value: String): Boolean {
        val cpfPattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}\$")
        val cpfMatcher = cpfPattern.matcher(value)
        return cpfMatcher.matches()
    }

    // Outros exemplos de validadores
    fun isEmail(value: String): Boolean {
        TODO()
    }
}


