package com.dpingin.home.automation.audio.api.pattern.control;

import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 * Created with IntelliJ IDEA.
 * User: DanoSaur
 * Date: 21.10.14
 * Time: 20:28
 * To change this template use File | Settings | File Templates.
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface Control<T extends Comparable<T>>
{
    String getName();
    void setValue(T value);
    T getValue();
}
