package com.shiparoo.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DataEntity {

    @SerializedName("id")
    @Expose
    private String  id;
    @SerializedName("title")
    @Expose
    private String  title;
    @SerializedName("description")
    @Expose
    private Object  description;
    @SerializedName("datetime")
    @Expose
    private Integer datetime;
    @SerializedName("cover")
    @Expose
    private String  cover;
    @SerializedName("account_url")
    @Expose
    private String  accountUrl;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("privacy")
    @Expose
    private String  privacy;
    @SerializedName("layout")
    @Expose
    private String  layout;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("link")
    @Expose
    private String  link;
    @SerializedName("ups")
    @Expose
    private Integer ups;
    @SerializedName("downs")
    @Expose
    private Integer downs;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("is_album")
    @Expose
    private Boolean isAlbum;
    @SerializedName("vote")
    @Expose
    private Object  vote;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("images_count")
    @Expose
    private Integer imagesCount;
    @SerializedName("images")
    @Expose
    private List<ImageEntity> images = new ArrayList<ImageEntity>();

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

    public DataEntity withId(String id) {
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

    public DataEntity withTitle(String title) {
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

    public DataEntity withDescription(Object description) {
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

    public DataEntity withDatetime(Integer datetime) {
        this.datetime = datetime;
        return this;
    }

    /**
     * @return The cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    public DataEntity withCover(String cover) {
        this.cover = cover;
        return this;
    }

    /**
     * @return The accountUrl
     */
    public String getAccountUrl() {
        return accountUrl;
    }

    /**
     * @param accountUrl The account_url
     */
    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public DataEntity withAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
        return this;
    }

    /**
     * @return The accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @param accountId The account_id
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public DataEntity withAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * @return The privacy
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * @param privacy The privacy
     */
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public DataEntity withPrivacy(String privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * @return The layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * @param layout The layout
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    public DataEntity withLayout(String layout) {
        this.layout = layout;
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

    public DataEntity withViews(Integer views) {
        this.views = views;
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

    public DataEntity withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * @return The ups
     */
    public Integer getUps() {
        return ups;
    }

    /**
     * @param ups The ups
     */
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public DataEntity withUps(Integer ups) {
        this.ups = ups;
        return this;
    }

    /**
     * @return The downs
     */
    public Integer getDowns() {
        return downs;
    }

    /**
     * @param downs The downs
     */
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public DataEntity withDowns(Integer downs) {
        this.downs = downs;
        return this;
    }

    /**
     * @return The points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * @param points The points
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    public DataEntity withPoints(Integer points) {
        this.points = points;
        return this;
    }

    /**
     * @return The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    public DataEntity withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * @return The isAlbum
     */
    public Boolean getIsAlbum() {
        return isAlbum;
    }

    /**
     * @param isAlbum The is_album
     */
    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

    public DataEntity withIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
        return this;
    }

    /**
     * @return The vote
     */
    public Object getVote() {
        return vote;
    }

    /**
     * @param vote The vote
     */
    public void setVote(Object vote) {
        this.vote = vote;
    }

    public DataEntity withVote(Object vote) {
        this.vote = vote;
        return this;
    }

    /**
     * @return The commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount The comment_count
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public DataEntity withCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    /**
     * @return The imagesCount
     */
    public Integer getImagesCount() {
        return imagesCount;
    }

    /**
     * @param imagesCount The images_count
     */
    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public DataEntity withImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
        return this;
    }

    /**
     * @return The images
     */
    public List<ImageEntity> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(List<ImageEntity> images) {
        this.images = images;
    }

    public DataEntity withImages(List<ImageEntity> images) {
        this.images = images;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(title).append(description).append(datetime).append(cover).append(accountUrl).append(accountId).append(privacy).append(layout).append(views).append(link).append(ups).append(downs).append(points).append(score).append(isAlbum).append(vote).append(commentCount).append(imagesCount).append(images).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataEntity) == false) {
            return false;
        }
        DataEntity rhs = ((DataEntity) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(description, rhs.description).append(datetime, rhs.datetime).append(cover, rhs.cover).append(accountUrl, rhs.accountUrl).append(accountId, rhs.accountId).append(privacy, rhs.privacy).append(layout, rhs.layout).append(views, rhs.views).append(link, rhs.link).append(ups, rhs.ups).append(downs, rhs.downs).append(points, rhs.points).append(score, rhs.score).append(isAlbum, rhs.isAlbum).append(vote, rhs.vote).append(commentCount, rhs.commentCount).append(imagesCount, rhs.imagesCount).append(images, rhs.images).isEquals();
    }

}
