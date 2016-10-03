package com.shiparoo.data.exception;

import android.accounts.NetworkErrorException;
import android.content.Context;

import com.shiparoo.data.R;

public class NoNetworkException extends NetworkErrorException {

    public NoNetworkException() {
        super();
    }

    public NoNetworkException(Context context) {
        super(context.getString(R.string.exception_no_network));
    }

    public NoNetworkException(String message) {
        super(message);
    }

    public NoNetworkException(Throwable cause) {
        super(cause);
    }

    public NoNetworkException(Context context, Throwable cause) {
        super(context.getString(R.string.exception_no_network), cause);
    }

    public NoNetworkException(String message, Throwable cause) {
        super(message, cause);
    }
}
