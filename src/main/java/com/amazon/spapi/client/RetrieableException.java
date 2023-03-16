package com.amazon.spapi.client;

import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 可重试的异常
 *
 * @author: wangpeng
 * @date: 2023年3月16日 下午2:38:40
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RetrieableException extends ApiException {

    private static final long serialVersionUID = 1221436330056884849L;
    private static final int DEFAULT_CODE = 429;

    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

    public RetrieableException() {}

    public RetrieableException(Throwable throwable) {
        super(throwable);
    }

    public RetrieableException(String message) {
        super(message);
    }

    public RetrieableException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    public RetrieableException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, null, code, responseHeaders, responseBody);
    }

    public RetrieableException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    public static boolean isThisException(int code) {
        return DEFAULT_CODE == code;
    }
}
