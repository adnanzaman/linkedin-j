//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.03 at 03:51:06 PM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Update;
import com.google.code.linkedinapi.schema.UpdateContent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timestamp",
    "updateKey",
    "updateType",
    "updateContent",
    "isCommentable"
})
@XmlRootElement(name = "update")
public class UpdateImpl
    implements Update
{

    @XmlElement(required = true)
    protected BigInteger timestamp;
    @XmlElement(name = "update-key", required = true)
    protected String updateKey;
    @XmlElement(name = "update-type", required = true)
    protected String updateType;
    @XmlElement(name = "update-content", required = true, type = UpdateContentImpl.class)
    protected UpdateContentImpl updateContent;
    @XmlElement(name = "is-commentable")
    protected boolean isCommentable;

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger value) {
        this.timestamp = value;
    }

    public String getUpdateKey() {
        return updateKey;
    }

    public void setUpdateKey(String value) {
        this.updateKey = value;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String value) {
        this.updateType = value;
    }

    public UpdateContent getUpdateContent() {
        return updateContent;
    }

    public void setUpdateContent(UpdateContent value) {
        this.updateContent = ((UpdateContentImpl) value);
    }

    public boolean isIsCommentable() {
        return isCommentable;
    }

    public void setIsCommentable(boolean value) {
        this.isCommentable = value;
    }

}
