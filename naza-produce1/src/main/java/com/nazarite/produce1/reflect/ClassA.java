package com.nazarite.produce1.reflect;

import java.util.Map;

/**
 * @Author:elbert
 * @Date:2019-08-29
 */

public class ClassA<K, V> {
    protected Map<K, V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }
}
