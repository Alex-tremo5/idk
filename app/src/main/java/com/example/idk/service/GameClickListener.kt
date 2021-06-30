package com.droids.androidcourse.servicecall

import com.example.idk.data.DogamiGameResult

interface GameClickListener {

    fun onGameClicked(dogamiGameResult: DogamiGameResult)
}