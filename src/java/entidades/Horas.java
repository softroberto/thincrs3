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
public class Horas {
     private Date entrada;
       private Date salida;
       private Integer noDia;
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

    public Integer getNoDia() {
        return noDia;
    }

    public void setNoDia(Integer noDia) {
        this.noDia = noDia;
    }

    public Usuario getId() {
        return id;
    }

    public void setId(Usuario id) {
        this.id = id;
    }
}
