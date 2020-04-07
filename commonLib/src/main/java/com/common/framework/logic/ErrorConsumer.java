package com.common.framework.logic;

/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-04-20]
 */
public interface ErrorConsumer<T> {
    T onError(Throwable throwable);
}
