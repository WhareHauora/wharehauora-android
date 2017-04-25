package nz.allthethings.wharehauora.cloud.models;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Reading
 * <p/>
 * object
 */
public class Reading {

    /**
     * the field description
     */
    @SerializedName("id")
    @Expose
    private Integer id;
    /**
     * the field description
     */
    @SerializedName("room_id")
    @Expose
    private Integer roomId;
    /**
     * the field description
     */
    @SerializedName("key")
    @Expose
    private String key;
    /**
     * the field description
     */
    @SerializedName("value")
    @Expose
    private Object value;
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
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * the field description
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * the field description
     */
    public String getKey() {
        return key;
    }

    /**
     * the field description
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * the field description
     */
    public Object getValue() {
        return value;
    }

    /**
     * the field description
     */
    public void setValue(Object value) {
        this.value = value;
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

}
