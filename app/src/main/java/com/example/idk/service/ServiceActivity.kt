package com.example.idk.service

import GamesAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.idk.R
import com.example.idk.data.ApiClient
import com.example.idk.data.DogamiGameResult
import com.example.idk.data.Games
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ServiceActivity : AppCompatActivity() {
    lateinit var gameView: RecyclerView
    lateinit var adapter: GamesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        getGames()
        gameView = findViewById(R.id.rvGames)
        gameView.layoutManager =
        StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val decoration = SpacesItemDecoration(50)
        gameView.addItemDecoration(decoration)

    }

    private fun getGames() {
        Thread(Runnable {
            ApiClient.apiService.getGames().enqueue(object :
                Callback<Games> {

                override fun onFailure(call: Call<Games>, t: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call<Games>, response: Response<Games>) {
                    gameView.post {
                        val body = response.body()
                        body?.run {
                            showGames(this.games)
                        }
                    }
                }
            })
        }).start()
    }
    private fun showGames(list: List<DogamiGameResult>?) {
        list?.run {
            adapter = GamesAdapter(this@ServiceActivity, this.toMutableList())
            gameView.adapter = adapter
        }
    }

}