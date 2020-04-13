package com.example.kotlindatastructure

class LinkListInsertStart1 {
    var head: Node? = null

    class Node(var data: Int) {
        var next: Node? = null
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

//            insert beginning
            val linkListInsert = LinkListInsertStart1()
            linkListInsert.head = Node(1)
            val node2 = Node(2)
            val node3 = Node(3)

//            linking the list
            linkListInsert.head!!.next = node2
            node2.next = node3

            //beginning
            val node4 = Node(100)
            node4.next = linkListInsert.head
            linkListInsert.head = node4


            //traverse the list
            linkListInsert.traverse()

        }
    }

    private fun traverse() {
        var n = head
        while (n != null) {
            println(n.data)
            n = n.next
        }
    }
}