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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CoreSpan;
import org.openapitools.client.model.ObjectValueUnit;
import org.openapitools.client.model.Sibyl2FunctionWithPath;

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
 * Sibyl2FunctionContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-19T20:15:45.689+08:00[Asia/Shanghai]")
public class Sibyl2FunctionContext {
  public static final String SERIALIZED_NAME_BODY_SPAN = "bodySpan";
  @SerializedName(SERIALIZED_NAME_BODY_SPAN)
  private CoreSpan bodySpan;

  public static final String SERIALIZED_NAME_CALLS = "calls";
  @SerializedName(SERIALIZED_NAME_CALLS)
  private List<Sibyl2FunctionWithPath> calls = null;

  public static final String SERIALIZED_NAME_EXTRAS = "extras";
  @SerializedName(SERIALIZED_NAME_EXTRAS)
  private Object extras;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ObjectValueUnit> parameters = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private String receiver;

  public static final String SERIALIZED_NAME_RETURNS = "returns";
  @SerializedName(SERIALIZED_NAME_RETURNS)
  private List<ObjectValueUnit> returns = null;

  public static final String SERIALIZED_NAME_REVERSE_CALLS = "reverseCalls";
  @SerializedName(SERIALIZED_NAME_REVERSE_CALLS)
  private List<Sibyl2FunctionWithPath> reverseCalls = null;

  public static final String SERIALIZED_NAME_SPAN = "span";
  @SerializedName(SERIALIZED_NAME_SPAN)
  private CoreSpan span;

  public Sibyl2FunctionContext() {
  }

  public Sibyl2FunctionContext bodySpan(CoreSpan bodySpan) {
    
    this.bodySpan = bodySpan;
    return this;
  }

