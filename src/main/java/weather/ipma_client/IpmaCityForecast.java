package weather.ipma_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IpmaCityForecast {
    @SerializedName("owner")
    @Expose
    private String owner;

    /*
        país
     */
    @SerializedName("country")
    @Expose
    private String country;

    /*
    dados diários
     */
    @SerializedName("data")
    @Expose
    private List<CityForecast> data = null;

    /*
    identificador do local
     */
    @SerializedName("globalIdLocal")
    @Expose
    private Integer globalIdLocal;

    /*
    data de atualização do ficheiro
     */
    @SerializedName("dataUpdate")
    @Expose
    private String dataUpdate;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CityForecast> getData() {
        return data;
    }

    public void setData(List<CityForecast> data) {
        this.data = data;
    }

    public Integer getGlobalIdLocal() {
        return globalIdLocal;
    }

    public void setGlobalIdLocal(Integer globalIdLocal) {
        this.globalIdLocal = globalIdLocal;
    }

    public String getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(String dataUpdate) {
        this.dataUpdate = dataUpdate;
    }
}
