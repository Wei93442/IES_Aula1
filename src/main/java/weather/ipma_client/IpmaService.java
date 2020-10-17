package weather.ipma_client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author Wei
 * @date 2020/10/8 9:46
 */
public interface IpmaService {
    /*
    obter a previsao dos próximos 5 dia para a cidade city_id
     */
    @GET("forecast/meteorology/cities/daily/{city_id}.json")
    Call<IpmaCityForecast> getForecastForACity(@Path("city_id") int cityId);

    /*
        obter todas as cidades
     */
    @GET("distrits-islands.json")
    Call<IpmaCity> getCities();
}
