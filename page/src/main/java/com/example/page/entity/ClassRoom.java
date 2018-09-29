package com.example.page.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClassRoom implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    private String jsbh;

    private String jsmc;

    private String jslb;

    private BigDecimal zws;

    private BigDecimal xqdm;

    private BigDecimal kszws;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJsbh() {
        return jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh == null ? null : jsbh.trim();
    }

    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc == null ? null : jsmc.trim();
    }

    public String getJslb() {
        return jslb;
    }

    public void setJslb(String jslb) {
        this.jslb = jslb == null ? null : jslb.trim();
    }

    public BigDecimal getZws() {
        return zws;
    }

    public void setZws(BigDecimal zws) {
        this.zws = zws;
    }

    public BigDecimal getXqdm() {
        return xqdm;
    }

    public void setXqdm(BigDecimal xqdm) {
        this.xqdm = xqdm;
    }

    public BigDecimal getKszws() {
        return kszws;
    }

    public void setKszws(BigDecimal kszws) {
        this.kszws = kszws;
    }
}