package com.nazarite.produce1.algorithms.test;

/**
 * @Author: jeq
 * @Date: 2020/11/19 上午9:50
 * 反转链表  做之前完全不知道该干嘛   链表结构是直接用现成的还是自己写？
 * Input 1->2->3->4->5->null
 * output 5->4->3->2->1->null
 *
 *  改变指向  本来 n2的下一个是3  现在是1了
 */
public class ReverseLinkedList {


    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n1.print();
       // reverseList(n1);
        myReverse(n1);
       // reverse(n1);
         n5.print();
    }
    public  static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
    public static Node reverseList(Node node) {
        Node pre = null;
        Node next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


    public static void myReverse(Node node){
        Node pre =null;     //用于更改指向
        Node next=null;  //用于遍历下个节点
        while (node!=null){
            next = node.next;  //下个节点放入临时变量
            node.next=pre;   //将当前节点的下一个指向上个节点
            pre = node;    //赋值下个节点的上个节点为本节点
            node=next;   //为下个遍历元素用
        }
        return ;
    }

}
