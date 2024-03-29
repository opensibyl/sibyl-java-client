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
import java.util.*;
import java.util.Map.Entry;

/**
 * ExtractorFunctionFileResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T00:23:19.552+08:00[Asia/Shanghai]")
public class ExtractorFunctionFileResult {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private List<ExtractorFunction> units = null;

  public ExtractorFunctionFileResult() {
  }

  public ExtractorFunctionFileResult language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "language")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ExtractorFunctionFileResult path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ExtractorFunctionFileResult type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ExtractorFunctionFileResult units(List<ExtractorFunction> units) {
    
    this.units = units;
    return this;
  }

  public ExtractorFunctionFileResult addUnitsItem(ExtractorFunction unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExtractorFunction> getUnits() {
    return units;
  }


  public void setUnits(List<ExtractorFunction> units) {
    this.units = units;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractorFunctionFileResult extractorFunctionFileResult = (ExtractorFunctionFileResult) o;
    return Objects.equals(this.language, extractorFunctionFileResult.language) &&
        Objects.equals(this.path, extractorFunctionFileResult.path) &&
        Objects.equals(this.type, extractorFunctionFileResult.type) &&
        Objects.equals(this.units, extractorFunctionFileResult.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, path, type, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractorFunctionFileResult {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("path");
    openapiFields.add("type");
    openapiFields.add("units");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtractorFunctionFileResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExtractorFunctionFileResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtractorFunctionFileResult is not found in the empty JSON string", ExtractorFunctionFileResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExtractorFunctionFileResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtractorFunctionFileResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) {
        JsonArray jsonArrayunits = jsonObj.getAsJsonArray("units");
        if (jsonArrayunits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("units").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `units` to be an array in the JSON string but got `%s`", jsonObj.get("units").toString()));
          }

          // validate the optional field `units` (array)
          for (int i = 0; i < jsonArrayunits.size(); i++) {
            ExtractorFunction.validateJsonObject(jsonArrayunits.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtractorFunctionFileResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtractorFunctionFileResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtractorFunctionFileResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtractorFunctionFileResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtractorFunctionFileResult>() {
           @Override
           public void write(JsonWriter out, ExtractorFunctionFileResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtractorFunctionFileResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtractorFunctionFileResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtractorFunctionFileResult
  * @throws IOException if the JSON string is invalid with respect to ExtractorFunctionFileResult
  */
  public static ExtractorFunctionFileResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtractorFunctionFileResult.class);
  }

 /**
  * Convert an instance of ExtractorFunctionFileResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

