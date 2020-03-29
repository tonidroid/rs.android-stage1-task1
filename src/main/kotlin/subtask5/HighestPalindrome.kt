package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var inputArray = digitString.toCharArray()
        var result:String=""
        var isReplaceable = true

        var counter:Int = 0
        for (i in 0 until n/2){
            if (inputArray[i]!=inputArray[n-1-i]){ counter++ }
        }

        if (counter>k){
            isReplaceable=false
            result="-1"
        }

        if (counter<=k){
            var replaceCounter=k
            for (i in 0 until n/2){

                if (inputArray[i]!=inputArray[n-1-i]){
                    if(counter<replaceCounter){
                        var max='9'
                        inputArray[i]=max
                        inputArray[n-1-i]=max
                        replaceCounter-=2
                    }
                    else{
                        var max = if (inputArray[i] > inputArray[n - 1 - i]) inputArray[i] else inputArray[n - 1 - i]
                        inputArray[i] = max
                        inputArray[n - 1 - i] = max
                    }
                }
            }
            result=inputArray.joinToString("")
        }

        return result
    }
}
