package com.atguigu.crowd.funding.entity;

public class AccountTypeCert {
    private Integer id;

    private Byte accttype;

    private Integer certid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getAccttype() {
        return accttype;
    }

    public void setAccttype(Byte accttype) {
        this.accttype = accttype;
    }

    public Integer getCertid() {
        return certid;
    }

    public void setCertid(Integer certid) {
        this.certid = certid;
    }
}