package org.example

fun main() {
    val list = listOf(5, 2, 7, 8, 15, 4, 5)
    val sortedList = selectionSort(list)
    println(sortedList)
}

/**
 * Метод сортировки выборкой
 *
 * @param list Список элементов для сортировки
 */
fun selectionSort(list: List<Int>): List<Int> {
    val resultList = mutableListOf<Int>()
    val inputList = list.toMutableList()

    while (inputList.isNotEmpty()) {
        var min = Int.MAX_VALUE
        inputList.forEach { item ->
            if (item < min) {
                min = item
            }
        }
        resultList.add(min)
        inputList.remove(min)
    }

    return resultList
}

