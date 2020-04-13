package com.example.kotlindatastructure

class LinkListAfterElement2 {
    var head: Node? = null

    class Node(var data: Int) {
        var next: Node? = null
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

// inserting the value
            val linkListAfterElement = LinkListAfterElement2()
            linkListAfterElement.head = Node(1)
            val node2 = Node(2)
            val node3 = Node(3)

//            linking the list

            linkListAfterElement.head!!.next = node2
            node2.next = node3

//            creating the list
            val node4 = Node(100)

//            connecting the node after first element

            linkListAfterElement.head!!.next=node4
            node4.next=node2





            linkListAfterElement.traverseElement()
        }
    }

    private fun traverseElement() {
        var n = head
        while (n != null) {
            println(n.data)
            n = n.next
        }
    }
}