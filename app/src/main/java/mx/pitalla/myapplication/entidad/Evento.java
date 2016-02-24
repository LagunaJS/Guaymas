package mx.pitalla.myapplication.entidad;

import android.os.Parcelable;

import java.util.Date;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by soygo on 18/02/2016.
 */
public class Evento implements Parcelable {
    private int id;
    private String nombre_evento;
    private String desc;
    private String fecha;
    private String lugar;
    private String hora;
    private String organiza;
    private String contacto;
    private String imagen;


    public Evento(){}

    /**
     * Constructor para el objeto Evento
     * @param id
     * @param nombre_evento
     * @param desc
     * @param fecha
     * @param lugar
     * @param hora
     * @param organiza
     * @param contacto
     * @param imagen
     */
    public Evento(int id, String nombre_evento, String desc, String fecha, String lugar, String hora, String organiza, String contacto, String imagen) {
        this.id = id;
        this.nombre_evento = nombre_evento;
        this.desc = desc;
        this.fecha = fecha;
        this.lugar = lugar;
        this.hora = hora;
        this.organiza = organiza;
        this.contacto = contacto;
        this.imagen = imagen;
    }

    protected Evento(Parcel in){
        id = in.readInt();
        nombre_evento = in.readString();
        desc = in.readString();
        fecha = in.readString();
        lugar = in.readString();
        hora = in.readString();
        organiza = in.readString();
        contacto = in.readString();
        imagen = in.readString();
    }

    public static final Creator<Evento> CREATOR = new Creator<Evento>() {
        @Override
        public Evento createFromParcel(Parcel in) {
            return new Evento(in);
        }

        @Override
        public Evento[] newArray(int size) {
            return new Evento [size];
        }
    };


    /**
     *
     * @return El valor del atributo id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id Establece un valor para el atributo id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrganiza() {
        return organiza;
    }

    public void setOrganiza(String organiza) {
        this.organiza = organiza;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel des, int flags){
        des.writeInt(id);
        des.writeString(nombre_evento);
        des.writeString(desc);
        des.writeString(fecha);
        des.writeString(lugar);
        des.writeString(hora);
        des.writeString(organiza);
        des.writeString(contacto);
        des.writeString(imagen);
    }

}
