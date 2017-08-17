package shofi.pertama.android.mysunsine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.CollationElementIterator;
import java.text.StringCharacterIterator;

public class MainActivity extends AppCompatActivity {


    private TextView nMainToday;
    private ImageView nMainWeater;
    private TextView nMainweatherdesc;
    private TextView nMainWtemperatur;
    private RecyclerView nMainWeatherList;
    private LinearLayoutManager LayoutManager;
    private WeatherAdapter mWeatherAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewBaru();

    }

    private void initViewBaru() {
        nMainToday =(TextView) findViewById(R.id.txt_day);
        nMainWeater =(ImageView) findViewById(R.id.img_weather);
        nMainweatherdesc =(TextView) findViewById(R.id.txt_weather_desc);
        nMainWtemperatur =(TextView) findViewById(R.id.txt_weather_temperature);
        nMainWeatherList =(RecyclerView) findViewById(R.id.rv_Weather_list);

        nMainToday.setText("Minggu");
        nMainWtemperatur.setText("32 Derajat");
        nMainweatherdesc.setText("Petir Siang Bolong");

        LayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        nMainWeatherList.setLayoutManager(LayoutManager);
        nMainWeatherList.setHasFixedSize(true);

        mWeatherAdapter = new WeatherAdapter();
        nMainWeatherList.setAdapter(mWeatherAdapter);


        }
}
