package com.example.library.utils;

import java.util.Optional;

public class EntityUtils {
    public static <T> T findEntityOrThrow(Optional<T> entityOptional, String errorMessage) {
        return entityOptional.orElseThrow(() -> new RuntimeException(errorMessage));
    }
}