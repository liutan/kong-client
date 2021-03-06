/*
 * Copyright(c) 2020 taofen8.com. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License.
 */

package com.taofen8.mid.kong.caller.exception;

public class CallerException extends Exception {

  public CallerException(String message, Throwable cause) {
    super(message, cause);
  }

  public CallerException() {
    super();
  }

  public CallerException(String message) {
    super(message);
  }
}
