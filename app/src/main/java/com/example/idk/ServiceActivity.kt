package com.example.idk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.idk.data.ApiClient
import com.example.idk.data.DogamiGameResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ServiceActivity : AppCompatActivity() {
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        getGames()
        result = findViewById(R.id.tvService)

    }

    private fun getGames() {
        Thread(Runnable {
            ApiClient.apiService.getGames().enqueue(object :
                Callback<MutableList<DogamiGameResult>> {
                override fun onFailure(call: Call<MutableList<DogamiGameResult>>, t: Throwable) {
                    result.post {
                        result.text = "Error loading data :("
                    }
                }

                override fun onResponse(
                    call: Call<MutableList<DogamiGameResult>>,
                    response: Response<MutableList<DogamiGameResult>>
                ) {
                    result.post {
                        result.text = response.body().toString()
                    }
                }
            })
        }).start()

    }


}