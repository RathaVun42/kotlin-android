package classes

import kotlin.concurrent.thread

class Count(private var num: Int = 0){
    fun ShowNum(): Int = this.num
    fun CountNum(){
        synchronized(this){  // without synchronized, num += 1 maybe happen simultaneously(when have more thread), but still plus 1.
            num += 1
        }

    }

}

fun main() {
    val count = Count()
    val count2 = Count()
    val thread1 =  thread { // if we use thread(with lowercase) it automatically includes .start()
                            // if we are using Thread (with capital letter) it doesn't automatically provide us .start(), so we need to declare it after Thread declaration.
        repeat(100){
            count.CountNum()
        }
    }
    val thread2 = thread {
        repeat(100){
            count.CountNum()
        }
    }
    val thread3 = thread {
        repeat(100){
            count2.CountNum()
        }
    }

    thread2.join() // this means thread 2 wait until thread 1 finished, then it will start.
    println(count.ShowNum())
    println(count2.ShowNum())
}