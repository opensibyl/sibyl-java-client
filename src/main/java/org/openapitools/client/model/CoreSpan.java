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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.CorePoint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CoreSpan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-08T21:47:09.319+08:00[Asia/Shanghai]")
public class CoreSpan {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private CorePoint end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private CorePoint start;

  public CoreSpan() {
  }

  public CoreSpan end(CorePoint end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CorePoint getEnd() {
    return end;
  }


  public void setEnd(CorePoint end) {
    this.end = end;
  }


  public CoreSpan start(CorePoint start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CorePoint getStart() {
    return start;
  }


  public void setStart(CorePoint start) {
    this.start = start;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreSpan coreSpan = (CoreSpan) o;
    return Objects.equals(this.end, coreSpan.end) &&
        Objects.equals(this.start, coreSpan.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreSpan {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
    openapiFields.add("end");
    openapiFields.add("start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CoreSpan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CoreSpan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreSpan is not found in the empty JSON string", CoreSpan.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CoreSpan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreSpan` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        CorePoint.validateJsonObject(jsonObj.getAsJsonObject("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        CorePoint.validateJsonObject(jsonObj.getAsJsonObject("start"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreSpan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreSpan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreSpan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreSpan.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreSpan>() {
           @Override
           public void write(JsonWriter out, CoreSpan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreSpan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreSpan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreSpan
  * @throws IOException if the JSON string is invalid with respect to CoreSpan
  */
  public static CoreSpan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreSpan.class);
  }

 /**
  * Convert an instance of CoreSpan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

