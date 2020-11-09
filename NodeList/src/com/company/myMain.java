package com.company;
/*
By Islam Mohemed :
By Eiddom Micael :
By Ali Khawari :
 */

public class myMain {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("the list size new is : " + list.size());
        list.add(0,99);
        System.out.println("the list size is : " + list.size());
        System.out.println("list get :");
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index number " + i + " : " +  list.get(i));
        }
        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("list empty ? " + list.empty());
        System.out.println("is the list contain 5 ? " + list.contains(5));


        System.out.println("------------------------");
        System.out.println("Start of Stack list : ");
        Stack stack = new Stack();

        for (int i = stack.size()-1; i >= 0  ; i --){
            System.out.println("index number : " + i + " = " + stack.get(i));
        }
        stack.push(17);
        stack.push(18);
        stack.push(20);
        stack.pop();
        for (int i = stack.size()-1; i >= 0 ; i --){
            System.out.println("index number : " + i + " = " + stack.get(i));
        }

        System.out.println("----------------------------------------");
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(33);
        for (int i = 0; i < q.size(); i++) {
            System.out.println("index nr : " + i + " : " +q.get(i));
        }
        System.out.println(q.dequeue());
        for (int i = 0; i < q.size(); i++) {
            System.out.println("index nr : " + i + " : " +q.get(i));
        }
        System.out.println(q.peek());



    }

}
