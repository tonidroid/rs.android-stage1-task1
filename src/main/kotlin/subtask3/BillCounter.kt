package subtask3

class BillCounter {

    private val message = "bon appetit"
    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val result = (bill.sum() - bill[k])/2

        if(result == b){
            return message
        }else{
            return (b - result).toString()
        }
    }
}
