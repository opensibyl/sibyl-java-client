/*
 * openapi for sibyl2 server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.opensibyl.client.model;

import com.github.opensibyl.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * CorePoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-21T22:55:15.478+08:00[Asia/Shanghai]")
public class CorePoint {
  public static final String SERIALIZED_NAME_COLUMN = "column";
  @SerializedName(SERIALIZED_NAME_COLUMN)
  private Integer column;

  public static final String SERIALIZED_NAME_ROW = "row";
  @SerializedName(SERIALIZED_NAME_ROW)
  private Integer row;

  public CorePoint() {
  }

  public CorePoint column(Integer column) {
    
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getColumn() {
    return column;
  }


  public void setColumn(Integer column) {
    this.column = column;
  }


  public CorePoint row(Integer row) {
    
    this.row = row;
    return this;
  }

   /**
   * NOTICE: INDEX, NOT REAL LINE NUMBER
   * @return row
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NOTICE: INDEX, NOT REAL LINE NUMBER")

  public Integer getRow() {
    return row;
  }


  public void setRow(Integer row) {
    this.row = row;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorePoint corePoint = (CorePoint) o;
    return Objects.equals(this.column, corePoint.column) &&
        Objects.equals(this.row, corePoint.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorePoint {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("column");
    openapiFields.add("row");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CorePoint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CorePoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CorePoint is not found in the empty JSON string", CorePoint.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CorePoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CorePoint` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CorePoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CorePoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CorePoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CorePoint.class));

       return (TypeAdapter<T>) new TypeAdapter<CorePoint>() {
           @Override
           public void write(JsonWriter out, CorePoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CorePoint read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CorePoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CorePoint
  * @throws IOException if the JSON string is invalid with respect to CorePoint
  */
  public static CorePoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CorePoint.class);
  }

 /**
  * Convert an instance of CorePoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

