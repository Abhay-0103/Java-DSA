package _20_Reverse_linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class _1 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);


        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}


class LL {


    LL.Node head;
    private int size;


    LL () {
        size = 0;
    }


    public class Node {
        String data;
        LL.Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    public void addFirst(String data) {
        LL.Node newNode = new LL.Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data) {
        Node newNode = new LL.Node(data);


        if(head == null) {
            head = newNode;
            return;
        }


        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = newNode;
    }


    public void printList() {
        Node currNode = head;


        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }


        System.out.println("null");
    }


    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        head = this.head.next;
        size--;
    }


    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        size--;
        if(head.next == null) {
            head = null;
            return;
        }


        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }


        currNode.next = null;
    }


    public int getSize() {
        return size;
    }


    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }


        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node

        if(head == null || head.next == null) {
            return head;
        }


        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }





    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();


        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());


        list.removeFirst();
        list.printList();


        list.removeLast();
        list.printList();

      //  list.reverseList();
       // list.head = list.reverseListRecursive(list.Node);
       // list.printList();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        Collections.reverse(list2);
    }
}


