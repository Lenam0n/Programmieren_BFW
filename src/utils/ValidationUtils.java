// Datei: ValidationUtils.java
package utils;

import java.util.function.Predicate;

public class ValidationUtils {

    /**
     * Validiert einen Wert gegen eine Bedingung.
     * @param value der zu prüfende Wert
     * @param predicate die Prüfbedingung
     * @param errorMsg Fehlermeldung, falls predicate fehlschlägt
     * @return Result mit value oder errorMsg
     */
    public static <T> Result<T, String> validate(
            T value,
            Predicate<T> predicate,
            String errorMsg
    ) {
        if (predicate.test(value)) return Result.success(value);
        else return Result.error(errorMsg);
        
    }
}
