package ceng201.hw;

import java.sql.SQLOutput;

public class PatientList {
    private Node head;
    private Node tail;
    private int patientCount = 0;

    private class Node {//1 created constructor
        Patient data;
        Node next;


        Node(Patient data) {
            this.data = data;
        }


    }

    //I added a variable to the end
    public void addPatient(Patient p) {
        Node variable = new Node(p);
        patientCount++;
        if (head == null) { //If the list empty
            head = variable;
            tail = variable;
            head.next = null;
            System.out.println("1.patient added in list");

        } else {//ıf the list not empty
            tail.next = variable;
            tail = variable;
            variable.next = null;
            System.out.println("patient added" + patientCount);

        }
    }

    public void removePatient(int id) {//delete
        System.out.println(id + "patient deleted");
        if (head == null) {//ıf the list is empty
            System.out.println("The list is empty.There is no deleter variable");
            return;
        }
        if (head.next == null && head.data.id == id) {//just one variable
            head = null;
            tail = null;
            System.out.println("I deleted the only variable  on the list");
            return;
        }
        if (head.next != null && head.data != null && head.data.id == id) {
            head = head.next;
            System.out.println("the element at the beginning has been deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null && head.data != null && temp.next.data.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {//ıf Id cannot be found system dont found
            System.out.println("Searched id not found");
            return;
        }
        temp.next = temp.next.next;

        if (temp.next == null) {//ıf the deleted node is the last node,our tail is update
            tail = temp;
        }
        System.out.println(" deleted variable");
    }

    public Patient findPatient(int id) {//find the patient in the given ıd
        if (head == null) {
            System.out.println("the list is empty");
            return null;
        }
        Node temp = head;

        while (temp != null) {
            if (temp.data.id == id && temp.data.id == id) {
                System.out.println("founded this patient:" + temp.data.name);
                return temp.data;
            }
            temp = temp.next;
        }
        return null;//ıf the ıd not found
    }

    //print list
    public void printList() {//print all patients on the list to the screen
        System.out.println("list:");
        if (head == null) {
            System.out.println("the list is empty");
        } else {//list is printed from the start to finish
            Node temp = head;
            while (temp != null && temp.data != null) {
                System.out.println("ID:" + temp.data.id + "Name+" + temp.data.name + "Severity:" + temp.data.severity + "age:" + temp.data.age);
                temp = temp.next;
            }
        }

    }
}











