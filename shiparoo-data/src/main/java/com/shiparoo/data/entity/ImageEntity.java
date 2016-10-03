package com.shiparoo.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ImageEntity {

    @SerializedName("id")
    @Expose
    private String  id;
    @SerializedName("title")
    @Expose
    private Object  title;
    @SerializedName("description")
    @Expose
    private Object  description;
    @SerializedName("datetime")
    @Expose
    private Integer datetime;
    @SerializedName("type")
    @Expose
    private String  type;
    @SerializedName("animated")
    @Expose
    private Boolean animated;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("bandwidth")
    @Expose
    private Integer bandwidth;
    @SerializedName("link")
    @Expose
    private String  link;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public ImageEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return The title
     */
    public Object getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(Object title) {
        this.title = title;
    }

    public ImageEntity withTitle(Object title) {
        this.title = title;
        return this;
    }

    /**
     * @return The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    public ImageEntity withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * @return The datetime
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * @param datetime The datetime
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public ImageEntity withDatetime(Integer datetime) {
        this.datetime = datetime;
        return this;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public ImageEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * @return The animated
     */
    public Boolean getAnimated() {
        return animated;
    }

    /**
     * @param animated The animated
     */
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public ImageEntity withAnimated(Boolean animated) {
        this.animated = animated;
        return this;
    }

    /**
     * @return The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @param width The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    public ImageEntity withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * @return The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    public ImageEntity withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * @return The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    public ImageEntity withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * @return The views
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views The views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    public ImageEntity withViews(Integer views) {
        this.views = views;
        return this;
    }

    /**
     * @return The bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * @param bandwidth The bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ImageEntity withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    public ImageEntity withLink(String link) {
        this.link = link;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(title).append(description).append(datetime).append(type).append(animated).append(width).append(height).append(size).append(views).append(bandwidth).append(link).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageEntity) == false) {
            return false;
        }
        ImageEntity rhs = ((ImageEntity) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(description, rhs.description).append(datetime, rhs.datetime).append(type, rhs.type).append(animated, rhs.animated).append(width, rhs.width).append(height, rhs.height).append(size, rhs.size).append(views, rhs.views).append(bandwidth, rhs.bandwidth).append(link, rhs.link).isEquals();
    }

}
