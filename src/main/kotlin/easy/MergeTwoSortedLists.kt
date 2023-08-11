package easy


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


fun main() {
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next!!.next = ListNode(3)
    list1.next!!.next?.next = ListNode(4)
    val list2 = ListNode(1)
    list2.next = ListNode(5)
    list2.next!!.next = ListNode(9)
    list2.next!!.next?.next = ListNode(10)

    var result = mergeTwoLists(list1, list2)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val tempNode = ListNode(0)
    var currentNode = tempNode
    var l1 = list1
    var l2 = list2
    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            currentNode.next = l1
            l1 = l1.next
        } else {
            currentNode.next = l2
            l2 = l2.next
        }
        currentNode = currentNode.next!!
    }
    if (l1 != null)
        currentNode.next = l1
    else currentNode.next = l2
    return tempNode.next
}

