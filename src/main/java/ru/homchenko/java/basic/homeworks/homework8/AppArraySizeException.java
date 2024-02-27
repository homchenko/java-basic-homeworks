package ru.homchenko.java.basic.homeworks.homework8;

//обычно рекомендуется наследоваться от Exception (для проверяемых исключений) или RuntimeException (для непроверяемых исключений),
//потому что наследование от Throwable является избыточным, Throwable включает в себя и ошибки Error,
// это уже не совсем подходит под логику.
public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException(String message) {
        super(message);
    }
}
