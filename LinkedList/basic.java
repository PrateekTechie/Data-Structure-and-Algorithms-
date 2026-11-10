import java.util.*;

public class basic {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static node head;
    public static node tail;

    // intialzie the method
    public void addfirst(int data) {
        // create a new node
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
        }
        // newnode next = head
        newnode.next = head;
        // head = newode
        head = newnode;
    }

    public void addlast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
}

public void addmiddle(int data, int index) {
    if (index == 0) {
        addfirst(data);
        return;
    }
    node newnode = new node(data);
    node temp = head;
    int i = 0;
    while (i < index - 1) {
        temp = temp.next;
        i++;
    }
    newnode.next = temp.next;
    temp.next = newnode;
}

public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    ll.print();
    ll.addfirst(1);
    ll.addfirst(2);
    ll.addfirst(3);
    ll.addlast(4);
    ll.addmiddle(5, 2);
    ll.print();
}
