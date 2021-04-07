// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PackageDescriptionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * PackageDescriptionResourceCollection
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageDescriptionResourceCollection {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PackageDescriptionResource> items = null;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "ItemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE) private Integer itemsPerPage;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "ItemType";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE) private String itemType;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LAST_PAGE_NUMBER =
      "LastPageNumber";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE_NUMBER)
  private Integer lastPageNumber;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "NumberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;

  public static final String SERIALIZED_NAME_TOTAL_RESULTS = "TotalResults";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULTS) private Integer totalResults;

  public PackageDescriptionResourceCollection id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public PackageDescriptionResourceCollection
  items(List<PackageDescriptionResource> items) {

    this.items = items;
    return this;
  }

  public PackageDescriptionResourceCollection
  addItemsItem(PackageDescriptionResource itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PackageDescriptionResource>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PackageDescriptionResource> getItems() {
    return items;
  }

  public void setItems(List<PackageDescriptionResource> items) {
    this.items = items;
  }

  public PackageDescriptionResourceCollection
  itemsPerPage(Integer itemsPerPage) {

    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * Get itemsPerPage
   * @return itemsPerPage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  /**
   * Get itemType
   * @return itemType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemType() {
    return itemType;
  }

  public PackageDescriptionResourceCollection
  lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public PackageDescriptionResourceCollection
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn
   * @return lastModifiedOn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  /**
   * Get lastPageNumber
   * @return lastPageNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastPageNumber() {
    return lastPageNumber;
  }

  public PackageDescriptionResourceCollection links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public PackageDescriptionResourceCollection putLinksItem(String key,
                                                           String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) { this.links = links; }

  /**
   * Get numberOfPages
   * @return numberOfPages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfPages() {
    return numberOfPages;
  }

  public PackageDescriptionResourceCollection
  totalResults(Integer totalResults) {

    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
   * @return totalResults
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDescriptionResourceCollection packageDescriptionResourceCollection =
        (PackageDescriptionResourceCollection)o;
    return Objects.equals(this.id, packageDescriptionResourceCollection.id) &&
        Objects.equals(this.items,
                       packageDescriptionResourceCollection.items) &&
        Objects.equals(this.itemsPerPage,
                       packageDescriptionResourceCollection.itemsPerPage) &&
        Objects.equals(this.itemType,
                       packageDescriptionResourceCollection.itemType) &&
        Objects.equals(this.lastModifiedBy,
                       packageDescriptionResourceCollection.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       packageDescriptionResourceCollection.lastModifiedOn) &&
        Objects.equals(this.lastPageNumber,
                       packageDescriptionResourceCollection.lastPageNumber) &&
        Objects.equals(this.links,
                       packageDescriptionResourceCollection.links) &&
        Objects.equals(this.numberOfPages,
                       packageDescriptionResourceCollection.numberOfPages) &&
        Objects.equals(this.totalResults,
                       packageDescriptionResourceCollection.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, itemsPerPage, itemType, lastModifiedBy,
                        lastModifiedOn, lastPageNumber, links, numberOfPages,
                        totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDescriptionResourceCollection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemsPerPage: ")
        .append(toIndentedString(itemsPerPage))
        .append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    lastPageNumber: ")
        .append(toIndentedString(lastPageNumber))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    numberOfPages: ")
        .append(toIndentedString(numberOfPages))
        .append("\n");
    sb.append("    totalResults: ")
        .append(toIndentedString(totalResults))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
