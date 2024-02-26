package pe.edu.idat.apprecyclerviewimg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.apprecyclerviewimg.databinding.ActivityMainBinding
import pe.edu.idat.apprecyclerviewimg.databinding.ItemAndroidBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvandroid.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvandroid.adapter = AdapterAndroid(
            listaAndroid(), applicationContext
        )
    }

    fun listaAndroid(): List<Android>{
        val lista = ArrayList<Android>()
        lista.add(Android("Appel Cake", "Android 1.0", R.drawable.image1))
        lista.add(Android("Petit Four", "Android 1.0", R.drawable.image2))
        lista.add(Android("Cup Cake", "Android 1.5", R.drawable.image3))
        lista.add(Android("Donut", "Android 1.6", R.drawable.image4))
        lista.add(Android("Eclair", "Android 2.0 - 2.1", R.drawable.image5))
        lista.add(Android("Froyo", "Android 2.0 - 2.2.3", R.drawable.image6))
        lista.add(Android("GingerBread", "Android 1.0", R.drawable.image7))
        lista.add(Android("Honeycomb", "Android 1.0", R.drawable.image8))
        lista.add(Android("JellyBean", "Android 1.0", R.drawable.image9))
        lista.add(Android("Mashmallow", "Android 1.0", R.drawable.image10))
        return lista
    }
}