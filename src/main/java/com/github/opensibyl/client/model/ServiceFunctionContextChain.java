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
 * ServiceFunctionContextChain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T01:15:48.730+08:00[Asia/Shanghai]")
public class ServiceFunctionContextChain {
  public static final String SERIALIZED_NAME_BODY_SPAN = "bodySpan";
  @SerializedName(SERIALIZED_NAME_BODY_SPAN)
  private CoreSpan bodySpan;

  public static final String SERIALIZED_NAME_CALL_CHAINS = "callChains";
  @SerializedName(SERIALIZED_NAME_CALL_CHAINS)
  private ServiceContextTree callChains;

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

  public static final String SERIALIZED_NAME_REVERSE_CALL_CHAINS = "reverseCallChains";
  @SerializedName(SERIALIZED_NAME_REVERSE_CALL_CHAINS)
  private ServiceContextTree reverseCallChains;

  public static final String SERIALIZED_NAME_REVERSE_CALLS = "reverseCalls";
  @SerializedName(SERIALIZED_NAME_REVERSE_CALLS)
  private List<String> reverseCalls = null;

  public static final String SERIALIZED_NAME_SPAN = "span";
  @SerializedName(SERIALIZED_NAME_SPAN)
  private CoreSpan span;

  public ServiceFunctionContextChain() {
  }

  public ServiceFunctionContextChain bodySpan(CoreSpan bodySpan) {
    
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


  public ServiceFunctionContextChain callChains(ServiceContextTree callChains) {
    
    this.callChains = callChains;
    return this;
  }

   /**
   * Get callChains
   * @return callChains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceContextTree getCallChains() {
    return callChains;
  }


  public void setCallChains(ServiceContextTree callChains) {
    this.callChains = callChains;
  }


  public ServiceFunctionContextChain calls(List<String> calls) {
    
    this.calls = calls;
    return this;
  }

  public ServiceFunctionContextChain addCallsItem(String callsItem) {
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


  public ServiceFunctionContextChain extras(Object extras) {
    
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


  public ServiceFunctionContextChain lang(String lang) {
    
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


  public ServiceFunctionContextChain name(String name) {
    
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


  public ServiceFunctionContextChain parameters(List<ObjectValueUnit> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public ServiceFunctionContextChain addParametersItem(ObjectValueUnit parametersItem) {
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


  public ServiceFunctionContextChain path(String path) {
    
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


  public ServiceFunctionContextChain receiver(String receiver) {
    
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


  public ServiceFunctionContextChain returns(List<ObjectValueUnit> returns) {
    
    this.returns = returns;
    return this;
  }

  public ServiceFunctionContextChain addReturnsItem(ObjectValueUnit returnsItem) {
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


  public ServiceFunctionContextChain reverseCallChains(ServiceContextTree reverseCallChains) {
    
    this.reverseCallChains = reverseCallChains;
    return this;
  }

   /**
   * Get reverseCallChains
   * @return reverseCallChains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceContextTree getReverseCallChains() {
    return reverseCallChains;
  }


  public void setReverseCallChains(ServiceContextTree reverseCallChains) {
    this.reverseCallChains = reverseCallChains;
  }


  public ServiceFunctionContextChain reverseCalls(List<String> reverseCalls) {
    
    this.reverseCalls = reverseCalls;
    return this;
  }

  public ServiceFunctionContextChain addReverseCallsItem(String reverseCallsItem) {
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


  public ServiceFunctionContextChain span(CoreSpan span) {
    
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
    ServiceFunctionContextChain serviceFunctionContextChain = (ServiceFunctionContextChain) o;
    return Objects.equals(this.bodySpan, serviceFunctionContextChain.bodySpan) &&
        Objects.equals(this.callChains, serviceFunctionContextChain.callChains) &&
        Objects.equals(this.calls, serviceFunctionContextChain.calls) &&
        Objects.equals(this.extras, serviceFunctionContextChain.extras) &&
        Objects.equals(this.lang, serviceFunctionContextChain.lang) &&
        Objects.equals(this.name, serviceFunctionContextChain.name) &&
        Objects.equals(this.parameters, serviceFunctionContextChain.parameters) &&
        Objects.equals(this.path, serviceFunctionContextChain.path) &&
        Objects.equals(this.receiver, serviceFunctionContextChain.receiver) &&
        Objects.equals(this.returns, serviceFunctionContextChain.returns) &&
        Objects.equals(this.reverseCallChains, serviceFunctionContextChain.reverseCallChains) &&
        Objects.equals(this.reverseCalls, serviceFunctionContextChain.reverseCalls) &&
        Objects.equals(this.span, serviceFunctionContextChain.span);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bodySpan, callChains, calls, extras, lang, name, parameters, path, receiver, returns, reverseCallChains, reverseCalls, span);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceFunctionContextChain {\n");
    sb.append("    bodySpan: ").append(toIndentedString(bodySpan)).append("\n");
    sb.append("    callChains: ").append(toIndentedString(callChains)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    reverseCallChains: ").append(toIndentedString(reverseCallChains)).append("\n");
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
    openapiFields.add("callChains");
    openapiFields.add("calls");
    openapiFields.add("extras");
    openapiFields.add("lang");
    openapiFields.add("name");
    openapiFields.add("parameters");
    openapiFields.add("path");
    openapiFields.add("receiver");
    openapiFields.add("returns");
    openapiFields.add("reverseCallChains");
    openapiFields.add("reverseCalls");
    openapiFields.add("span");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceFunctionContextChain
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceFunctionContextChain.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceFunctionContextChain is not found in the empty JSON string", ServiceFunctionContextChain.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceFunctionContextChain.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceFunctionContextChain` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `bodySpan`
      if (jsonObj.get("bodySpan") != null && !jsonObj.get("bodySpan").isJsonNull()) {
        CoreSpan.validateJsonObject(jsonObj.getAsJsonObject("bodySpan"));
      }
      // validate the optional field `callChains`
      if (jsonObj.get("callChains") != null && !jsonObj.get("callChains").isJsonNull()) {
        ServiceContextTree.validateJsonObject(jsonObj.getAsJsonObject("callChains"));
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
      // validate the optional field `reverseCallChains`
      if (jsonObj.get("reverseCallChains") != null && !jsonObj.get("reverseCallChains").isJsonNull()) {
        ServiceContextTree.validateJsonObject(jsonObj.getAsJsonObject("reverseCallChains"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reverseCalls") != null && !jsonObj.get("reverseCalls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reverseCalls` to be an array in the JSON string but got `%s`", jsonObj.get("reverseCalls").toString()));
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
       if (!ServiceFunctionContextChain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceFunctionContextChain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceFunctionContextChain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceFunctionContextChain.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceFunctionContextChain>() {
           @Override
           public void write(JsonWriter out, ServiceFunctionContextChain value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceFunctionContextChain read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceFunctionContextChain given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceFunctionContextChain
  * @throws IOException if the JSON string is invalid with respect to ServiceFunctionContextChain
  */
  public static ServiceFunctionContextChain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceFunctionContextChain.class);
  }

 /**
  * Convert an instance of ServiceFunctionContextChain to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

