package com.bruce.base.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

import com.bruce.base.framework.FrameLogger;

public class MapBeanUtil {
	
	private static FrameLogger logger = FrameLogger.getLogger(MapBeanUtil.class);

	@SuppressWarnings("unchecked")
	public static <T extends Object> T map2Obj(Map<String, Object> map,
			Class<T> clazz) throws Exception {
		if (map == null)
			return null;
		T obj = null;
		BeanInfo beanInfo = null;
		PropertyDescriptor[] propertyDescriptors = null;
		Method setter = null;
		try {
			obj = clazz.newInstance();
			beanInfo = Introspector.getBeanInfo(obj.getClass());
			propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				setter = property.getWriteMethod();
				if (setter != null && map.get(property.getName()) != null) {
					if (property.getPropertyType() == String.class) {
						setter.invoke(obj, (String) map.get(property.getName()));
					} else if (property.getPropertyType() == Date.class) {
						if (((String) map.get(property.getName())).length() == 10) {
							setter.invoke(obj, DateUtil
									.string2Date((String) map.get(property
											.getName())));
						} else if (((String) map.get(property.getName()))
								.length() == 19) {
							setter.invoke(obj, DateUtil
									.string2Timestamp((String) map.get(property
											.getName())));
						}
					} else if (property.getPropertyType() == Long.class
							|| property.getPropertyType() == long.class) {
						setter.invoke(obj, Long.valueOf((String) map
								.get(property.getName())));
					} else if (property.getPropertyType() == int.class
							|| property.getPropertyType() == Integer.class) {
						setter.invoke(obj, Integer.valueOf((String) map
								.get(property.getName())));
					} else if (map.get(property.getName()) instanceof Map) {
						setter.invoke(
								obj,
								map2Obj((Map<String, Object>) map.get(property
										.getName()), property.getPropertyType()));
					} else {
						setter.invoke(obj, map.get(property.getName()));
					}
				}
			}
		} catch (InstantiationException e) {
			logger.error("InstantiationException when newInstance of class "
					+ clazz.getName());
			e.printStackTrace();
			throw e;
		} catch (IllegalAccessException e) {
			logger.error("IllegalAccessException when newInstance of class "
					+ clazz.getName());
			e.printStackTrace();
			throw e;
		} catch (IntrospectionException e) {
			logger.error("IntrospectionException when getBeanInfo of class "
					+ clazz.getName());
			e.printStackTrace();
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error("IllegalArgumentException when invoke setter of class "
					+ clazz.getName());
			e.printStackTrace();
			throw e;
		} catch (InvocationTargetException e) {
			logger.error("InvocationTargetException when invoke setter of class "
					+ clazz.getName());
			e.printStackTrace();
			throw e;
		} finally {
			beanInfo = null;
			propertyDescriptors = null;
			setter = null;
		}
		return obj;
	}
	
	public static <T extends Object> T obj2Map (Map<String, Object> map, Class<T> clazz) {
		
		return null;
	}
	
	public static <T extends Map<K, V>, K, V> T copyMap (Class<T> map) {
		
		return null;
	}
	
	public static <T extends Object> T copyBean (Class<T> clazz) {
		
		return null;
	}
}
