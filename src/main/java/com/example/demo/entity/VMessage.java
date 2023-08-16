package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author fs
 * @since 2023-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("v_message")
public class VMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号
     */
    private String iphone;

    /**
     * 咨询内容
     */
    private String seek;

    /**
     * 回复内容
     */
    private String reply;

    /**
     * 咨询时间
     */
    @JsonFormat(pattern = "yyyy_MM_dd HH_mm_ss")
    private Date seekTime;

    /**
     * 0为未读，1为已读
     */
    private Integer isRead;
}
