package com.cruxcourseaug.assignmentlinkedlist;

public class linkedlist {
    private Node head;
    private Node tail;
    private int size;
    public linkedlist()
    {
     this.size=0;
    }
    public void insertatfirst(String value)
    {
        Node node=new Node(value);
        node.next=head;
        head=node;
        size++;
        if(tail==null)
        {
            tail=head;
        }
    }

    private void bubblesort(Node node)
    {
        if(node.next==null)
        {
            return;
        }
        if(node.name.compareTo(node.next.name)>0)
        {
            String temp=node.name;
            node.name=node.next.name;
            node.next.name=temp;
        }
        node=node.next;
        bubblesort(node);
    }
    public void bubblesort()
    {
        bubblesort(head);
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.name + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }
public class Node{
    private String name;
    private Node next;
    public Node(String name)
    {
        this.name=name;
    }
}
}
