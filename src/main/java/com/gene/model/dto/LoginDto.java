package com.gene.model.dto;

import lombok.*;

/**
 * @Author xunmi
 * @ClassName LoginDto
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginDto {

    private String account;

    private String password;
}
