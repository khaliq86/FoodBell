package com.example.uts_khaliq


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter (val makanan: List<Makanan>, val context : Context): RecyclerView.Adapter<MakananAdapter.MyViewHolder>(){
    class MyViewHolder(val row: View): RecyclerView.ViewHolder(row){
        val gambar = row.findViewById<ImageView>(R.id.foodImage)
        val nameMakanan = row.findViewById<TextView>(R.id.nameFood)
        val hargaMakanan = row.findViewById<TextView>(R.id.priceFood)
        val asalMakanan = row.findViewById<TextView>(R.id.fromFood)
    }
    override fun getItemCount(): Int {
        return makanan.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan,
            parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gambar.setImageResource(makanan.get(position).gambar)
        holder.nameMakanan.text = makanan.get(position).nameMakanan
        holder.hargaMakanan.text = makanan.get(position).hargaMakanan
        holder.asalMakanan.text = makanan.get(position).asalMakanan

        val model = makanan.get(position)
        val judul = model.nameMakanan
        val asal = model.asalMakanan
        val harga =model.hargaMakanan
        val deskripsi= model.deksripsi
        val gambar = model.gambar


        holder.itemView.setOnClickListener {

            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("Nama", judul)
                putExtra("Asal", asal)
                putExtra("Harga", harga)
                putExtra("Deskripsi", deskripsi)
                putExtra("Gambar", gambar)
            }
            context.startActivity(intent)
        }
    }
}
