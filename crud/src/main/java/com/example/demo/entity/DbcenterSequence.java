package com.example.demo.entity;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
@ApiModel("数据中心序列")
public class DbcenterSequence {
    @Getter
    @Setter
    private String UUID;
    @Getter
    @Setter
    private String seqName;
    @Getter
    @Setter
    private String seqDesc;
    @Getter
    @Setter
    private int curVal;


}
