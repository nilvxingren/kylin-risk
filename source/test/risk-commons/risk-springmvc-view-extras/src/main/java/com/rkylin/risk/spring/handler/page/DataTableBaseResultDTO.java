package com.rkylin.risk.spring.handler.page;

import lombok.Getter;
import lombok.Setter;

/**
 * @company: rkylin
 * @author: tongzhuyu
 * @since: 2015/9/7
 * version: 1.0
 */
@Setter
@Getter
public class DataTableBaseResultDTO {
    private Object data;
    private String error;
}
