package com.tuya.solution.record.service;

/**
 * @author Violet（wangli.liu@tuya.com）
 * @describe XXXXXX
 * @since 2024/6/4 18:30
 */
public interface IParseFunction {

    /**
     * 代表了自定义函数是否在业务代码执行之前解析
     */
    default boolean executeBefore() {
        return false;
    }


    String functionName();

    /**
     * @param value 函数入参
     * @return 文案
     * @since 1.1.0 参数从String 修改为Object类型，可以处理更多的场景，可以通过SpEL表达式传递对象了
     * 需要改下自定义函数的声明，实现使用中把 用到 value的地方修改为 value.toString 就可以兼容了
     */
    String apply(Object value);
}