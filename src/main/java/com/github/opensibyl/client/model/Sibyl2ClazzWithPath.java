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
 * Sibyl2ClazzWithPath
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T00:23:35.240+08:00[Asia/Shanghai]")
public class Sibyl2ClazzWithPath {
  public static final String SERIALIZED_NAME_EXTRAS = "extras";
  @SerializedName(SERIALIZED_NAME_EXTRAS)
  private Object extras;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  private String module;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SPAN = "span";
  @SerializedName(SERIALIZED_NAME_SPAN)
  private CoreSpan span;

  public Sibyl2ClazzWithPath() {
  }

  public Sibyl2ClazzWithPath extras(Object extras) {
    
    this.extras = extras;
    return this;
  }

   /**
   * which contains language-specific contents
   * @return extras
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "which contains language-specific contents")

  public Object getExtras() {
    return extras;
  }


  public void setExtras(Object extras) {
    this.extras = extras;
  }


  public Sibyl2ClazzWithPath lang(String lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * language
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "language")

  public String getLang() {
    return lang;
  }


  public void setLang(String lang) {
    this.lang = lang;
  }


  public Sibyl2ClazzWithPath module(String module) {
    
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModule() {
    return module;
  }


  public void setModule(String module) {
    this.module = module;
  }


  public Sibyl2ClazzWithPath name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Sibyl2ClazzWithPath path(String path) {
    
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


  public Sibyl2ClazzWithPath span(CoreSpan span) {
    
    this.span = span;
    return this;
  }

   /**
   * Get span
   * @return span
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CoreSpan getSpan() {
    return span;
  }


  public void setSpan(CoreSpan span) {
    this.span = span;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sibyl2ClazzWithPath sibyl2ClazzWithPath = (Sibyl2ClazzWithPath) o;
    return Objects.equals(this.extras, sibyl2ClazzWithPath.extras) &&
        Objects.equals(this.lang, sibyl2ClazzWithPath.lang) &&
        Objects.equals(this.module, sibyl2ClazzWithPath.module) &&
        Objects.equals(this.name, sibyl2ClazzWithPath.name) &&
        Objects.equals(this.path, sibyl2ClazzWithPath.path) &&
        Objects.equals(this.span, sibyl2ClazzWithPath.span);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extras, lang, module, name, path, span);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sibyl2ClazzWithPath {\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    span: ").append(toIndentedString(span)).append("\n");
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
    openapiFields.add("extras");
    openapiFields.add("lang");
    openapiFields.add("module");
    openapiFields.add("name");
    openapiFields.add("path");
    openapiFields.add("span");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Sibyl2ClazzWithPath
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Sibyl2ClazzWithPath.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Sibyl2ClazzWithPath is not found in the empty JSON string", Sibyl2ClazzWithPath.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Sibyl2ClazzWithPath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Sibyl2ClazzWithPath` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("module") != null && !jsonObj.get("module").isJsonNull()) && !jsonObj.get("module").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      // validate the optional field `span`
      if (jsonObj.get("span") != null && !jsonObj.get("span").isJsonNull()) {
        CoreSpan.validateJsonObject(jsonObj.getAsJsonObject("span"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Sibyl2ClazzWithPath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Sibyl2ClazzWithPath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Sibyl2ClazzWithPath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Sibyl2ClazzWithPath.class));

       return (TypeAdapter<T>) new TypeAdapter<Sibyl2ClazzWithPath>() {
           @Override
           public void write(JsonWriter out, Sibyl2ClazzWithPath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Sibyl2ClazzWithPath read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Sibyl2ClazzWithPath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Sibyl2ClazzWithPath
  * @throws IOException if the JSON string is invalid with respect to Sibyl2ClazzWithPath
  */
  public static Sibyl2ClazzWithPath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Sibyl2ClazzWithPath.class);
  }

 /**
  * Convert an instance of Sibyl2ClazzWithPath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

