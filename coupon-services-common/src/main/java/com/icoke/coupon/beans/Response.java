/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.beans;

import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Bean class to return mixCode info for service interface
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement(name = "coupon")
@XmlType(propOrder = {"status", "message", "code", "moreInfo", "guid"})
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({"status", "message", "code", "more-info", "guid"})
public class Response {
    protected int status;
    protected String message;
    protected String code;
    protected String moreInfo;
    protected String guid;


    public Response() {
        super();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * standard hashcode
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        return result;
    }

    /**
     * standard equals
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Response other = (Response) obj;
        if (message == null && other.message == null) {
            return true;
        } else if (message == null && other.message != null) {
            return false;
        } else if (message != null && other.message == null) {
            return false;
        } else if (!message.equals(other.message))
            return false;


        if (code == null && other.code == null) {
            return true;
        } else if (code == null && other.code != null) {
            return false;
        } else if (code != null && other.code == null) {
            return false;
        }

        return (code.equals(other.code));
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Coupon [statusCode=" + message +
                ", statusDescription=" + code + "]";
    }
}
