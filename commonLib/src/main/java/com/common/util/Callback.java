package com.common.util;

/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-14]
 */
public interface Callback<T> {
    /**
     * call the observer
     *
     * @param data
     */
    void call(T data);
}
