package arrays_linkedlists

class DoublyLinkedList<T>() {
    // node data class to represent the doubly linked list node
    data class Node<T>(var element: T?, var prev: Node<T>?, var next: Node<T>?)

    // instance variables  of the doublyLinkedList
    private var header: Node<T> = Node<T>(null, null, null)
    private var trailer: Node<T> = Node<T>(null, header, null)

    init {
        header.next = trailer
    }

    /** Returns the number of element in the linked list */
    fun size() = size
    /** Tests whether the linked list is empty */
    fun isEmpty()= size == 0

    /** Returns (but does not remove) the first element in the linked list*/
    fun first():T?{
        if(isEmpty())
            return null
        return header.next?.element
    }


    /** Returns (but does not remove) the last element in the linked list*/
    fun last():T?{
        if(isEmpty())
            return null
        return trailer.prev?.element
    }

    private var size = 0


}