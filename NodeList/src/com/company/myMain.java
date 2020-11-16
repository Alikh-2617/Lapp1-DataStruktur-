package com.company;
/*
By Islam Mohemed :
By Eiddom Micael :
By Ali Khawari :
 */

public class myMain {
    public static void main(String[] args) {
        System.out.println("Start av List Link : ");

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(8);
        list.prettyPrint();

        // här vi använd add metod med tar index och vi gav index 1
        list.add(1,99);
        list.add(9);
        list.prettyPrint();
        System.out.println();

        System.out.println("----------------------");
        System.out.println("Start of Stack list : ");

        Stack stack = new Stack();
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.prettyPrint();
        System.out.println();
        System.out.println("Värde som tagit bort med pop funktion =  " + stack.pop());


        System.out.println("-----------------------");
        System.out.println("Start av Queue list  : ");
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(33);
        System.out.println("Start av Queue list :");
        q.prettyPrint();
        System.out.println();
        System.out.println("Värde som ska tar bort med dequeue funcktion = " + q.dequeue());
        System.out.println("Första i kö efter Peek funktion = " + q.peek());



    }

}
