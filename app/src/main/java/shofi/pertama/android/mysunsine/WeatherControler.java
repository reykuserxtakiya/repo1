package shofi.pertama.android.mysunsine;

import android.nfc.Tag;
import android.util.Log;

/**
 * Created by asus on 20/08/2017.
 */

public class WeatherControler {
    public void getWeatherList(){
        App.getInstance().getRetrofit().create(WeatherApi.class).getWeatherList(BaseUrl.CITY, BaseUrl.UNITS, BaseUrl.API_KEY)
                @Override
                        if(reponse.code()==200){
                            Log.d(Tag,"onResponse: Respon nya 200 nih");
                        }
                        else{
                            Log.d(Tag, "onResponse: Respon nya gagal nih.");
                        }
    }
}
