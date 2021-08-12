package com.wnn.display.mvc;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

/**
 * @author NanNan Wang
 **/
@Data
@Getter
@Setter
public class Result implements Serializable {
    private ResultHead head;
//    private ResultBody body;
    private Object data;

    public static Result success(Object body) {
        Result result = new Result();
        result.setHead(
                new ResultHead(
                        ResultCode.SUCCESS.code(),ResultCode.SUCCESS.message())
            );
        result.setData(body);
        return result;
    }
}