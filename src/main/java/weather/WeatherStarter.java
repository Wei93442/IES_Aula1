package weather;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.ipma_client.CityForecast;
import weather.ipma_client.IpmaCityForecast;
import weather.ipma_client.IpmaService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.logging.Logger;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

   // private static final int CITY_ID_AVEIRO = 1010500;
    private static int CITY_ID_AVEIRO = 1010500;
    /*
    loggers provide a better alternative to System.out.println
    https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
    private static final Logger logger = Logger.getLogger(WeatherStarter.class.getName());

    public static void  main(String[] args ) {

        /*
        get a retrofit instance, loaded with the GSon lib to convert JSON into objects
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("City ID : ");
        try{
            CITY_ID_AVEIRO = sc.nextInt();
            sc.close();
        }catch(Exception e){
            logger.info("Default city id is 1010500(Aveiro)");
        }
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            LocalDate localDate = LocalDate.now();
            localDate = localDate.minusDays(1);
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            if (forecast != null) {
                StringBuilder sb = new StringBuilder();

                sb.append("Owner: ")
                        .append(forecast.getOwner())
                        .append("\n")
                        .append("Country: ")
                        .append(forecast.getCountry())
                        .append("\n");

                for (CityForecast cf : forecast.getData()){
                    localDate = localDate.plusDays(1);
                    String dateTime = localDate.format(dateTimeFormatter);
                    sb.append(dateTime)
                            .append(" [max temp: ")
                            .append(cf.getTMax())
                            .append(", min temp: ")
                            .append(cf.getTMin())
                            .append(", precipitaProb: ")
                            .append(cf.getPrecipitaProb())
                            .append(", predWindDir: ")
                            .append(cf.getPredWindDir())
                            .append("]")
                            .append("\n");
                }
                logger.info(sb.toString());
            } else {
                logger.info( "No results!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}