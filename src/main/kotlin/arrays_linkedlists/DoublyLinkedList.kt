package arrays_linkedlists

class DoublyLinkedList<T> {
    // node data class to represent the doubly linked list node
    data class Node<T>(val element:T, val prev:Node<T> , val next:Node<T>)

}