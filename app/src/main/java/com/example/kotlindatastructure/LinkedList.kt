class LinkedList {
    var head // head of list
            : Node? = null

      class Node(var data: Int) {
        var next: Node? = null

    }

    /* Given a key, deletes the first occurrence of key in linked list */
    fun deleteNode(key: Int) {
        // Store head node
        var temp = head
        var prev: Node? = null

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next // Changed head 
            return
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp
            temp = temp.next
        }

        // If key was not present in linked list
        if (temp == null) return

        // Unlink the node from linked list
        prev!!.next = temp.next
    }

    /* Inserts a new Node at front of the list. */
    fun push(new_data: Int) {
        val new_node = Node(new_data)
        new_node.next = head
        head = new_node
    }

    /* This function prints contents of linked list starting from
		the given node */

    companion object {
        /* Drier program to test above functions. Ideally this function
	should be in a separate user class. It is kept here to keep 
	code compact */
        @JvmStatic
        fun main(args: Array<String>) {
            val llist = LinkedList()
            llist.push(7)
            llist.push(1)
            llist.push(3)
            llist.push(2)
            println("\nCreated Linked list is:")
            llist.printList()
            llist.deleteNode(1) // Delete node at position 4
            println("\nLinked List after Deletion at position 4:")
            llist.printList()
        }
    }

    fun printList() {
        var tnode = head
        while (tnode != null) {
            print(tnode.data.toString() + " ")
            tnode = tnode.next
        }
    }

}