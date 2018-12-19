package mobile.netmera.com.burakurus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.netmera.Netmera
import com.netmera.NetmeraUser

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG,"Main Activity Started")
        Log.e(TAG,"Main Activity name ?: "+intent?.extras?.keySet()?.contains("name"))

        val user =  NetmeraUser()
        user.setUserId("burus")
        user.setName("Burak")
        user.setSurname("Urus")
        Netmera.updateUser(user)

    }
}
