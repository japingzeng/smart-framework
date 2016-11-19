package org.smart4j.framework.bean;

/**
 * @Author japing
 * @Date 2016/11/19 14:11
 * @param ${tags}
 * @Description:
 */
public class FormParam {

    private String fieldName;
    private Object fieldValue;

    public FormParam(String fieldName, Object filedValue) {
        this.fieldName = fieldName;
        this.fieldValue = filedValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
