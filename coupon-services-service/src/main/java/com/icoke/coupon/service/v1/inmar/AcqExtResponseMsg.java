/*
 * Copyright (c) 2013. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.inmar;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement(name = "AcqExtResponseMsg")
@XmlAccessorType(XmlAccessType.FIELD)
public class AcqExtResponseMsg {
    @XmlElement(name="Originator")
    private String originator;          // Identifies the message originator.	Yes	Inmar-assigned name of the originating party.
    @XmlElementWrapper(name="AcqExts")
    @XmlElement(name="AcqExt")
    private List<AcqExtResponse> acqExts;

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public List<AcqExtResponse> getAcqExts() {
        return acqExts;
    }

    public void setAcqExts(List<AcqExtResponse> acqExts) {
        this.acqExts = acqExts;
    }
}
