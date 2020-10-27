fun main(args: Array<String>) {
    val numbers1 = mutableListOf(14, 88, 3, 64, 7, 9, 8, 2)
    val numbers2 = mutableListOf(14, 88, 3, 64, 7, 9, 8, 2)

    var selection_sorted = selectionSort(numbers1)
    var insertion_sorted = insertionSort(numbers2)
    println(selection_sorted)
    println(insertion_sorted)
}

fun insertionSort(numbers:MutableList<Int>):List<Int>{
    if (numbers.isEmpty() || numbers.size<2){
        return numbers
    }
    for (count in 1..numbers.count() - 1){
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

fun selectionSort(numbers:MutableList<Int>):List<Int>{
    var size = numbers.size
    var temp:Int
    for(i in 0..size-1){
        var indexOfMin = i
        for(j in size-1 downTo  i){
            if(numbers[j]< numbers[indexOfMin])
                indexOfMin=j
        }
        if(i!=indexOfMin){
            temp = numbers[i]
            numbers[i]= numbers[indexOfMin]
            numbers[indexOfMin]=temp
        }
    }
    return numbers
}