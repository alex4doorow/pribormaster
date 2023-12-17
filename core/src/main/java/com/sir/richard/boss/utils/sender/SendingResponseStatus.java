package com.sir.richard.boss.utils.sender;

import lombok.Getter;
import lombok.Setter;

public abstract class SendingResponseStatus {

    @Getter
    @Setter
    private String recipient;
    @Getter
    @Setter
    private String messageText;
    @Getter
    @Setter
    private boolean sent;
    @Getter
    @Setter
    private boolean success;
    @Getter
    @Setter
    private String statusMessage;

    public SendingResponseStatus(boolean sent, boolean success, String recipient, String messageText, String statusMessage) {
        this.sent = sent;
        this.success = success;
        this.recipient = recipient;
        this.messageText = messageText;
        this.statusMessage = statusMessage;
    }

    protected abstract String getSenderName();

    public String getViewStatus() {
        if (isSent()) {
            if (isSuccess()) {
                return getSenderName() + ": отправлено, статус: успешно";
            } else {
                return getSenderName() + ": отправлено, статус: ошибка, message: (" + getStatusMessage() + ")";
            }
        } else {
            return getSenderName() + ": не отправлено";
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (sent ? 1231 : 1237);
        result = prime * result + (success ? 1231 : 1237);
        result = prime * result + ((statusMessage == null) ? 0 : statusMessage.hashCode());
        result = prime * result + ((recipient == null) ? 0 : recipient.hashCode());
        result = prime * result + ((messageText == null) ? 0 : messageText.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SendingResponseStatus other = (SendingResponseStatus) obj;
        if (sent != other.sent)
            return false;
        if (success != other.success)
            return false;
        if (statusMessage == null) {
            if (other.statusMessage != null)
                return false;
        } else if (!statusMessage.equals(other.statusMessage))
            return false;
        if (recipient == null) {
            if (other.recipient != null)
                return false;
        } else if (!recipient.equals(other.recipient))
            return false;
        if (messageText == null) {
            if (other.messageText != null)
                return false;
        } else if (!messageText.equals(other.messageText))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SendingResponseStatus [isSent=" + sent + ", isSuccess=" + success + ", recipient=" + recipient + ", messageText=" + messageText+ ", statusMessage=" + statusMessage + "]";
    }
}
