package itson.edu.mx.examen2


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Regalos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        // Crear la lista de objetos Detalles con imágenes y precios
        val detalles = listOf(
            Detalles(R.drawable.pelucheminecraft, "$10"),
            Detalles(R.drawable.peluchemario, "$12"),
            Detalles(R.drawable.peluchepeppa, "$8"),
            Detalles(R.drawable.peluchesony, "$15")
        )


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 columnas por fila
        val adapter = DetallesAdapter(detalles)
        recyclerView.adapter = adapter
    }
}

class DetallesAdapter(private val detalles: List<Detalles>) : RecyclerView.Adapter<DetallesAdapter.DetallesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallesViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.detalleregalo, parent, false)
        return DetallesViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetallesViewHolder, position: Int) {
        val detalle = detalles[position]
        holder.bind(detalle)
    }

    override fun getItemCount(): Int {
        return detalles.size
    }

    class DetallesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.iv_regalo_imagen)
        private val precioTextView: TextView = itemView.findViewById(R.id.tv_regalo_precio)

        fun bind(detalle: Detalles) {
            imageView.setImageResource(detalle.image) // Establecer la imagen
            precioTextView.text = detalle.precio // Establecer el precio
        }
    }
}