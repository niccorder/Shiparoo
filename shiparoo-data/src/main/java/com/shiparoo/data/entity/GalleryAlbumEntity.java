
package com.shiparoo.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class GalleryAlbumEntity {

    @SerializedName("data")
    @Expose
    private DataEntity data;
    @SerializedName("success")
    @Expose
    private Boolean    success;
    @SerializedName("status")
    @Expose
    private Integer    status;

    /**
     * 
     * @return
     *     The data
     */
    public DataEntity getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(DataEntity data) {
        this.data = data;
    }

    public GalleryAlbumEntity withData(DataEntity data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * @return
     *     The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 
     * @param success
     *     The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public GalleryAlbumEntity withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public GalleryAlbumEntity withStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).append(success).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GalleryAlbumEntity) == false) {
            return false;
        }
        GalleryAlbumEntity rhs = ((GalleryAlbumEntity) other);
        return new EqualsBuilder().append(data, rhs.data).append(success, rhs.success).append(status, rhs.status).isEquals();
    }

}
