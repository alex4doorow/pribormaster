package com.sir.richard.boss.error;

import java.io.Serial;

public class CoreException extends Exception {

    @Serial
    private static final long serialVersionUID = -7090297228658157933L;

    public static final String INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final String EXT_SERVICE_ERROR = "EXT_SERVICE_ERROR";
    public static final String EXT_SERVICE_REJECT = "EXT_SERVICE_REJECT";
    public static final String CONVERSION_ERROR = "CONVERSION_ERROR";
    public static final String PARSE_ERROR = "PARSE_ERROR";
    public static final String JSON_PROCESSING_ERROR = "JSON_PROCESSING_ERROR";
    public static final String CONNECTION_ERROR = "CONNECTION_ERROR";
    public static final String CONFIG_ERROR = "CONFIG_ERROR";
    public static final String SEND_ERROR = "SEND_ERROR";
    public static final String DIR_DOES_NOT_EXIST = "DIR_DOES_NOT_EXIST";
    public static final String FAIL_TO_CREATE_FILE = "FAIL_TO_CREATE_FILE";
    public static final String LDAP_CONNECTION_FAILED = "LDAP_CONNECTION_FAILED";
    public static final String LDAP_PASSWORD_EXPIRED = "LDAP_PASSWORD_EXPIRED";
    public static final String LDAP_SEARCH_EXCEPTION = "LDAP_SEARCH_EXCEPTION";
    public static final String ERR_MSG_TYPE = "WRONG_MESSAGE_TYPE";
    public static final String ERR_NOT_IMPLEMENTED = "NOT_IMPLEMENTED";
    public static final String ERR_UNKNOWN_STEP = "ERR_UNKNOWN_STEP";

    //JPA errors
    public static final String RECORD_WITH_ID_ALREADY_EXISTS = "RECORD_ALREADY_EXISTS";
    public static final String RECORD_WITH_ID_NOT_FOUND = "RECORD_WITH_ID_NOT_FOUND";


    private boolean fatalException = false;
    private String respCode = null;
    private String respDesc = null;

    public CoreException(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
    }

    public CoreException(String respCode) {
        this.respCode = respCode;
    }

    public CoreException(String respCode, String respDesc, boolean fatalException) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.fatalException = fatalException;
    }

    public boolean isFatalException() {
        return fatalException;
    }

    public String getRespCode() {
        return respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    @Override
    public String toString() {
        return getRespCode() + ":" + getRespDesc();
    }

    @Override
    public String getMessage() {
        return toString();
    }
}