package dev.allsafeindia.fatak.Interface;

import android.net.wifi.p2p.WifiP2pDevice;

public interface UpdateUI {
    void onThreadWorkDone(String message);

    void onRequestPermissionRequest(int requestCode, String permission[], int[] grantResults);
}
