package com.neuedu.pojo;

import com.neuedu.util.Column;

public class Dept {
    private Integer depto;
    private String dname;
    @Column("loc")
    private String local;

    public Integer getDepto() {
        return depto;
    }

    public void setDepto(Integer depto) {
        this.depto = depto;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "depto=" + depto +
                ", dname='" + dname + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
