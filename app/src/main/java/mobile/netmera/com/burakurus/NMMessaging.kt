package mobile.netmera.com.burakurus

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.netmera.Netmera

class NMMessaging : FirebaseMessagingService(){

    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)

        Log.i("BurakUrus","mESSAGE RECEiVED")

        Netmera.onNetmeraPushMessageReceived(p0)
    }

    override fun onNewToken(p0: String?) {
        super.onNewToken(p0)

        Log.i("BurakUrus","Token :: "+p0)
    }
}