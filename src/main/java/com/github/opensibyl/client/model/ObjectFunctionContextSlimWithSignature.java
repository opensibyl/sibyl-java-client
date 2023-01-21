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
 * ObjectFunctionContextSlimWithSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-21T14:26:37.858+08:00[Asia/Shanghai]")
public class ObjectFunctionContextSlimWithSignature {
  public static final String SERIALIZED_NAME_BODY_SPAN = "bodySpan";
  @SerializedName(SERIALIZED_NAME_BODY_SPAN)
  private CoreSpan bodySpan;

  public static final String SERIALIZED_NAME_CALLS = "calls";
  @SerializedName(SERIALIZED_NAME_CALLS)
  private List<String> calls = null;

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
  private List<String> reverseCalls = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_SPAN = "span";
  @SerializedName(SERIALIZED_NAME_SPAN)
  private CoreSpan span;

  public ObjectFunctionContextSlimWithSignature() {
  }

  public ObjectFunctionContextSlimWithSignature bodySpan(CoreSpan bodySpan) {
    
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


  public ObjectFunctionContextSlimWithSignature calls(List<String> calls) {
    
    this.calls = calls;
    return this;
  }

  public ObjectFunctionContextSlimWithSignature addCallsItem(String callsItem) {
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

  public List<String> getCalls() {
    return calls;
  }


  public void setCalls(List<String> calls) {
    this.calls = calls;
  }


  public ObjectFunctionContextSlimWithSignature extras(Object extras) {
    
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


  public ObjectFunctionContextSlimWithSignature lang(String lang) {
    
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


  public ObjectFunctionContextSlimWithSignature name(String name) {
    
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


  public ObjectFunctionContextSlimWithSignature parameters(List<ObjectValueUnit> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public ObjectFunctionContextSlimWithSignature addParametersItem(ObjectValueUnit parametersItem) {
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


  public ObjectFunctionContextSlimWithSignature path(String path) {
    
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


  public ObjectFunctionContextSlimWithSignature receiver(String receiver) {
    
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


  public ObjectFunctionContextSlimWithSignature returns(List<ObjectValueUnit> returns) {
    
    this.returns = returns;
    return this;
  }

  public ObjectFunctionContextSlimWithSignature addReturnsItem(ObjectValueUnit returnsItem) {
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


  public ObjectFunctionContextSlimWithSignature reverseCalls(List<String> reverseCalls) {
    
    this.reverseCalls = reverseCalls;
    return this;
  }

  public ObjectFunctionContextSlimWithSignature addReverseCallsItem(String reverseCallsItem) {
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

  public List<String> getReverseCalls() {
    return reverseCalls;
  }


  public void setReverseCalls(List<String> reverseCalls) {
    this.reverseCalls = reverseCalls;
  }


  public ObjectFunctionContextSlimWithSignature signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public ObjectFunctionContextSlimWithSignature span(CoreSpan span) {
    
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
    ObjectFunctionContextSlimWithSignature objectFunctionContextSlimWithSignature = (ObjectFunctionContextSlimWithSignature) o;
    return Objects.equals(this.bodySpan, objectFunctionContextSlimWithSignature.bodySpan) &&
        Objects.equals(this.calls, objectFunctionContextSlimWithSignature.calls) &&
        Objects.equals(this.extras, objectFunctionContextSlimWithSignature.extras) &&
        Objects.equals(this.lang, objectFunctionContextSlimWithSignature.lang) &&
        Objects.equals(this.name, objectFunctionContextSlimWithSignature.name) &&
        Objects.equals(this.parameters, objectFunctionContextSlimWithSignature.parameters) &&
        Objects.equals(this.path, objectFunctionContextSlimWithSignature.path) &&
        Objects.equals(this.receiver, objectFunctionContextSlimWithSignature.receiver) &&
        Objects.equals(this.returns, objectFunctionContextSlimWithSignature.returns) &&
        Objects.equals(this.reverseCalls, objectFunctionContextSlimWithSignature.reverseCalls) &&
        Objects.equals(this.signature, objectFunctionContextSlimWithSignature.signature) &&
        Objects.equals(this.span, objectFunctionContextSlimWithSignature.span);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bodySpan, calls, extras, lang, name, parameters, path, receiver, returns, reverseCalls, signature, span);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectFunctionContextSlimWithSignature {\n");
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
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("signature");
    openapiFields.add("span");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjectFunctionContextSlimWithSignature
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjectFunctionContextSlimWithSignature.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjectFunctionContextSlimWithSignature is not found in the empty JSON string", ObjectFunctionContextSlimWithSignature.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ObjectFunctionContextSlimWithSignature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObjectFunctionContextSlimWithSignature` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `bodySpan`
      if (jsonObj.get("bodySpan") != null && !jsonObj.get("bodySpan").isJsonNull()) {
        CoreSpan.validateJsonObject(jsonObj.getAsJsonObject("bodySpan"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("calls") != null && !jsonObj.get("calls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `calls` to be an array in the JSON string but got `%s`", jsonObj.get("calls").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("reverseCalls") != null && !jsonObj.get("reverseCalls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reverseCalls` to be an array in the JSON string but got `%s`", jsonObj.get("reverseCalls").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
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
       if (!ObjectFunctionContextSlimWithSignature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjectFunctionContextSlimWithSignature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjectFunctionContextSlimWithSignature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjectFunctionContextSlimWithSignature.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjectFunctionContextSlimWithSignature>() {
           @Override
           public void write(JsonWriter out, ObjectFunctionContextSlimWithSignature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjectFunctionContextSlimWithSignature read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjectFunctionContextSlimWithSignature given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjectFunctionContextSlimWithSignature
  * @throws IOException if the JSON string is invalid with respect to ObjectFunctionContextSlimWithSignature
  */
  public static ObjectFunctionContextSlimWithSignature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjectFunctionContextSlimWithSignature.class);
  }

 /**
  * Convert an instance of ObjectFunctionContextSlimWithSignature to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

