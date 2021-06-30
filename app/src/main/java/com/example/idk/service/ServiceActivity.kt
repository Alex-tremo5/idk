package com.example.idk.service

import GamesAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droids.androidcourse.servicecall.GameClickListener
import com.example.idk.R
import com.example.idk.data.ApiClient
import com.example.idk.data.DogamiGameResult
import com.example.idk.data.Games
import com.example.idk.service.gameDetail.GameDetailActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ServiceActivity : AppCompatActivity(), GameClickListener {
    lateinit var gameView: RecyclerView
    lateinit var adapter: GamesAdapter
    lateinit var error: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        error = findViewById(R.id.textViewInternet)
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
                    showErrorView()
                }

                override fun onResponse(call: Call<Games>, response: Response<Games>) {
                    gameView.post {
                        val body = response.body()
                        body?.run {
                            showGames(this.games)
                            showListView()


                        }
                    }
                }
            })
        }).start()
    }

    private fun showListView() {
        error.visibility = View.GONE
        gameView.visibility = View.VISIBLE

    }

    private fun showErrorView() {
        error.visibility = View.VISIBLE
        gameView.visibility = View.GONE

    }

    private fun showGames(list: List<DogamiGameResult>?) {
        list?.run {
            adapter = GamesAdapter(this@ServiceActivity, this.toMutableList(),this@ServiceActivity)
            gameView.adapter = adapter
        }
    }

    override fun onGameClicked(dogamiGameResult: DogamiGameResult) {
        val inte = Intent(this, GameDetailActivity::class.java)
        inte.putExtra("game", dogamiGameResult)
        startActivity(inte)
    }

}