package com.example.rutprogress.view.ListRoutes.Activities
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.rutprogress.R
import com.example.rutprogress.databinding.ActivityListRouteBinding
import com.example.rutprogress.databinding.ActivityLoginBinding
import com.example.rutprogress.view.ListRoutes.ViewModel.ListRouteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListRouteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListRouteBinding
    private val viewModel: ListRouteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListRouteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observar el mensaje del ViewModel
        viewModel.message.observe(this) { message ->
            binding.textView.text = message
        }

        // Botón para obtener el mensaje del servidor
        binding.button.setOnClickListener {
            viewModel.fetchMensaje()
        }

    }
}