package ceng201.hw;

import java.sql.SQLOutput;

public class PatientList {
    private Node head;
    private Node tail;

    private class Node {
        Patient data;
        Node next;


        Node(Patient data) {
            this.data = data;
            this.next = null;
        }


    }

    //I added a variable to the end
    void addPatient(Patient p) {
        Node variable = new Node(p);
        if (head == null) { //If the list empty
            head = variable;
            tail = variable;
            head.next = null;


            System.out.println("First variable added");
        } else {
            tail.next = variable;
            tail = variable;
            variable.next = null;

        }
    }

    void removePatient(int id) {
        //If the list empty
        if (head == null) {
            System.out.println("The list is empty.There is no deleter variable");
            return;
        }
        if (head.next == null && head.data.id == id) {//just one variable
            head = null;
            tail = null;
            System.out.println("I deleted the only variable  on the list");
            return;
        }
        Node temp = head;

        while (temp.next != null && temp.next.data.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Searched id not found");
            return;
        }
        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }
        System.out.println(" deleted variable");
    }

    public Patient findPatient(int id) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.id == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    //print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("ID:" + temp.data.id + "Name+" + temp.data.name + "Severity:" + temp.data.severity + "age:" + temp.data.age);
            temp = temp.next;
        }
    }

}











