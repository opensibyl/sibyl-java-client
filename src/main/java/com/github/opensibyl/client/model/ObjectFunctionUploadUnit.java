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
 * ObjectFunctionUploadUnit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T00:23:35.240+08:00[Asia/Shanghai]")
public class ObjectFunctionUploadUnit {
  public static final String SERIALIZED_NAME_FUNC_RESULT = "funcResult";
  @SerializedName(SERIALIZED_NAME_FUNC_RESULT)
  private ExtractorFunctionFileResult funcResult;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private ObjectWorkspaceConfig workspace;

  public ObjectFunctionUploadUnit() {
  }

  public ObjectFunctionUploadUnit funcResult(ExtractorFunctionFileResult funcResult) {
    
    this.funcResult = funcResult;
    return this;
  }

   /**
   * Get funcResult
   * @return funcResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtractorFunctionFileResult getFuncResult() {
    return funcResult;
  }


  public void setFuncResult(ExtractorFunctionFileResult funcResult) {
    this.funcResult = funcResult;
  }


  public ObjectFunctionUploadUnit workspace(ObjectWorkspaceConfig workspace) {
    
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjectWorkspaceConfig getWorkspace() {
    return workspace;
  }


  public void setWorkspace(ObjectWorkspaceConfig workspace) {
    this.workspace = workspace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectFunctionUploadUnit objectFunctionUploadUnit = (ObjectFunctionUploadUnit) o;
    return Objects.equals(this.funcResult, objectFunctionUploadUnit.funcResult) &&
        Objects.equals(this.workspace, objectFunctionUploadUnit.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funcResult, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectFunctionUploadUnit {\n");
    sb.append("    funcResult: ").append(toIndentedString(funcResult)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
    openapiFields.add("funcResult");
    openapiFields.add("workspace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjectFunctionUploadUnit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjectFunctionUploadUnit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjectFunctionUploadUnit is not found in the empty JSON string", ObjectFunctionUploadUnit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ObjectFunctionUploadUnit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObjectFunctionUploadUnit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `funcResult`
      if (jsonObj.get("funcResult") != null && !jsonObj.get("funcResult").isJsonNull()) {
        ExtractorFunctionFileResult.validateJsonObject(jsonObj.getAsJsonObject("funcResult"));
      }
      // validate the optional field `workspace`
      if (jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) {
        ObjectWorkspaceConfig.validateJsonObject(jsonObj.getAsJsonObject("workspace"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjectFunctionUploadUnit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjectFunctionUploadUnit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjectFunctionUploadUnit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjectFunctionUploadUnit.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjectFunctionUploadUnit>() {
           @Override
           public void write(JsonWriter out, ObjectFunctionUploadUnit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjectFunctionUploadUnit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjectFunctionUploadUnit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjectFunctionUploadUnit
  * @throws IOException if the JSON string is invalid with respect to ObjectFunctionUploadUnit
  */
  public static ObjectFunctionUploadUnit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjectFunctionUploadUnit.class);
  }

 /**
  * Convert an instance of ObjectFunctionUploadUnit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

