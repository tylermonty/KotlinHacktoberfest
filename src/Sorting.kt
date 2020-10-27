fun main(args: Array<String>) {
    val numbers = mutableListOf(14, 88, 3, 64, 7, 9, 8, 2)

    var selection_sorted = selectionSort(numbers)
    var insertion_sorted = insertionSort(numbers)
    var merge_sorted = mergeSort(numbers)

    println(selection_sorted)
    println(insertion_sorted)
    println(merge_sorted)
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

fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2
    var left = list.subList(0,middle);
    var right = list.subList(middle,list.size);

    return merge(mergeSort(left), mergeSort(right))
}
fun merge(left: List<Int>, right: List<Int>): List<Int>  {
    var indexLeft = 0
    var indexRight = 0
    var newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList;
}
