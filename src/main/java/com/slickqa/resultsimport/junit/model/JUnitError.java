package com.slickqa.resultsimport.junit.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@Getter
@Setter
@Accessors(fluent = true)
public class JUnitError {
    @XmlAttribute
    private String message;
    @XmlAttribute
    private String type;
    @XmlValue
    private String value;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getValue() {
        return value;
    }
}