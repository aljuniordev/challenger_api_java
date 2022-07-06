package br.com.challengeapijava.modules.base.dto;

import br.com.challengeapijava.modules.base.entities.Base;

import java.math.BigDecimal;

public class EditBaseDTO {
    private BigDecimal slaMinExp;
    private BigDecimal ncMinExp;
    private BigDecimal mobileMinExp;
    private BigDecimal adicExp;
    private BigDecimal valorStd;
    private BigDecimal valorLptLoc;
    private BigDecimal valorCardLoc;
    private BigDecimal valorLptInt;
    private BigDecimal valorCardInt;

    public Base convert() {
        return new Base(slaMinExp, ncMinExp, mobileMinExp, adicExp, valorStd,
                valorLptLoc, valorCardLoc, valorLptInt, valorCardInt);
    }

    public BigDecimal getSlaMinExp() {
        return slaMinExp;
    }

    public BigDecimal getNcMinExp() {
        return ncMinExp;
    }

    public BigDecimal getMobileMinExp() {
        return mobileMinExp;
    }

    public BigDecimal getAdicExp() {
        return adicExp;
    }

    public BigDecimal getValorStd() {
        return valorStd;
    }

    public BigDecimal getValorLptLoc() {
        return valorLptLoc;
    }

    public BigDecimal getValorCardLoc() {
        return valorCardLoc;
    }

    public BigDecimal getValorLptInt() {
        return valorLptInt;
    }

    public BigDecimal getValorCardInt() {
        return valorCardInt;
    }
}
