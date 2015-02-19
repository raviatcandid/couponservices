/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.riteaid;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * RiteAid load to card response
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement(name = "AcqsResponseMsg")
@XmlAccessorType(XmlAccessType.FIELD)
public class AcqsResponseMsg {
    @XmlElement(name="Issuer")
    private String issuer;
    @XmlElement(name="Originator")
    private String originator;
    @XmlElementWrapper(name="IssuerAcqs")
    @XmlElement(name="IssuerAcq")
    private List<IssuerAcq> issuerAcqs;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public List<IssuerAcq> getIssuerAcqs() {
        return issuerAcqs;
    }

    public void setIssuerAcqs(List<IssuerAcq> issuerAcqs) {
        this.issuerAcqs = issuerAcqs;
    }
}
