package shofi.pertama.android.mysunsine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.CollationElementIterator;
import java.text.StringCharacterIterator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.txt_day)
    TextView mWeatherDay;
    @BindView(R.id.img_weather)
    ImageView mWeatherImage;
    @BindView(R.id.txt_weather_desc)
    TextView mWeatherDesc;
    @BindView(R.id.txt_adapter_weather_temperature)
    TextView mWeatherTemperature;
    @BindView(R.id.rv_Weather_list)
    RecyclerView mWeatherList;

    private WeatherAdapter mWeatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ButterKnife.bind(this);

    mWeatherDay.setText("Minggu");
        mWeatherImage.setImageResource(R.mipmap.ic_launcher_round);
        mWeatherDesc.setText("Cerah Banget");
        mWeatherTemperature.setText("32 Derajat");

    LinearLayoutManager mWeatherLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mWeatherList.setLayoutManager(mWeatherLayoutManager);
        mWeatherList.setHasFixedSize(true);

    mWeatherAdapter = new WeatherAdapter();
        mWeatherList.setAdapter(mWeatherAdapter);


        }
}
