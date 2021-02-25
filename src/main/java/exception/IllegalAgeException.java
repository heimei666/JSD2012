package exception;

/**
 * 年龄不合法异常，当指定的年龄超过人类范畴时会抛出该异常
 *
 *
 *  自定义异常，通常用来说明满足语法但是不满足实际业务问题的异常。
 *  自定异常的类名要做到见名知义。并且要继承自Exception（直接，间接均可）
 *  然后将Exception中所有的构造方法提供出来即可。不需要书写业务逻辑方法。
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
