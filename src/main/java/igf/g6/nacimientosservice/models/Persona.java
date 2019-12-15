package igf.g6.nacimientosservice.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "nacimiento")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "primer_nombre") private String primer_nombre;
    @Column(name = "segundo_nombre") private String segundo_nombre;
    @Column(name = "primer_apellido") private String primer_apellido;
    @Column(name = "segundo_apellido") private String segundo_apellido;
    @Column(name = "apellido_casada") private String apellido_casada;
    @Column(name = "dui") private String dui;
    @Column(name = "estado_civil") private String estado_civil;
    @Column(name = "lugar_nacimiento") private String lugar_nacimiento;
    @Column(name = "mayoria_edad") private Boolean mayoria_edad;
    @Column(name = "padre") private String padre;
    @Column(name = "madre") private String madre;
    @Column(name = "hora") private Time hora;
    @Column(name = "fecha_nacimiento") private Date fecha_nacimiento;
    @Column(name = "hospital") private String hospital;
    @Column(name = "sexo") private String sexo;

    public Persona() {
    }

    public Persona(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String apellido_casada, String dui, String estado_civil, String lugar_nacimiento, Boolean mayoria_edad, String padre, String madre, Time hora, Date fecha_nacimiento, String hospital, String sexo) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.apellido_casada = apellido_casada;
        this.dui = dui;
        this.estado_civil = estado_civil;
        this.lugar_nacimiento = lugar_nacimiento;
        this.mayoria_edad = mayoria_edad;
        this.padre = padre;
        this.madre = madre;
        this.hora = hora;
        this.fecha_nacimiento = fecha_nacimiento;
        this.hospital = hospital;
        this.sexo = sexo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getApellido_casada() {
        return apellido_casada;
    }

    public void setApellido_casada(String apellido_casada) {
        this.apellido_casada = apellido_casada;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public Boolean getMayoria_edad() {
        return mayoria_edad;
    }

    public void setMayoria_edad(Boolean mayoria_edad) {
        this.mayoria_edad = mayoria_edad;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
