package com.example.hello.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author guweiyu
 *
 */
@Data
public class CommonResp implements Serializable {
    private String status;
    private String msg;
}
