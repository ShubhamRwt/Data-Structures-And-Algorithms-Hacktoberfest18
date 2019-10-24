package com.cruxcourseaug.assignmentlinkedlist;

public class lnclient {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertatfirst("7");
        list.insertatfirst("8");
        list.insertatfirst("4");
        list.insertatfirst("5");
        list.bubblesort();
        list.display();
    }
}
