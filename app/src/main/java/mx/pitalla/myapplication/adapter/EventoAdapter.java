package mx.pitalla.myapplication.adapter;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import mx.pitalla.myapplication.R;
import mx.pitalla.myapplication.entidad.Evento;

/**
 * Created by Ernesto Salazar on 18/02/2016.
 */
public class EventoAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Evento> datos;

    public EventoAdapter(Context context, ArrayList<Evento> datos){
        super(context, R.layout.item_evento, datos);
        this.context = context;
        this.datos = datos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_evento, null);


        ImageView imagen = (ImageView) item.findViewById(R.id.imgViewEvento);
        Picasso.with(context).load(datos.get(position).getImagen()).into(imagen);

        TextView titulo = (TextView) item.findViewById(R.id.eventTitle);
        TextView fechaYhora = (TextView) item.findViewById(R.id.eventDate);
        TextView lugar = (TextView) item.findViewById(R.id.eventPlace);

        String hora = datos.get(position).getHora();
        String fecha = datos.get(position).getFecha();


        titulo.setText(datos.get(position).getNombre_evento());
        fechaYhora.setText(fecha +" | "+hora);
        lugar.setText(datos.get(position).getLugar());



        return item;

    }
}
