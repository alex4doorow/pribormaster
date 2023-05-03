package com.sir.richard.boss.utils.sender;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MessageSendingStatus {

    final private List<SendingResponseStatus> sendingResponseStatuses = new ArrayList<>();

    public MessageSendingStatus() {

    }

    public void addSendingResult(SendingResponseStatus sendingResponseStatus) {
        sendingResponseStatuses.add(sendingResponseStatus);
    }

    public String getViewStatus() {
        // sms: отправлено, статус: успешно email: не отправлено
        // sms: отправлено, статус: успешно; email: не отправлено |

        String result = "";
        for (SendingResponseStatus sendingResponseStatus : sendingResponseStatuses) {
            result += " " + sendingResponseStatus.getViewStatus() + "; ";
        }
        if (StringUtils.isEmpty(result) || result.trim().equals(";  ;")) {
            return "не отправлялось";
        }
        result = result.substring(0, result.length() - 2).trim();
        return result;
    }

    public static MessageSendingStatus createEmpty() {
        return new MessageSendingStatus();
    }
}