   /**
   * Get bodySpan
   * @return bodySpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CoreSpan getBodySpan() {
    return bodySpan;
  }


  public void setBodySpan(CoreSpan bodySpan) {
    this.bodySpan = bodySpan;
  }


  public Sibyl2FunctionContext calls(List<Sibyl2FunctionWithPath> calls) {
    
    this.calls = calls;
    return this;
  }

  public Sibyl2FunctionContext addCallsItem(Sibyl2FunctionWithPath callsItem) {
    if (this.calls == null) {
      this.calls = new ArrayList<>();
    }
    this.calls.add(callsItem);
    return this;
  }

   /**
   * Get calls
   * @return calls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Sibyl2FunctionWithPath> getCalls() {
    return calls;
  }


  public void setCalls(List<Sibyl2FunctionWithPath> calls) {
    this.calls = calls;
  }


  public Sibyl2FunctionContext extras(Object extras) {
    
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


  public Sibyl2FunctionContext lang(String lang) {
    
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


  public Sibyl2FunctionContext name(String name) {
    
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


  public Sibyl2FunctionContext parameters(List<ObjectValueUnit> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Sibyl2FunctionContext addParametersItem(ObjectValueUnit parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjectValueUnit> getParameters() {
    return parameters;
  }


  public void setParameters(List<ObjectValueUnit> parameters) {
    this.parameters = parameters;
  }


  public Sibyl2FunctionContext path(String path) {
    
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


  public Sibyl2FunctionContext receiver(String receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReceiver() {
    return receiver;
  }


  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public Sibyl2FunctionContext returns(List<ObjectValueUnit> returns) {
    
    this.returns = returns;
    return this;
  }

  public Sibyl2FunctionContext addReturnsItem(ObjectValueUnit returnsItem) {
    if (this.returns == null) {
      this.returns = new ArrayList<>();
    }
    this.returns.add(returnsItem);
    return this;
  }

   /**
   * Get returns
   * @return returns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjectValueUnit> getReturns() {
    return returns;
  }


  public void setReturns(List<ObjectValueUnit> returns) {
    this.returns = returns;
  }


  public Sibyl2FunctionContext reverseCalls(List<Sibyl2FunctionWithPath> reverseCalls) {
    
    this.reverseCalls = reverseCalls;
    return this;
  }

  public Sibyl2FunctionContext addReverseCallsItem(Sibyl2FunctionWithPath reverseCallsItem) {
    if (this.reverseCalls == null) {
      this.reverseCalls = new ArrayList<>();
    }
    this.reverseCalls.add(reverseCallsItem);
    return this;
  }

   /**
   * Get reverseCalls
   * @return reverseCalls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Sibyl2FunctionWithPath> getReverseCalls() {
    return reverseCalls;
  }


  public void setReverseCalls(List<Sibyl2FunctionWithPath> reverseCalls) {
    this.reverseCalls = reverseCalls;
  }


  public Sibyl2FunctionContext span(CoreSpan span) {
    
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
    Sibyl2FunctionContext sibyl2FunctionContext = (Sibyl2FunctionContext) o;
    return Objects.equals(this.bodySpan, sibyl2FunctionContext.bodySpan) &&
        Objects.equals(this.calls, sibyl2FunctionContext.calls) &&
        Objects.equals(this.extras, sibyl2FunctionContext.extras) &&
        Objects.equals(this.lang, sibyl2FunctionContext.lang) &&
        Objects.equals(this.name, sibyl2FunctionContext.name) &&
        Objects.equals(this.parameters, sibyl2FunctionContext.parameters) &&
        Objects.equals(this.path, sibyl2FunctionContext.path) &&
        Objects.equals(this.receiver, sibyl2FunctionContext.receiver) &&
        Objects.equals(this.returns, sibyl2FunctionContext.returns) &&
        Objects.equals(this.reverseCalls, sibyl2FunctionContext.reverseCalls) &&
        Objects.equals(this.span, sibyl2FunctionContext.span);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bodySpan, calls, extras, lang, name, parameters, path, receiver, returns, reverseCalls, span);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sibyl2FunctionContext {\n");
    sb.append("    bodySpan: ").append(toIndentedString(bodySpan)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    reverseCalls: ").append(toIndentedString(reverseCalls)).append("\n");
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
    openapiFields.add("bodySpan");
    openapiFields.add("calls");
    openapiFields.add("extras");
    openapiFields.add("lang");
    openapiFields.add("name");
    openapiFields.add("parameters");
    openapiFields.add("path");
    openapiFields.add("receiver");
    openapiFields.add("returns");
    openapiFields.add("reverseCalls");
    openapiFields.add("span");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Sibyl2FunctionContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Sibyl2FunctionContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Sibyl2FunctionContext is not found in the empty JSON string", Sibyl2FunctionContext.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Sibyl2FunctionContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Sibyl2FunctionContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `bodySpan`
      if (jsonObj.get("bodySpan") != null && !jsonObj.get("bodySpan").isJsonNull()) {
        CoreSpan.validateJsonObject(jsonObj.getAsJsonObject("bodySpan"));
      }
      if (jsonObj.get("calls") != null && !jsonObj.get("calls").isJsonNull()) {
        JsonArray jsonArraycalls = jsonObj.getAsJsonArray("calls");
        if (jsonArraycalls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("calls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `calls` to be an array in the JSON string but got `%s`", jsonObj.get("calls").toString()));
          }

          // validate the optional field `calls` (array)
          for (int i = 0; i < jsonArraycalls.size(); i++) {
            Sibyl2FunctionWithPath.validateJsonObject(jsonArraycalls.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            ObjectValueUnit.validateJsonObject(jsonArrayparameters.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) && !jsonObj.get("receiver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver").toString()));
      }
      if (jsonObj.get("returns") != null && !jsonObj.get("returns").isJsonNull()) {
        JsonArray jsonArrayreturns = jsonObj.getAsJsonArray("returns");
        if (jsonArrayreturns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("returns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `returns` to be an array in the JSON string but got `%s`", jsonObj.get("returns").toString()));
          }

          // validate the optional field `returns` (array)
          for (int i = 0; i < jsonArrayreturns.size(); i++) {
            ObjectValueUnit.validateJsonObject(jsonArrayreturns.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("reverseCalls") != null && !jsonObj.get("reverseCalls").isJsonNull()) {
        JsonArray jsonArrayreverseCalls = jsonObj.getAsJsonArray("reverseCalls");
        if (jsonArrayreverseCalls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reverseCalls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reverseCalls` to be an array in the JSON string but got `%s`", jsonObj.get("reverseCalls").toString()));
          }

          // validate the optional field `reverseCalls` (array)
          for (int i = 0; i < jsonArrayreverseCalls.size(); i++) {
            Sibyl2FunctionWithPath.validateJsonObject(jsonArrayreverseCalls.get(i).getAsJsonObject());
          };
        }
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
       if (!Sibyl2FunctionContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Sibyl2FunctionContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Sibyl2FunctionContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Sibyl2FunctionContext.class));

       return (TypeAdapter<T>) new TypeAdapter<Sibyl2FunctionContext>() {
           @Override
           public void write(JsonWriter out, Sibyl2FunctionContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Sibyl2FunctionContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Sibyl2FunctionContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Sibyl2FunctionContext
  * @throws IOException if the JSON string is invalid with respect to Sibyl2FunctionContext
  */
  public static Sibyl2FunctionContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Sibyl2FunctionContext.class);
  }

 /**
  * Convert an instance of Sibyl2FunctionContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

