package org.unitec.elementos1903;

import java.time.LocalDateTime;

public class Asistencia {
    
    private LocalDateTime fecha;
    private Boolean Presente;

    public Asistencia(LocalDateTime fecha, Boolean Presente) {
        this.fecha = fecha;
        this.Presente = Presente;
    }

    public Asistencia() {
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Boolean getPresente() {
        return Presente;
    }

    public void setPresente(Boolean Presente) {
        this.Presente = Presente;
    }
}
