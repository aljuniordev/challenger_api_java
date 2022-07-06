package br.com.challengeapijava.modules.base.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="base")
public class Base implements Serializable {

    @Serial
    private static final long serialVersionUID = -2420346134960559062L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idbase")
    private long idBase;

    @Column(name="sigla")
    private String sigla;

    @Column(name="municipio")
    private String municipio;

    @Column(name="slaminexp")
    private BigDecimal slaMinExp;

    @Column(name="ncminexp")
    private BigDecimal ncMinExp;

    @Column(name="mobileminexp")
    private BigDecimal mobileMinExp;

    @Column(name="adicexp")
    private BigDecimal adicExp;

    @Column(name="valorstd")
    private BigDecimal valorStd;

    @Column(name="valorlptloc")
    private BigDecimal valorLptLoc;

    @Column(name="valorcardloc")
    private BigDecimal valorCardLoc;

    @Column(name="valorlptint")
    private BigDecimal valorLptInt;

    @Column(name="valorcardint")
    private BigDecimal valorCardInt;

    @Column(name="nrbase")
    private Integer nrBase;

    public Base() {

    }

    public Base(String sigla, String municipio, BigDecimal slaMinExp, BigDecimal ncMinExp,
                BigDecimal mobileMinExp, BigDecimal adicExp, BigDecimal valorStd, BigDecimal valorLptLoc,
                BigDecimal valorCardLoc, BigDecimal valorLptInt, BigDecimal valorCardInt, Integer nrBase) {
        this.sigla = sigla;
        this.municipio = municipio;
        this.slaMinExp = slaMinExp;
        this.ncMinExp = ncMinExp;
        this.mobileMinExp = mobileMinExp;
        this.adicExp = adicExp;
        this.valorStd = valorStd;
        this.valorLptLoc = valorLptLoc;
        this.valorCardLoc = valorCardLoc;
        this.valorLptInt = valorLptInt;
        this.valorCardInt = valorCardInt;
        this.nrBase = nrBase;
    }

    public Base(BigDecimal slaMinExp, BigDecimal ncMinExp,
                BigDecimal mobileMinExp, BigDecimal adicExp, BigDecimal valorStd, BigDecimal valorLptLoc,
                BigDecimal valorCardLoc, BigDecimal valorLptInt, BigDecimal valorCardInt) {
        this.slaMinExp = slaMinExp;
        this.ncMinExp = ncMinExp;
        this.mobileMinExp = mobileMinExp;
        this.adicExp = adicExp;
        this.valorStd = valorStd;
        this.valorLptLoc = valorLptLoc;
        this.valorCardLoc = valorCardLoc;
        this.valorLptInt = valorLptInt;
        this.valorCardInt = valorCardInt;
    }

    public Base(Long idBase, String sigla) {
        this.idBase = idBase;
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Base)) return false;

        Base base = (Base) o;

        return idBase == base.idBase;
    }

    @Override
    public int hashCode() {
        return (int) (idBase ^ (idBase >>> 32));
    }

    @Override
    public String toString() {
        return "Base{" +
                "idBase=" + idBase +
                ", sigla='" + sigla + '\'' +
                ", municipio='" + municipio + '\'' +
                ", slaMinExp=" + slaMinExp +
                ", ncMinExp=" + ncMinExp +
                ", mobileMinExp=" + mobileMinExp +
                ", adicExp=" + adicExp +
                ", valorStd=" + valorStd +
                ", valorLptLoc=" + valorLptLoc +
                ", valorCardLoc=" + valorCardLoc +
                ", valorLptInt=" + valorLptInt +
                ", valorCardInt=" + valorCardInt +
                ", nrBase=" + nrBase +
                '}';
    }

    public long getIdBase() {
        return idBase;
    }

    public void setIdBase(long idBase) {
        this.idBase = idBase;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public BigDecimal getSlaMinExp() {
        return slaMinExp;
    }

    public void setSlaMinExp(BigDecimal slaMinExp) {
        this.slaMinExp = slaMinExp;
    }

    public BigDecimal getNcMinExp() {
        return ncMinExp;
    }

    public void setNcMinExp(BigDecimal ncMinExp) {
        this.ncMinExp = ncMinExp;
    }

    public BigDecimal getMobileMinExp() {
        return mobileMinExp;
    }

    public void setMobileMinExp(BigDecimal mobileMinExp) {
        this.mobileMinExp = mobileMinExp;
    }

    public BigDecimal getAdicExp() {
        return adicExp;
    }

    public void setAdicExp(BigDecimal adicExp) {
        this.adicExp = adicExp;
    }

    public BigDecimal getValorStd() {
        return valorStd;
    }

    public void setValorStd(BigDecimal valorStd) {
        this.valorStd = valorStd;
    }

    public BigDecimal getValorLptLoc() {
        return valorLptLoc;
    }

    public void setValorLptLoc(BigDecimal valorLptLoc) {
        this.valorLptLoc = valorLptLoc;
    }

    public BigDecimal getValorCardLoc() {
        return valorCardLoc;
    }

    public void setValorCardLoc(BigDecimal valorCardLoc) {
        this.valorCardLoc = valorCardLoc;
    }

    public BigDecimal getValorLptInt() {
        return valorLptInt;
    }

    public void setValorLptInt(BigDecimal valorLptInt) {
        this.valorLptInt = valorLptInt;
    }

    public BigDecimal getValorCardInt() {
        return valorCardInt;
    }

    public void setValorCardInt(BigDecimal valorCardInt) {
        this.valorCardInt = valorCardInt;
    }

    public Integer getNrBase() {
        return nrBase;
    }

    public void setNrBase(Integer nrBase) {
        this.nrBase = nrBase;
    }
}