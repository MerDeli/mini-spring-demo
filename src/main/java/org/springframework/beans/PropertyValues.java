package org.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:
 * @createTime: 2023/03/09 17:05:09
 * @version:
 * @Description:
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {propertyValueList.add(pv);}

    public PropertyValue[] getPropertyValues(){return this.propertyValueList.toArray(new PropertyValue[0]);}

    public PropertyValue getPropertyValue(String propertyName){
        for(int i = 0; i < this.propertyValueList.size(); i++){
            PropertyValue pv = this.propertyValueList.get(i);
            if(pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }
}