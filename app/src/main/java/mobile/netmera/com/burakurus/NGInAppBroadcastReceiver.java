/*
 * Copyright (c) 2015 Inomera Research.
 */

package mobile.netmera.com.burakurus;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.netmera.NetmeraInAppMessage;
import com.netmera.NetmeraInAppMessageBroadcastReceiver;


/**
 * @author Burak Soykal
 */
public class NGInAppBroadcastReceiver extends NetmeraInAppMessageBroadcastReceiver {

  @Override
  protected void onInAppMessageShown(Context context, NetmeraInAppMessage inAppMessage) {
    super.onInAppMessageShown(context, inAppMessage);
    Log.v("sample", "onInAppMessageShown id :: " +inAppMessage.getId());
    Toast.makeText(context, "onInAppMessageShown id :: " +inAppMessage.getId(), Toast.LENGTH_SHORT).show();
  }

  @Override
  protected void onInAppMessageOpen(Context context, NetmeraInAppMessage inAppMessage) {
    super.onInAppMessageOpen(context, inAppMessage);
    Log.v("sample", "onInAppMessageOpen id :: " +inAppMessage.getId());
    Toast.makeText(context, "onInAppMessageOpen id :: " +inAppMessage.getId(), Toast.LENGTH_SHORT).show();
  }

  @Override
  protected void onInAppMessageDismissed(Context context, NetmeraInAppMessage inAppMessage) {
    super.onInAppMessageDismissed(context, inAppMessage);
    Log.v("sample", "onInAppMessageDismissed id :: " +inAppMessage.getId());
    Toast.makeText(context, "onInAppMessageDismissed id :: " +inAppMessage.getId(), Toast.LENGTH_SHORT).show();
  }

}
