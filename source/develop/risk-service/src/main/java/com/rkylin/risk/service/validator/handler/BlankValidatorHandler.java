package com.rkylin.risk.service.validator.handler;

import com.rkylin.risk.service.validator.core.ResultInfoProxy;

import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * Created by tomalloc on 16-4-14.
 */

public abstract class BlankValidatorHandler implements ValidatorHandler<String> {
  private String code;
  private String message;

  public BlankValidatorHandler(String code, String message) {
    this.code = code;
    this.message = message;
  }

  @Override
  public boolean handle(ResultInfoProxy proxy) {
    if (isBlank(validateObject())) {
      proxy.setResultCode(code);
      proxy.setResultMessage(message);
      return false;
    }
    return true;
  }
}
