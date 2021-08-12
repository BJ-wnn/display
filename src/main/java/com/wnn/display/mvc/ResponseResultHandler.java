package com.wnn.display.mvc;

import com.alibaba.fastjson.JSON;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author NanNan Wang
 **/
@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {

    public static final String RESPONSE_RESULT_ANN = "RESPONSE_RESULT_ANN";

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();
//        判断请求 是否有包含标记
        ResponseResult responseResultAnn = (ResponseResult)request.getAttribute(RESPONSE_RESULT_ANN);
//System.out.println(methodParameter.getParameterType().getName());
//        如果全局异常捕获并且处理，则不用封装结果，只封装正确的结果
        if(returnType.getParameterType() == ResponseEntity.class) {
            return  false;
        }
        return responseResultAnn == null ? false : true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
System.out.println("===== test ");
System.out.println(body);
//        return Result.success(body);
        if (body instanceof String) {
            return JSON.toJSONString(Result.success(body));
        }
        return Result.success(body);
    }
}
