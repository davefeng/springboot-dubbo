package com.boot.exception;

/**
 * 自定义非空注解ParamCheck对应的异常处理类
 *
 * @author wangfeng
 * @create 2021-06-16 14:23
 */
public class ParamCheckException extends RuntimeException{

    private final String parameterType;

    private final String parameterName;

    public String getParameterType() {
        return parameterType;
    }

    public String getParameterName() {
        return parameterName;
    }

    public ParamCheckException(String parameterType, String parameterName) {
        super("");
        this.parameterType = parameterType;
        this.parameterName = parameterName;
    }

    @Override
    public String getMessage () {
        return "请求参数 "+this.parameterName+" 不能为空!";
    }
}
