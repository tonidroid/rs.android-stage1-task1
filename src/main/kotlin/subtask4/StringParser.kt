package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val inputArray = inputString.toCharArray()
        val outputArray =mutableListOf<String>()

        for (i in inputArray.indices){
            when (inputArray[i]) {
                '(' -> {
                    val result = getSubString(inputString, i, '(', ')')
                    outputArray.add(result!!)
                }
                '<' -> {
                    val result = getSubString(inputString, i, '<', '>')
                    outputArray.add(result!!)
                }
                '[' -> {
                    val result = getSubString(inputString, i, '[', ']')
                    outputArray.add(result!!)
                }
            }
        }

        return outputArray.toTypedArray()
    }

    fun getSubString(inputString: String, startPos: Int, openingChar:Char, closingChar: Char): String? {
        var counter = 0
        var endPos = startPos;
        for (i in startPos  until inputString.length) {
            if (inputString[i] == openingChar) {
                counter++
            }
            if (inputString[i] == closingChar) {
                counter--
            }
            if (counter == 0) {
                endPos=i
                break
            }
        }

        return if (endPos!=startPos) {
            inputString.substring(startPos+1, endPos)
        }else{
            null
        }
    }
}
