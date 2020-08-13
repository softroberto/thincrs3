/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Roberto Avelar
 */
public class Biblioteca {
     private Date entrada;
     private Date salida;
     private Integer noEntrada;
     private Usuario id;

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public Integer getNoEntrada() {
        return noEntrada;
    }

    public void setNoEntrada(Integer noEntrada) {
        this.noEntrada = noEntrada;
    }

    public Usuario getId() {
        return id;
    }

    public void setId(Usuario id) {
        this.id = id;
    }
}
