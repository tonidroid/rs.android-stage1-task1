package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var copyArray = sadArray.toMutableList()
        var isConverting = true

        while (isConverting && copyArray.count()>1) {
            for (i in 1 until copyArray.count()) {
                if (i==copyArray.count()-1){
                    isConverting=false
                    break;
                }
                if (copyArray[i] > copyArray[i - 1] + copyArray[i + 1]) {
                    copyArray.removeAt(i)
                    break
                }
            }
        }

        return copyArray.toIntArray()
    }
}
