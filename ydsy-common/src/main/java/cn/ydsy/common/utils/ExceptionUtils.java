package cn.ydsy.common.utils;

import cn.ydsy.common.exceptions.MyException;

public final class ExceptionUtils {
    private ExceptionUtils() {
    }

    public static MyException mpe(String msg, Throwable t) {
        return new MyException(msg, t);
    }

    public static MyException mpe(String msg) {
        return new MyException(msg);
    }

    public static MyException mpe(Throwable t) {
        return new MyException(t);
    }
}
