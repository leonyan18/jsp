package spittr;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {
    private final Long id;
    private final Date time;

    public Date getTime() {
        return time;
    }

    private final String message;
    private final Double latitude;
    private final Double longitude;

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Spittle(Date time, String message, Double latitude, Double longitude) {
        this.id = null;
        this.time = time;
        this.message = message;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public  Spittle(Date time, String message){
        this(time, message,null,null);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj,"id","time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }
}
