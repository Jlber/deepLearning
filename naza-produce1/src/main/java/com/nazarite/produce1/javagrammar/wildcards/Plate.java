package com.nazarite.produce1.javagrammar.wildcards;

/**
 * @Author:elbert
 * @Date:2019-08-22
 */

public class Plate<T> {
    private T item;


    public Plate(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
