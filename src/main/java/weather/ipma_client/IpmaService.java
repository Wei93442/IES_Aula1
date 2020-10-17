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
    mandar um pedido HTTP GET
     */
    @GET("forecast/meteorology/cities/daily/{city_id}.json")
    Call<IpmaCityForecast> getForecastForACity(@Path("city_id") int cityId);
}
