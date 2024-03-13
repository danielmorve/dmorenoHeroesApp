package com.example.heroesapp.models

data class Publisher(val id:Int, val name: String, val image: String){
    companion object{
        val publishers = mutableListOf<Publisher>(
            //Marvel and DC
            Publisher(1,"Marvel","https://static.wikia.nocookie.net/tardis/images/3/3e/MarvelLogo.png/revision/latest?cb=20200907192259"),
            Publisher(2,"DC","https://static.wikia.nocookie.net/comicdc/images/1/1c/DC_Comics_logo.png/revision/latest/scale-to-width-down/2953?cb=20171019084246&path-prefix=es"),
        )
    }
}
