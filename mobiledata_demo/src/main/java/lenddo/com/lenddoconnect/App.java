package lenddo.com.lenddoconnect;

import android.app.Application;

import com.lenddo.mobile.core.LenddoCoreInfo;
import com.lenddo.mobile.datasdk.AndroidData;
import com.lenddo.mobile.datasdk.models.ClientOptions;


public class App extends Application {

    public void setupDataSDK(String PSID, String SECRET, ClientOptions clientOptions) {
        LenddoCoreInfo.initCoreInfo(getApplicationContext());
        AndroidData.setup(getApplicationContext(), PSID, SECRET, clientOptions);
    }
}
