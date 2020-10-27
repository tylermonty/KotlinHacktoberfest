fun main(args: Array<String>) {
    val numbers = mutableListOf(14, 88, 3, 64, 7, 9, 8, 2)
    var sorted = insertionSort(numbers)
    println(sorted)
}

fun insertionSort(numbers:MutableList<Int>):List<Int>{
    if (numbers.isEmpty() || numbers.size<2){
        return numbers
    }
    for (count in 1..numbers.count() - 1){
        // println(items)
        val n = numbers[count]
        var i = count
        while (i>0 && n < numbers[i - 1]){
            numbers[i] = numbers[i - 1]
            i -= 1
        }
        numbers[i] = n
    }
    return numbers
}