package pe.edu.idat.apprecyclerviewimg

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerviewimg.databinding.ActivityMainBinding
import pe.edu.idat.apprecyclerviewimg.databinding.ItemAndroidBinding

class AdapterAndroid (val listaAndroid: List<Android>, val context: Context):
    RecyclerView.Adapter<AdapterAndroid.ViewHolder>() {
        inner class ViewHolder(val binding: ItemAndroidBinding) :
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = listaAndroid.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(listaAndroid[position]){
                binding.tvNoVersion.text = nombre
                binding.tvNuVersion.text = version
                binding.ivImagen.setImageResource(img)
                binding.cvAndroid.setOnClickListener(View.OnClickListener {
                    Toast.makeText(context, "Click Item Android",
                        Toast.LENGTH_LONG)
                })
            }
        }
    }
}