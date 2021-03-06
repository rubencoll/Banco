/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.banco;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {
    
    private int idMovimientoBancario;
    private List<CuentaBancaria> cuentaBancaria;
    private TipoMovimientoBancario tipoMovimientoBancario;
    private BigDecimal importe;
    private Date fecha;
    private BigDecimal saldoTotal;
    private String concepto;
    
    public MovimientoBancario(){
    
    
    
    }

    public MovimientoBancario(int idMovimientoBancario, List<CuentaBancaria> cuentaBancaria, TipoMovimientoBancario tipoMovimientoBancario, BigDecimal importe, Date fecha, BigDecimal saldoTotal, String concepto) {
        this.idMovimientoBancario = idMovimientoBancario;
        this.cuentaBancaria = cuentaBancaria;
        this.tipoMovimientoBancario = tipoMovimientoBancario;
        this.importe = importe;
        this.fecha = fecha;
        this.saldoTotal = saldoTotal;
        this.concepto = concepto;
    }

    public int getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    public void setIdMovimientoBancario(int idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    public List<CuentaBancaria> getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(List<CuentaBancaria> cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public TipoMovimientoBancario getTipoMovimientoBancario() {
        return tipoMovimientoBancario;
    }

    public void setTipoMovimientoBancario(TipoMovimientoBancario tipoMovimientoBancario) {
        this.tipoMovimientoBancario = tipoMovimientoBancario;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    
}
