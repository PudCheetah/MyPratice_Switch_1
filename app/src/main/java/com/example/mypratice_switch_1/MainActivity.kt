package com.example.mypratice_switch_1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_switch_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "$binding:{binding}", Toast.LENGTH_SHORT).show()

        binding.MySwitch1.setOnCheckedChangeListener { buttonview, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "開關${buttonview}${isChecked}", Toast.LENGTH_SHORT).show()
                println("-------------------")
                println("switch On")
                println("-------------------")
            } else {
                Toast.makeText(this, "開關${buttonview}${isChecked}", Toast.LENGTH_SHORT).show()
                println("-------------------")
                println("switch OFF")
                println("-------------------")
            }
        }
    }

    fun toastHere(buttonview: View, isCheck: Boolean){
        Toast.makeText(this, "開關${buttonview}${isCheck}", Toast.LENGTH_SHORT).show()
    }
}