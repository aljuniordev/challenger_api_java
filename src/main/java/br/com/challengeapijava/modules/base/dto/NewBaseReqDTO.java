package br.com.challengeapijava.modules.base.dto;

import br.com.challengeapijava.modules.base.entities.Base;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public class NewBaseReqDTO {
    @NotBlank
    private Integer nrBase;
    @NotBlank
    private String sigla;
    @NotBlank
    private String municipio;
    @DecimalMin(value="0.0")
    private BigDecimal slaMinExp;
    @DecimalMin(value="0.0")
    private BigDecimal ncMinExp;
    @DecimalMin(value="0.0")
    private BigDecimal mobileMinExp;
    @DecimalMin(value="0.0")
    private BigDecimal adicExp;
    @DecimalMin(value="0.0")
    private BigDecimal valorStd;
    @DecimalMin(value="0.0")
    private BigDecimal valorLptLoc;
    @DecimalMin(value="0.0")
    private BigDecimal valorCardLoc;
    @DecimalMin(value="0.0")
    private BigDecimal valorLptInt;
    @DecimalMin(value="0.0")
    private BigDecimal valorCardInt;

    public Base convert() {
        return new Base(sigla, municipio, slaMinExp, ncMinExp, mobileMinExp, adicExp, valorStd,
                valorLptLoc, valorCardLoc, valorLptInt, valorCardInt, nrBase);
    }

    public String getSigla() {
        return sigla;
    }

    public String getMunicipio() {
        return municipio;
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

    public Integer getNrBase() {
        return nrBase;
    }
}
