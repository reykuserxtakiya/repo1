package shofi.pertama.android.mysunsine;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by asus on 13/08/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_list,parent,false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.cv_adapter_weather)
        CardView adapterWeather;

        @BindView(R.id.img_adapter_weather)
        ImageView adapterWeatherImage;

        @BindView(R.id.txt_adapter_weather_date)
        TextView adapterWeatherDate;

        @BindView(R.id.txt_adapter_weather_desc)
        TextView adapterWeatherDesc;

        @BindView(R.id.txt_adapter_weather_temperature)
        TextView adapterWeatherTemperature;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

            adapterWeather.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            showDetail(v.getContext());
        }
    }

    private void showDetail(Context context) {
        Intent intent = new Intent(context, DetailActivity.class);
        context.startActivity(intent);
    }
}