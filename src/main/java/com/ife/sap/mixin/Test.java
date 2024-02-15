package com.ife.sap.mixin;

@FunctionalInterface
public interface Test<R> {
    R call(Object... args);
}
