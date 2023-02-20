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
 * ObjectWorkspaceConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T01:15:48.730+08:00[Asia/Shanghai]")
public class ObjectWorkspaceConfig {
  public static final String SERIALIZED_NAME_REPO_ID = "repoId";
  @SerializedName(SERIALIZED_NAME_REPO_ID)
  private String repoId;

  public static final String SERIALIZED_NAME_REV_HASH = "revHash";
  @SerializedName(SERIALIZED_NAME_REV_HASH)
  private String revHash;

  public ObjectWorkspaceConfig() {
  }

  public ObjectWorkspaceConfig repoId(String repoId) {
    
    this.repoId = repoId;
    return this;
  }

   /**
   * Get repoId
   * @return repoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRepoId() {
    return repoId;
  }


  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }


  public ObjectWorkspaceConfig revHash(String revHash) {
    
    this.revHash = revHash;
    return this;
  }

   /**
   * Get revHash
   * @return revHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRevHash() {
    return revHash;
  }


  public void setRevHash(String revHash) {
    this.revHash = revHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectWorkspaceConfig objectWorkspaceConfig = (ObjectWorkspaceConfig) o;
    return Objects.equals(this.repoId, objectWorkspaceConfig.repoId) &&
        Objects.equals(this.revHash, objectWorkspaceConfig.revHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId, revHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWorkspaceConfig {\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    revHash: ").append(toIndentedString(revHash)).append("\n");
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
    openapiFields.add("repoId");
    openapiFields.add("revHash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjectWorkspaceConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjectWorkspaceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjectWorkspaceConfig is not found in the empty JSON string", ObjectWorkspaceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ObjectWorkspaceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObjectWorkspaceConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("repoId") != null && !jsonObj.get("repoId").isJsonNull()) && !jsonObj.get("repoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repoId").toString()));
      }
      if ((jsonObj.get("revHash") != null && !jsonObj.get("revHash").isJsonNull()) && !jsonObj.get("revHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revHash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjectWorkspaceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjectWorkspaceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjectWorkspaceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjectWorkspaceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjectWorkspaceConfig>() {
           @Override
           public void write(JsonWriter out, ObjectWorkspaceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjectWorkspaceConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjectWorkspaceConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjectWorkspaceConfig
  * @throws IOException if the JSON string is invalid with respect to ObjectWorkspaceConfig
  */
  public static ObjectWorkspaceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjectWorkspaceConfig.class);
  }

 /**
  * Convert an instance of ObjectWorkspaceConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

