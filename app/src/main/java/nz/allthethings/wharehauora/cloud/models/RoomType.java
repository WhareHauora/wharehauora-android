package nz.allthethings.wharehauora.cloud.models;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Room type
 * <p>
 * object
 *
 */
public class RoomType {

    /**
     * the field description
     */
    @SerializedName("id")
    @Expose
    private Integer id;
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

}
