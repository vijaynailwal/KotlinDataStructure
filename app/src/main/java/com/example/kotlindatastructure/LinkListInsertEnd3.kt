package com.example.kotlindatastructure

class LinkListInsertEnd3 {
    var head: Node? = null

    class Node(var data: Int) {
        var next: Node? = null
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            inserting the value
            var linkListInsertEnd = LinkListInsertEnd3()
            linkListInsertEnd.head = Node(1)
            var node2 = Node(2)
            var node3 = Node(3)


//          linking the node
            linkListInsertEnd.head!!.next = node2
            node2.next = node3


            var node4 = Node(100)

            var last = linkListInsertEnd.head
            while (last!!.next != null)
                last = last.next
            last.next = node4

            linkListInsertEnd.traverse()


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