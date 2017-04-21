package nz.allthethings.wharehauora.cloud.models;

import java.util.Date;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Sensor
 * <p>
 * object
 *
 */
public class Sensor {

    /**
     * the field description
     *
     */
    @SerializedName("id")
    @Expose
    private Integer id;
    /**
     * the field description
     *
     */
    @SerializedName("room_id")
    @Expose
    private Integer roomId;
    /**
     * the field description
     *
     */
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    /**
     * the field description
     *
     */
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    /**
     * the field description
     *
     */
    @SerializedName("node_id")
    @Expose
    private Integer nodeId;
    /**
     * the field description
     *
     */
    @SerializedName("home_id")
    @Expose
    private Integer homeId;
    /**
     * the field description
     *
     */
    @SerializedName("messages_count")
    @Expose
    private Integer messagesCount;

    /**
     * the field description
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * the field description
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * the field description
     *
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * the field description
     *
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * the field description
     *
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * the field description
     *
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * the field description
     *
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * the field description
     *
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * the field description
     *
     */
    public Integer getNodeId() {
        return nodeId;
    }

    /**
     * the field description
     *
     */
    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * the field description
     *
     */
    public Integer getHomeId() {
        return homeId;
    }

    /**
     * the field description
     *
     */
    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    /**
     * the field description
     *
     */
    public Integer getMessagesCount() {
        return messagesCount;
    }

    /**
     * the field description
     *
     */
    public void setMessagesCount(Integer messagesCount) {
        this.messagesCount = messagesCount;
    }

}
