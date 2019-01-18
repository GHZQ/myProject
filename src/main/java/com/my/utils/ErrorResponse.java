package com.my.utils;

import java.util.Map;

public class ErrorResponse extends RestResponse {

    private static final long serialVersionUID = 1L;

    private String exceptionId;
    private String requestMethod;
    private String requestPath;
    private Map<String, String[]> parameterMap;
    private String requestBody;
    private StackTraceElement[] stackTrace;

    /**
     * @return the exceptionId
     */
    public String getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(String exceptionId) {
        this.exceptionId = exceptionId;
    }

    /**
     * @return the requestPath
     */
    public String getRequestPath() {
        return requestPath;
    }

    /**
     * @return the requestBody
     */
    public String getRequestBody() {
        return requestBody;
    }

    /**
     * @param requestPath the requestPath to set
     */
    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    /**
     * @param requestBody the requestBody to set
     */
    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    /**
     * @return the requestMethod
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * @param requestMethod the requestMethod to set
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ErrorResponse [exceptionId=" + exceptionId + ", requestPath=" + requestPath
                + ", requestMethod=" + requestMethod + ", requestBody=" + requestBody + "]";
    }

    public void setParameterMap(Map<String, String[]> parameterMap) {
        this.parameterMap = parameterMap;
    }

    /**
     * @return the parameterMap
     */
    public Map<String, String[]> getParameterMap() {
        return parameterMap;
    }

    /**
     * @return the stackTrace
     */
    public StackTraceElement[] getStackTrace() {
        return stackTrace;
    }

    /**
     * @param stackTrace the stackTrace to set
     */
    public void setStackTrace(StackTraceElement[] stackTrace) {
        this.stackTrace = stackTrace;
    }

}
