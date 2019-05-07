package com.example.error;
import java.util.Set;


public class IdUnSupportedFieldPatchException extends RuntimeException {

    public IdUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
