package mx.pitalla.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidquery.AQuery;
import com.squareup.picasso.Picasso;

import mx.pitalla.myapplication.entidad.Evento;
import mx.pitalla.myapplication.funciones.miActionBar;

/**
 * Created by soygo on 19/02/2016.
 */
public class EventoActivity extends AppCompatActivity{
    AQuery aq;
    Evento evento;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_evento);

        aq = new AQuery(this);
        evento = getIntent().getParcelableExtra("datosEvento");

        miActionBar ab = new miActionBar(getSupportActionBar(),"evento");


        aq.id(R.id.txtTituloEventoDetalle).text(evento.getNombre_evento());
        aq.id(R.id.txtOrganizaEventoDetalle).text(evento.getOrganiza());
        aq.id(R.id.txtLugarEventoDetalle).text(evento.getLugar());
        aq.id(R.id.txtFechaEventoDetalle).text(evento.getFecha());
        aq.id(R.id.txtHoraEventoDetalle).text(evento.getHora());
        aq.id(R.id.txtDescEventoDetalle).text(evento.getDesc());
        aq.id(R.id.txtContactoEventoDetalle).text(evento.getContacto());
        Picasso.with(this).load(evento.getImagen()).error(R.drawable.noticiadefault).into(aq.id(R.id.imgEventoDetalle).getImageView());


    }
}
