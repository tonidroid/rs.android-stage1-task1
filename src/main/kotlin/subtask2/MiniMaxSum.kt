package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var inputArray = input.toMutableList()
        var outputArray = mutableListOf<Int>()
        var min = inputArray.min()!!
        var max = inputArray.max()!!
        var sum = inputArray.sum()

        outputArray.add(sum-max)
        outputArray.add(sum-min)

        return  outputArray.toIntArray()
    }
}
