package com.wnn.display.mvc;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author NanNan Wang
 **/
@Data
@Setter
@Getter
public class ResultHead {
    private Integer code;
    private String message;

    public ResultHead(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public ResultHead() {
    }
}
