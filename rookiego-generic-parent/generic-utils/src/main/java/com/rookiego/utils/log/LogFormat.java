package com.rookiego.utils.log;

/**
 * <b>类名称:</b>LogFormat<br/>
 * <b>类注释:</b>日志信息打印格式化<br/>
 * <b>类描述:</b><br/>
 * <b>创建人:</b>rookie<br/>
 * <b>修改人:</b>rookie<br/>
 * <b>修改时间:</b>2017年07月24日 23时10分48秒<br/>
 * <b>修改备注:</b><br/>
 *
 * @version 1.0.0<br/>
 */
public class LogFormat {

    public static String formatMsg(String methodName, String format, String... args) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(methodName);
        stringBuffer.append("]");

        stringBuffer.append(String.format(format, args));
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String methodName = "LogFormat.main";
        String format = "[%s:%s][%s:%s]";
        String arg1 = "age";
        String value1 = "10";
        String arg2 = "name";
        String value2 = "rookie";

        System.out.println(LogFormat.formatMsg(methodName, format, arg1, value1, arg2, value2));

    }

}
