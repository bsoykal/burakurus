package mobile.netmera.com.burakurus

import android.app.Application
import com.netmera.Netmera

class App : Application() {

    override fun onCreate() {
        super.onCreate()


//        var apiKey = "DHT7u5QcIkH8uAczhlFAx0UlfLxqckERgpRDPic2nM9vdA2WP4nhJQ"
        var apiKey = "DHT7u5QcIkED0q4wmHi8e8F4-ydEPAZToMxG6d7jinfTnGjrzihQDQ"
        var baseUrl ="http://nova.sdpaas.com"
        var senderID ="520934922239"

        Netmera.logging(true)
        Netmera.init(this,senderID,apiKey)


    }
}