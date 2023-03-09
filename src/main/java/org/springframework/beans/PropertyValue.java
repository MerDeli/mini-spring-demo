package org.springframework.beans;

/**
 * @Author:
 * @createTime: 2023/03/09 17:03:12
 * @version:
 * @Description:
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
