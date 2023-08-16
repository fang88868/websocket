package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.VMessage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fs
 * @since 2023-08-15
 */
public interface IVMessageService extends IService<VMessage> {
    JSONObject msgHistory(VMessage data);
}
