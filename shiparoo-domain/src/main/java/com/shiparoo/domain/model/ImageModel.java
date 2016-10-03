package com.shiparoo.domain.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ImageModel {


    private String  id;
    private String  title;
    private String  description;
    private Integer datetime;
    private String  type;
    private Boolean animated;
    private Integer width;
    private Integer height;
    private Integer size;
    private Integer views;
    private Integer bandwidth;
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

    public ImageModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public ImageModel withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public ImageModel withDescription(String description) {
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

    public ImageModel withDatetime(Integer datetime) {
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

    public ImageModel withType(String type) {
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

    public ImageModel withAnimated(Boolean animated) {
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

    public ImageModel withWidth(Integer width) {
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

    public ImageModel withHeight(Integer height) {
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

    public ImageModel withSize(Integer size) {
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

    public ImageModel withViews(Integer views) {
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

    public ImageModel withBandwidth(Integer bandwidth) {
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

    public ImageModel withLink(String link) {
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
        if ((other instanceof ImageModel) == false) {
            return false;
        }
        ImageModel rhs = ((ImageModel) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(description, rhs.description).append(datetime, rhs.datetime).append(type, rhs.type).append(animated, rhs.animated).append(width, rhs.width).append(height, rhs.height).append(size, rhs.size).append(views, rhs.views).append(bandwidth, rhs.bandwidth).append(link, rhs.link).isEquals();
    }

}
