/*
 * Copyright (c) 2015 Inomera Research.
 */

package mobile.netmera.com.burakurus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.netmera.NetmeraPushBroadcastReceiver;
import com.netmera.NetmeraPushObject;

/**
 * @author Emmar Kardeslik
 */
public class NGPushBroadcastReceiver extends NetmeraPushBroadcastReceiver {

  @Override
  protected void onPushRegister(Context context, String gcmSenderId, String pushToken) {
    Log.v("sample", "onPushRegister");
  }

  @Override
  protected void onPushReceive(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushReceive");
  }

  @Override
  protected void onPushOpen(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushOpen");
    Intent intent = context.getPackageManager().getLaunchIntentForPackage("mobile.netmera.com.burakurus");
    if(intent != null){
      bundle.putString("key","user");
      bundle.putString("name","burak");
      intent.putExtras(bundle);
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
      context.startActivity(intent);

    }
  }

  @Override
  protected void onPushDismiss(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushDismiss");
  }

  @Override
  protected void onPushButtonClicked(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushButtonClicked");
  }
}
