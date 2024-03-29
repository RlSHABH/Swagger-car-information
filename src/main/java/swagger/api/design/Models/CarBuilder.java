package swagger.api.design.Models;

import io.swagger.annotations.ApiModelProperty;

public class CarBuilder {
  private Long id;
  private String name;
  private String description;
  private String score;
  private String thumbnailUrl;
  private String imageUrl;
  private String onRoadPrice;
  private String fuelType;

  public Long getId() {
    return id;
  }

  public CarBuilder setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public CarBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CarBuilder setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getScore() {
    return score;
  }

  public CarBuilder setScore(String score) {
    this.score = score;
    return this;
  }

  public String getOnRoadPrice() {
    return onRoadPrice;
  }

  public CarBuilder setOnRoadPrice(String onRoadPrice) {
    this.onRoadPrice = onRoadPrice;
    return this;
  }

  public String getFuelType() {
    return fuelType;
  }

  public CarBuilder setFuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public CarBuilder setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public CarBuilder setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public Car build() {
    return new Car(id, name, description, score, thumbnailUrl, imageUrl,onRoadPrice,fuelType);
  }
}

