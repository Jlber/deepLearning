package com.nazarite.produce1.algorithms.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: jeq
 * @Date: 2020/11/19 上午11:01
 *HJ1
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
 *
 * 可以用链表反转 再从尾部正向取k
 */
public class TestListNode {

    public static void main(String[] args) throws IOException {
        getLastByArray();

    }

    public static void getLastNI(){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            Node head = new Node(N);
            for(int i=0;i<N;i++){  //头插法“逆序”建立单链表
                int val = in.nextInt();
                Node cur = new Node(val);
                cur.next = head.next;
                head.next = cur;
            }
            int k = in.nextInt();
            Node kthNode = head;
            for(int i = 0;i<k;i++){
                kthNode = kthNode.next;
            }
            System.out.println(kthNode.value);
        }
    }

    //直接插入链表
    public static Integer getLastNII(){
        Scanner in = new Scanner(System.in);
        Node pre = null;
        Node head = null;
        while(in.hasNext()) {
            int N = in.nextInt();
            for (int i = 0; i < N; i++) {  //先顺序插入链表 再反转链表
                int num = in.nextInt();
                Node cur = new Node(num);
                if (head == null) {
                    head = cur;
                } else {
                    pre.next = cur;
                }
                pre=cur;  //跟LinkedList一样add
            }

            reverseList(head);
            int k = in.nextInt();
            Node kthNode = pre;
            for (int i = 1; i < k; i++) {
                kthNode = kthNode.next;
            }
            System.out.println(kthNode.value);
            return kthNode.value;
        }
        return null;
        }

    public static void getLastByArray() throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while ((str=br.readLine())!=null){

          String[] inputArray = br.readLine().split(" ");
          Integer k=  Integer.parseInt(br.readLine().trim()) ;
          if (k<=0||k>inputArray.length){
              System.out.println(0);
          }else {
              System.out.println(inputArray[inputArray.length-k]);
          }
        }

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

}


