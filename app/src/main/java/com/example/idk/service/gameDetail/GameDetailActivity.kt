package com.example.idk.service.gameDetail

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.idk.R
import com.example.idk.data.DogamiGameResult
import com.example.idk.service.SpacesItemDecoration

class GameDetailActivity : AppCompatActivity() {

    lateinit var gameTitle: TextView
    lateinit var gameTime: TextView
    lateinit var gamePlayers: TextView
    lateinit var gameDescription: TextView
    lateinit var gameComplexity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)

        val game: DogamiGameResult =
            intent.getParcelableExtra<DogamiGameResult>("game") as DogamiGameResult

        gameTitle = findViewById(R.id.tvTitle)
        gameTitle.text = game.name
        println("******" + game.name)

        gamePlayers = findViewById(R.id.tvPlayers)
        gamePlayers.text = "${game.minPlayers} - ${game.maxPlayers}"

        gameTime = findViewById(R.id.tvTime)
        gameTime.text = game.time

        gameDescription = findViewById(R.id.tvDescription)
        gameDescription.text = game.description

        gameComplexity = findViewById(R.id.tvHardcore)
        gameComplexity.text = game.complexity

    }


}
