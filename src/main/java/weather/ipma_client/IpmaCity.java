package weather.ipma_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Wei
 * @date 2020/10/17 21:36
 */
public class IpmaCity {
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
        cidades
     */
    @SerializedName("data")
    @Expose
    private List<City> data = null;

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

    public List<City> getData() {
        return data;
    }

    public void setData(List<City> data) {
        this.data = data;
    }
}
