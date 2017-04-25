package nz.allthethings.wharehauora.cloud.models;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Room
 * <p/>
 * object
 */
public class Room {

    /**
     * the field description
     */
    @SerializedName("id")
    @Expose
    private Integer id;
    /**
     * the field description
     */
    @SerializedName("home_id")
    @Expose
    private Integer homeId;
    /**
     * the field description
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * the field description
     */
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    /**
     * the field description
     */
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    /**
     * the field description
     */
    @SerializedName("room_type_id")
    @Expose
    private Integer roomTypeId;
    /**
     * the field description
     */
    @SerializedName("readings_count")
    @Expose
    private Integer readingsCount;

    /**
     * the field description
     */
    public Integer getId() {
        return id;
    }

    /**
     * the field description
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * the field description
     */
    public Integer getHomeId() {
        return homeId;
    }

    /**
     * the field description
     */
    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    /**
     * the field description
     */
    public String getName() {
        return name;
    }

    /**
     * the field description
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * the field description
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * the field description
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * the field description
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * the field description
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * the field description
     */
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * the field description
     */
    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    /**
     * the field description
     */
    public Integer getReadingsCount() {
        return readingsCount;
    }

    /**
     * the field description
     */
    public void setReadingsCount(Integer readingsCount) {
        this.readingsCount = readingsCount;
    }

}
