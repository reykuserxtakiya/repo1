package shofi.pertama.android.mysunsine;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asus on 20/08/2017.
 */

public class App extends Application {

    private static App instance;
    private Gson gson;
    private Retrofit retrofit;

    public App(){
        App instance = this;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        createRetrofit();
        createGson();

    }

    private void createGson(){gson =new GsonBuilder().create() }

    private void createRetrofit() {
    retrofit = new Retrofit.Builder()
            .baseUrl(BaseUrl.BASE_URL_WEATHER)
            .addCallAdapterFactory(GsonConverterFactory.create())
            .build();
    }
    public Gson getGson(){return gson;}

}
