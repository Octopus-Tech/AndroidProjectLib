package com.common.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-14]
 */
public class ParameterizedTypeImpl implements ParameterizedType {
    private final Type[] actualTypeArguments;
    private final Type ownerType;
    private final Type rawType;
    
    public ParameterizedTypeImpl(Type[] actualTypeArguments, Type ownerType, Type rawType) {
        this.actualTypeArguments = actualTypeArguments;
        this.ownerType = ownerType;
        this.rawType = rawType;
    }
    
    public Type[] getActualTypeArguments() {
        return this.actualTypeArguments;
    }
    
    public Type getOwnerType() {
        return this.ownerType;
    }
    
    public Type getRawType() {
        return this.rawType;
    }
}
