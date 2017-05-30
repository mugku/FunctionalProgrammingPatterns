package kotlinex.strategy.new

class ValidatorFactory {
    companion object {
        val allLowerValidator: (String) -> Boolean
            get() = { string: String -> string.matches(Regex("[a-z]+"))}
        val numericValidator: (String) -> Boolean
            get() = { string: String -> string.matches(Regex("\\d+"))}

        val testNum = 123
    }
}