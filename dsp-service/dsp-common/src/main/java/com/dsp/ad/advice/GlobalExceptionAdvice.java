package com.dsp.ad.advice;

import com.dsp.ad.exception.AdException;
import com.dsp.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 44644
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request,
                                                     AdException ex){
        CommonResponse<String> response = new CommonResponse<>(
                -1,
                "business error"
        );
        response.setData(ex.getMessage());
        return response;
    }
}
