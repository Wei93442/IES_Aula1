package weather.ipma_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Wei
 * @date 2020/10/8 9:45
 */
public class CityForecast {
    /*
     probabilidade da precipitação
     */
    @SerializedName("precipitaProb")
    @Expose
    private String precipitaProb;

    /*
     temperatura mínima diária
     */
    @SerializedName("tMin")
    @Expose
    private String tMin;

    /*
     temperatura máxima diária
     */
    @SerializedName("tMax")
    @Expose
    private String tMax;

    /*
     rumo predominante do vento (N, NE, E, SE, S, SW, W, NW)
     */
    @SerializedName("predWindDir")
    @Expose
    private String predWindDir;

    /*
    código relativo ao tipo de tempo
     */
    @SerializedName("idWeatherType")
    @Expose
    private Integer idWeatherType;

    /*
     classe da intensidade do vento
     */
    @SerializedName("classWindSpeed")
    @Expose
    private Integer classWindSpeed;

    /*
    longitude
     */
    @SerializedName("longitude")
    @Expose
    private String longitude;


    /*
    latitude
     */
    @SerializedName("latitude")
    @Expose
    private String latitude;

    /*
    data da previsão
     */
    @SerializedName("forecastDate")
    @Expose
    private String forecastDate;


    public String getPrecipitaProb() {
        return precipitaProb;
    }

    public void setPrecipitaProb(String precipitaProb) {
        this.precipitaProb = precipitaProb;
    }

    public String getTMin() {
        return tMin;
    }

    public void setTMin(String tMin) {
        this.tMin = tMin;
    }

    public String getTMax() {
        return tMax;
    }

    public void setTMax(String tMax) {
        this.tMax = tMax;
    }

    public String getPredWindDir() {
        return predWindDir;
    }

    public void setPredWindDir(String predWindDir) {
        this.predWindDir = predWindDir;
    }

    public Integer getIdWeatherType() {
        return idWeatherType;
    }

    public void setIdWeatherType(Integer idWeatherType) {
        this.idWeatherType = idWeatherType;
    }

    public Integer getClassWindSpeed() {
        return classWindSpeed;
    }

    public void setClassWindSpeed(Integer classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
