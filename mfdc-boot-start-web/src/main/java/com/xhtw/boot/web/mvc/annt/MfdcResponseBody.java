package com.xhtw.boot.web.mvc.annt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cxing on 2018/3/20.
 */
@Target({ElementType.TYPE,  ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MfdcResponseBody {
}
