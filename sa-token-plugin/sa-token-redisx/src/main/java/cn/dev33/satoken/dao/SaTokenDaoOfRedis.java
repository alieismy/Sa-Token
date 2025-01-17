/*
 * Copyright 2020-2099 sa-token.cc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dev33.satoken.dao;

import org.noear.redisx.RedisClient;

import java.util.Properties;

/**
 * SaTokenDao 的 redis 适配
 *
 * @author noear
 * @since 1.6
 */
public class SaTokenDaoOfRedis extends SaTokenDaoOfRedisBase64 {

    public SaTokenDaoOfRedis(Properties props) {
        super(props);
    }

    public SaTokenDaoOfRedis(RedisClient redisClient) {
        super(redisClient);
    }
}