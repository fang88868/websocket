package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.VMessage;
import com.example.demo.mapper.VMessageMapper;
import com.example.demo.service.IVMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fs
 * @since 2023-08-15
 */
@Service
public class VMessageServiceImpl extends ServiceImpl<VMessageMapper, VMessage> implements IVMessageService {

    @Override
    public JSONObject msgHistory(VMessage data) {
        return null;
    }
}
