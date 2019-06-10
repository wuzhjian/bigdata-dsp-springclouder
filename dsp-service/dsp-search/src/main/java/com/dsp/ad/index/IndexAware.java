package com.dsp.ad.index;

/**
 * @author 44644
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);

}
