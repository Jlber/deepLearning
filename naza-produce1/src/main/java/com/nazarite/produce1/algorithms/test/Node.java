package com.nazarite.produce1.algorithms.test;

/**
 * @Author: jeq
 * @Date: 2020/11/19 下午2:29
 */
public class Node {
    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;

    }
    void  print(){
        StringBuilder sb=new StringBuilder();
        sb.append(value);
        Node tmp= next;
        while (tmp!=null){
            sb.append("->"+tmp.value);
            tmp=tmp.next;
        }

        System.out.println(sb.toString());
    }
}
