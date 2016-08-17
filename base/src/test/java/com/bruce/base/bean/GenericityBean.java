package com.bruce.base.bean;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by bruce on 2016/8/15.
 */
public class GenericityBean {
    private List<Map<String, String>> message;

    public List<Map<String, String>> getMessage() {
        return message;
    }

    public void setMessage(List<Map<String, String>> message) {
        this.message = message;
    }

    public static void main(String[] args) {
        GenericityBean testBean = new GenericityBean();
        //通过 message 获取属性类型
        //在获取属性集合泛型
        Class clazz = null;
        Field field = null;
        try {
            clazz = Class.forName("com.bruce.base.bean.GenericityBean");
            field = clazz.getDeclaredField("message");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ParameterizedType pt = (ParameterizedType)field.getGenericType();
        System.out.println(field.getGenericType());

        System.out.println(pt.getActualTypeArguments().length);
        System.out.println(pt.getActualTypeArguments()[0]);

        Type type = pt.getActualTypeArguments()[0];
        System.out.println("aa"+type.getTypeName());

    }


}
