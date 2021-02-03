package com.li.geekspring;

import lombok.Builder;
import lombok.Data;

/**
 * @author lichenxu
 * @version V1.0
 * @Package com.li.geekspring
 * @date 2021/2/2 17:58
 * @example:
 * @Description:
 */
@Data
@Builder
public class Foo {
    private Long id;
    private String bar;
}
