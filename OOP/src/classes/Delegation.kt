package classes

import java.security.Principal

interface Singer{
    fun sing()
}
interface Dance{
    fun dance()
}
open class HumanSinger() : Singer {
    override fun sing() {
        println("Human Singer is singing")
    }

}
class AiSinger() : Singer {
    override fun sing() {
        println("AiSinger is singing")
    }

}

class HumanDance() : Dance {
    override fun dance() {
        println("Human Dance is dancing")
    }
}

class AiDance() : Dance {
    override fun dance() {
        println("AiDance is dancing")
    }

}

class PlaySong(
    private val singer: Singer,
    private val dance: Dance
    ): Singer by singer   //object inside constructor and type of implementation must be the same.
      ,Dance by dance   // delegation also can implement many interface at once.
{
//    override fun sing() {  // we also can override those implemented-function
//        println("PlaySong is playing")
//    }
    fun play() {   // also can have own behavior
        println("PlaySong is playing")
    }
}
fun main() {
    val humanSinger: Singer = HumanSinger()
    val aiSinger: AiSinger = AiSinger()
    val humanDance = HumanDance()
    val aiDance = AiDance()
    val playSong = PlaySong(aiSinger, aiDance)
    playSong.dance()
    playSong.sing()
    playSong.play()
}