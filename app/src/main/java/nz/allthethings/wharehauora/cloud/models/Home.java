package nz.allthethings.wharehauora.cloud.models;

//        package nz.wharehauora.cloud.models;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Home
 * <p/>
 * object
 */
public class Home {

    /**
     * the field description
     */
    @SerializedName("id")
    @Expose
    private Integer id;
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
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * the field description
     */
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    /**
     * the field description
     */
    @SerializedName("is_public")
    @Expose
    private Boolean isPublic = false;
    /**
     * the field description
     */
    @SerializedName("home_type_id")
    @Expose
    private Integer homeTypeId;
    /**
     * the field description
     */
    @SerializedName("rooms_count")
    @Expose
    private Integer roomsCount;
    /**
     * the field description
     */
    @SerializedName("sensors_count")
    @Expose
    private Integer sensorsCount;

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
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * the field description
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * the field description
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * the field description
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * the field description
     */
    public Integer getHomeTypeId() {
        return homeTypeId;
    }

    /**
     * the field description
     */
    public void setHomeTypeId(Integer homeTypeId) {
        this.homeTypeId = homeTypeId;
    }

    /**
     * the field description
     */
    public Integer getRoomsCount() {
        return roomsCount;
    }

    /**
     * the field description
     */
    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }

    /**
     * the field description
     */
    public Integer getSensorsCount() {
        return sensorsCount;
    }

    /**
     * the field description
     */
    public void setSensorsCount(Integer sensorsCount) {
        this.sensorsCount = sensorsCount;
    }

}
