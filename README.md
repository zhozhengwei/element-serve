# element-serve
仿照饿了么的后端服务代码
## 接口文档
## 根据商家id查询食物信息
:::tips

- **URL**：[http://47.101.196.82:8988/elm/food/list/110110](http://localhost:8082/food/list/110110)
- **Method**：`GET`
- **需要登录**：是
- **需要鉴权**：否
:::
请求参数

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `businessId` | Integer | <br /> |

请求示例<br />可以传递请求参数。
```json
{
    "businessId": 110110
}
```
成功响应
:::tips
**条件**：请求参数合法。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将查询到信息数据返回，一个businessId为 110110的商家下面的食品将会返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {
        "foodList": [
            {
                "foodId": 20220070204,
                "foodName": "北京烤鸭",
                "foodDescribe": "小蓝",
                "foodPrice": 95.017,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873685,
                "createTime": "2024-05-23T01:04:57.000+00:00",
                "updateBy": 18046873684,
                "updateTime": "2023-04-19T21:33:18.000+00:00",
                "deleteTag": 0
            },
            {
                "foodId": 20220070235,
                "foodName": "北京烤鸭",
                "foodDescribe": "悟空",
                "foodPrice": 90.107,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873716,
                "createTime": "2023-03-16T13:50:35.000+00:00",
                "updateBy": 18046873715,
                "updateTime": "2026-08-11T14:42:01.000+00:00",
                "deleteTag": 0
            },
            {
                "foodId": 20220070250,
                "foodName": "炒木须肉",
                "foodDescribe": "摩拜",
                "foodPrice": 52.028,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873731,
                "createTime": "2023-05-05T21:47:33.000+00:00",
                "updateBy": 18046873730,
                "updateTime": "2027-03-20T20:12:18.000+00:00",
                "deleteTag": 0
            },
            {
                "foodId": 20220070253,
                "foodName": "北京烤鸭",
                "foodDescribe": "ofo",
                "foodPrice": 41.955,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873734,
                "createTime": "2031-02-02T12:27:03.000+00:00",
                "updateBy": 18046873733,
                "updateTime": "2025-10-05T13:09:13.000+00:00",
                "deleteTag": 0
            },
            {
                "foodId": 20220070261,
                "foodName": "炒木须肉",
                "foodDescribe": "摩拜",
                "foodPrice": 19.31,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873742,
                "createTime": "2030-12-15T05:36:41.000+00:00",
                "updateBy": 18046873741,
                "updateTime": "2036-01-29T12:22:21.000+00:00",
                "deleteTag": 0
            },
            {
                "foodId": 20220070281,
                "foodName": "炒木须肉",
                "foodDescribe": "小蓝",
                "foodPrice": 46.841,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873762,
                "createTime": "2036-05-21T14:42:14.000+00:00",
                "updateBy": 18046873761,
                "updateTime": "2027-12-12T19:34:13.000+00:00",
                "deleteTag": 0
            },
            {
                "foodId": 20220070284,
                "foodName": "北京烤鸭",
                "foodDescribe": "ofo",
                "foodPrice": 45.645,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873765,
                "createTime": "2029-08-01T15:20:22.000+00:00",
                "updateBy": 18046873764,
                "updateTime": "2033-12-23T10:26:02.000+00:00",
                "deleteTag": 0
            }
        ]
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662617967507-cdacf81b-4203-412f-86c2-03d61b3e5c38.png#averageHue=%23fcfcfb&clientId=u8b921524-cd4a-4&from=paste&height=711&id=uaaa7018d&name=image.png&originHeight=889&originWidth=1390&originalType=binary&ratio=1&rotation=0&showTitle=false&size=96896&status=done&style=none&taskId=u6fae7d84-9fb5-43a1-abab-2314c9e8fdd&title=&width=1112)

<a name="hB9i0"></a>
## 根据foodId查询食物
:::tips

- **URL**：http://47.101.196.82:8988/elm/food/getFoodId/20220070204
- **Method**：`GET`
- **需要登录**：是
- **需要鉴权**：否
:::
请求参数

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| foodId | Long | <br /> |

请求示例<br />可以传递请求参数。
```json
{
    "foodId": 20220070204
}
```
成功响应
:::tips
**条件**：请求参数合法。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将查询到的食物数据返回，一个`foodid`为 20220070204的食物的数据：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {
        "getFoodIdList": [
            {
                "foodId": 20220070204,
                "foodName": "北京烤鸭",
                "foodDescribe": "小蓝",
                "foodPrice": 95.017,
                "foodImage": "http://lorempixel.com/300/400/",
                "businessId": 110110,
                "createBy": 18046873685,
                "createTime": "2024-05-23T01:04:57.000+00:00",
                "updateBy": 18046873684,
                "updateTime": "2023-04-19T21:33:18.000+00:00",
                "deleteTag": 0
            }
        ]
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662618674809-98c44e46-76a2-42fa-8e04-6ab0a2090e87.png#averageHue=%23fcfcfb&clientId=u7e2905b0-fdda-4&from=paste&height=650&id=u1510dee6&name=image.png&originHeight=813&originWidth=1365&originalType=binary&ratio=1&rotation=0&showTitle=false&size=82425&status=done&style=none&taskId=u70413a3e-3d79-4d12-a7de-18eb1d89f33&title=&width=1092)


<a name="aNJqN"></a>
## 根据食物的分类信息查询
如：一个回锅肉，前端点击分类的回锅肉，会出现一堆回锅肉
:::tips

- **URL**：[http://47.101.196.82:8988/elm/foodBusinessClassify/getFoodClassifyId/1001](http://localhost:8082/foodBusinessClassify/getFoodClassifyId/1001)
- **Method**：`GET`
- **需要登录**：是
- **需要鉴权**：否
:::


**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| foodClassifyId | Long | 1 到 30 个字符 |



**请求示例**<br />可以请求参数。
```json
{
    "foodClassifyId": 1001
}
```


**成功响应**
:::tips
**条件**：请求参数合法。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将查询到食物分类的id数据返回，一个foodClassifyId为 1001的食物分类信息返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {
        "classifyId": [
            {
                "foodClassifyId": 1001,
                "foodId": 20220070201,
                "foodList": [
                    {
                        "foodId": 20220070201,
                        "foodName": "回锅肉",
                        "foodDescribe": "小蓝",
                        "foodPrice": 12.968,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873682,
                        "createTime": "2023-12-23T09:11:29.000+00:00",
                        "updateBy": 18046873681,
                        "updateTime": "2027-05-12T01:29:49.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070214,
                "foodList": [
                    {
                        "foodId": 20220070214,
                        "foodName": "回锅肉",
                        "foodDescribe": "7号电单车",
                        "foodPrice": 95.557,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873695,
                        "createTime": "2022-08-02T14:24:33.000+00:00",
                        "updateBy": 18046873694,
                        "updateTime": "2025-03-27T09:30:57.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070239,
                "foodList": [
                    {
                        "foodId": 20220070239,
                        "foodName": "回锅肉",
                        "foodDescribe": "7号电单车",
                        "foodPrice": 35.205,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873720,
                        "createTime": "2033-10-10T19:18:17.000+00:00",
                        "updateBy": 18046873719,
                        "updateTime": "2023-12-22T13:06:20.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070243,
                "foodList": [
                    {
                        "foodId": 20220070243,
                        "foodName": "回锅肉",
                        "foodDescribe": "ofo",
                        "foodPrice": 99.322,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873724,
                        "createTime": "2031-09-12T20:15:36.000+00:00",
                        "updateBy": 18046873723,
                        "updateTime": "2024-01-03T07:16:49.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070245,
                "foodList": [
                    {
                        "foodId": 20220070245,
                        "foodName": "回锅肉",
                        "foodDescribe": "摩拜",
                        "foodPrice": 37.593,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873726,
                        "createTime": "2024-12-27T11:52:17.000+00:00",
                        "updateBy": 18046873725,
                        "updateTime": "2034-07-16T17:32:15.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070249,
                "foodList": [
                    {
                        "foodId": 20220070249,
                        "foodName": "回锅肉",
                        "foodDescribe": "摩拜",
                        "foodPrice": 2.749,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873730,
                        "createTime": "2021-01-02T22:20:03.000+00:00",
                        "updateBy": 18046873729,
                        "updateTime": "2037-06-20T04:41:59.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070278,
                "foodList": [
                    {
                        "foodId": 20220070278,
                        "foodName": "回锅肉",
                        "foodDescribe": "摩拜",
                        "foodPrice": 80.159,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873759,
                        "createTime": "2028-10-04T00:57:03.000+00:00",
                        "updateBy": 18046873758,
                        "updateTime": "2033-11-08T12:59:08.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070289,
                "foodList": [
                    {
                        "foodId": 20220070289,
                        "foodName": "回锅肉",
                        "foodDescribe": "ofo",
                        "foodPrice": 99.767,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873770,
                        "createTime": "2031-09-30T10:34:35.000+00:00",
                        "updateBy": 18046873769,
                        "updateTime": "2022-03-27T14:44:38.000+00:00",
                        "deleteTag": 0
                    }
                ]
            },
            {
                "foodClassifyId": 1001,
                "foodId": 20220070293,
                "foodList": [
                    {
                        "foodId": 20220070293,
                        "foodName": "回锅肉",
                        "foodDescribe": "摩拜",
                        "foodPrice": 40.288,
                        "foodImage": "http://lorempixel.com/300/400/",
                        "businessId": 110113,
                        "createBy": 18046873774,
                        "createTime": "2021-12-23T11:24:00.000+00:00",
                        "updateBy": 18046873773,
                        "updateTime": "2035-02-18T19:56:16.000+00:00",
                        "deleteTag": 0
                    }
                ]
            }
        ]
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662619454363-9b9267a1-a7db-4f0b-b172-cc7f93c3817d.png#averageHue=%23fdfcfc&clientId=u6140a479-cf54-4&from=paste&height=649&id=u111c004b&name=image.png&originHeight=811&originWidth=1411&originalType=binary&ratio=1&rotation=0&showTitle=false&size=85272&status=done&style=none&taskId=u878075d9-db87-4112-9261-455629fce7a&title=&width=1128.8)



<a name="JhQqZ"></a>
## 根据商家id查询食物的分类信息
如：一个商家有多个食物分类
:::tips

- **URL**：[http://47.101.196.82:8988/elm/foodClassify/getBusinessId/110113](http://localhost:8082/foodClassify/getBusinessId/110113)
- **Method**：`GET`
- **需要登录**：是
- **需要鉴权**：否
:::
<a name="O4NJr"></a>
### 
**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| businessId | Integer | <br /> |



**请求示例**<br />可以请求参数。
```json
{
    "businessId": 110113
}
```

**成功响应**
:::tips
**条件**：请求参数合法。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将查询到的食物分类的id信息数据返回，一个businessId为 110113的商家下的食物分类将会返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "foodClassifyList": [
            {
                "foodClassifyId": 1001,
                "foodClassifyName": "回锅肉",
                "businessId": 110113,
                "createBy": 2816032193,
                "createTime": "2022-08-03T06:11:49.000+00:00",
                "updateBy": 2816032193,
                "updateTime": "2022-08-03T06:11:49.000+00:00",
                "deleteTag": 1,
                "foodBusinessClassifyList": [
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070201,
                        "foodList": [
                            {
                                "foodId": 20220070201,
                                "foodName": "回锅肉",
                                "foodDescribe": "小蓝",
                                "foodPrice": 12.968,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873682,
                                "createTime": "2023-12-23T09:11:29.000+00:00",
                                "updateBy": 18046873681,
                                "updateTime": "2027-05-12T01:29:49.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070214,
                        "foodList": [
                            {
                                "foodId": 20220070214,
                                "foodName": "回锅肉",
                                "foodDescribe": "7号电单车",
                                "foodPrice": 95.557,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873695,
                                "createTime": "2022-08-02T14:24:33.000+00:00",
                                "updateBy": 18046873694,
                                "updateTime": "2025-03-27T09:30:57.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070239,
                        "foodList": [
                            {
                                "foodId": 20220070239,
                                "foodName": "回锅肉",
                                "foodDescribe": "7号电单车",
                                "foodPrice": 35.205,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873720,
                                "createTime": "2033-10-10T19:18:17.000+00:00",
                                "updateBy": 18046873719,
                                "updateTime": "2023-12-22T13:06:20.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070243,
                        "foodList": [
                            {
                                "foodId": 20220070243,
                                "foodName": "回锅肉",
                                "foodDescribe": "ofo",
                                "foodPrice": 99.322,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873724,
                                "createTime": "2031-09-12T20:15:36.000+00:00",
                                "updateBy": 18046873723,
                                "updateTime": "2024-01-03T07:16:49.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070245,
                        "foodList": [
                            {
                                "foodId": 20220070245,
                                "foodName": "回锅肉",
                                "foodDescribe": "摩拜",
                                "foodPrice": 37.593,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873726,
                                "createTime": "2024-12-27T11:52:17.000+00:00",
                                "updateBy": 18046873725,
                                "updateTime": "2034-07-16T17:32:15.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070249,
                        "foodList": [
                            {
                                "foodId": 20220070249,
                                "foodName": "回锅肉",
                                "foodDescribe": "摩拜",
                                "foodPrice": 2.749,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873730,
                                "createTime": "2021-01-02T22:20:03.000+00:00",
                                "updateBy": 18046873729,
                                "updateTime": "2037-06-20T04:41:59.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070278,
                        "foodList": [
                            {
                                "foodId": 20220070278,
                                "foodName": "回锅肉",
                                "foodDescribe": "摩拜",
                                "foodPrice": 80.159,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873759,
                                "createTime": "2028-10-04T00:57:03.000+00:00",
                                "updateBy": 18046873758,
                                "updateTime": "2033-11-08T12:59:08.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070289,
                        "foodList": [
                            {
                                "foodId": 20220070289,
                                "foodName": "回锅肉",
                                "foodDescribe": "ofo",
                                "foodPrice": 99.767,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873770,
                                "createTime": "2031-09-30T10:34:35.000+00:00",
                                "updateBy": 18046873769,
                                "updateTime": "2022-03-27T14:44:38.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1001,
                        "foodId": 20220070293,
                        "foodList": [
                            {
                                "foodId": 20220070293,
                                "foodName": "回锅肉",
                                "foodDescribe": "摩拜",
                                "foodPrice": 40.288,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873774,
                                "createTime": "2021-12-23T11:24:00.000+00:00",
                                "updateBy": 18046873773,
                                "updateTime": "2035-02-18T19:56:16.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    }
                ]
            },
            {
                "foodClassifyId": 1008,
                "foodClassifyName": "家常豆腐",
                "businessId": 110113,
                "createBy": 2816032193,
                "createTime": "2010-12-18T22:30:24.000+00:00",
                "updateBy": 2816032193,
                "updateTime": "2010-12-18T22:30:24.000+00:00",
                "deleteTag": 1,
                "foodBusinessClassifyList": [
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070211,
                        "foodList": [
                            {
                                "foodId": 20220070211,
                                "foodName": "家常豆腐",
                                "foodDescribe": "小蓝",
                                "foodPrice": 35.395,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873692,
                                "createTime": "2020-05-05T05:11:19.000+00:00",
                                "updateBy": 18046873691,
                                "updateTime": "2033-10-12T06:45:21.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070225,
                        "foodList": [
                            {
                                "foodId": 20220070225,
                                "foodName": "家常豆腐",
                                "foodDescribe": "ofo",
                                "foodPrice": 74.456,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873706,
                                "createTime": "2026-05-13T12:03:54.000+00:00",
                                "updateBy": 18046873705,
                                "updateTime": "2029-03-10T18:55:48.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070237,
                        "foodList": [
                            {
                                "foodId": 20220070237,
                                "foodName": "家常豆腐",
                                "foodDescribe": "摩拜",
                                "foodPrice": 43.331,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873718,
                                "createTime": "2026-04-17T21:27:31.000+00:00",
                                "updateBy": 18046873717,
                                "updateTime": "2020-11-11T13:44:24.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070238,
                        "foodList": [
                            {
                                "foodId": 20220070238,
                                "foodName": "家常豆腐",
                                "foodDescribe": "小蓝",
                                "foodPrice": 46.469,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873719,
                                "createTime": "2033-05-22T04:22:16.000+00:00",
                                "updateBy": 18046873718,
                                "updateTime": "2024-06-14T16:49:02.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070257,
                        "foodList": [
                            {
                                "foodId": 20220070257,
                                "foodName": "家常豆腐",
                                "foodDescribe": "7号电单车",
                                "foodPrice": 29.211,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873738,
                                "createTime": "2033-10-22T08:00:07.000+00:00",
                                "updateBy": 18046873737,
                                "updateTime": "2029-06-09T15:45:11.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070270,
                        "foodList": [
                            {
                                "foodId": 20220070270,
                                "foodName": "家常豆腐",
                                "foodDescribe": "小蓝",
                                "foodPrice": 17.902,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873751,
                                "createTime": "2037-03-07T12:08:03.000+00:00",
                                "updateBy": 18046873750,
                                "updateTime": "2030-11-09T19:20:19.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    },
                    {
                        "foodClassifyId": 1008,
                        "foodId": 20220070295,
                        "foodList": [
                            {
                                "foodId": 20220070295,
                                "foodName": "家常豆腐",
                                "foodDescribe": "悟空",
                                "foodPrice": 28.83,
                                "foodImage": "http://lorempixel.com/300/400/",
                                "businessId": 110113,
                                "createBy": 18046873776,
                                "createTime": "2023-11-20T17:33:22.000+00:00",
                                "updateBy": 18046873775,
                                "updateTime": "2020-09-11T08:59:51.000+00:00",
                                "deleteTag": 0
                            }
                        ]
                    }
                ]
            }
        ]
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662620362545-290d6d24-e68e-4ba4-8eb4-7f5ef6a2335e.png#averageHue=%23fcfcfb&clientId=ue067b69a-b030-4&from=paste&height=666&id=u20b561e7&name=image.png&originHeight=832&originWidth=1383&originalType=binary&ratio=1&rotation=0&showTitle=false&size=90743&status=done&style=none&taskId=u4c456f86-4c7e-46bf-998a-742b16863cb&title=&width=1106.4)





<a name="wTemi"></a>
# 购物车
<a name="SCm5d"></a>
### 购物车所有信息，并且根据foodId显示出食物的信息
:::tips

- **URL**：`http://47.101.196.82:8988/elm/cart/listCart`
- **Method**：get
- **需要登录**：是
- **需要鉴权**：否
:::
请求参数<br />请求的是一个对象

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| cart | Cart | 无 |

请求示例<br />![image-20220907223829724.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662564919811-5d218764-eebd-413f-ba24-c775ee4f273f.png#averageHue=%23fcfbfb&clientId=u8f3b125c-0134-4&from=paste&height=553&id=u23d24864&name=image-20220907223829724.png&originHeight=691&originWidth=708&originalType=binary&ratio=1&rotation=0&showTitle=false&size=56989&status=done&style=none&taskId=u0bd47f26-7b84-4a41-848d-132f6a805c7&title=&width=566.4)


<a name="QkI1h"></a>
### 通过userId查询购物车信息
:::tips

- **URL**：[http://47.101.196.82:8988/elm/cart/getUserId/18046873682](http://localhost:8082/cart/getUserId/18046873682)
- **Method**：`get`
:::
请求参数

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| userId | Long | 无 |

请求示例<br />![image-20220907224311011.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662565270394-0166a444-104b-4db1-9a90-e16253013822.png#averageHue=%23fdfcfb&clientId=u8f3b125c-0134-4&from=paste&height=617&id=u25a4086b&name=image-20220907224311011.png&originHeight=771&originWidth=917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=80428&status=done&style=none&taskId=u42c766cc-a36d-46b1-87dc-5bcd66473d0&title=&width=733.6)

<a name="AGcma"></a>
### 添加购物车
:::tips

- **URL**：[http://47.101.196.82:8988/elm/cart/saveCart](http://localhost:8082/cart/saveCart)
- **Method**：post
:::
请求参数

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| cart | int | <br /> |

请求示例<br />![image-20220907225139089.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662565597264-d11d1b53-5394-43e9-a665-c44d4d79fa0d.png#averageHue=%23fdfdfc&clientId=u8f3b125c-0134-4&from=paste&height=360&id=uf5adfbf3&name=image-20220907225139089.png&originHeight=450&originWidth=1063&originalType=binary&ratio=1&rotation=0&showTitle=false&size=37476&status=done&style=none&taskId=ub8451067-8dc6-42ba-a2cf-ecc69a7884d&title=&width=850.4)<br />![image-20220907225342929.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662565641582-237712c6-5419-437d-a882-c01ad8bee561.png#averageHue=%23f9f3f1&clientId=u8f3b125c-0134-4&from=paste&height=98&id=u390a16ea&name=image-20220907225342929.png&originHeight=122&originWidth=769&originalType=binary&ratio=1&rotation=0&showTitle=false&size=8603&status=done&style=none&taskId=u8ad3386f-a09a-4f02-a371-5e2ea1b4685&title=&width=615.2)

<a name="hWIG7"></a>
### 通过userId来删除购物车

- **URL**：[http://47.101.196.82:8988/elm/cart/delete/](http://localhost:8082/cart/delete/){userId}
- **Method**：delete

请求参数

| **参数** | **类型** | **约束** |
| --- | --- | --- |
| userId | Long |  |

请求示例

 ![image-20220907235713783.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662566431644-bbb0b19b-f8f1-477d-9322-ca1256349c46.png#averageHue=%23f8f6f3&clientId=u8f3b125c-0134-4&from=drop&id=ua4ff05fe&name=image-20220907235713783.png&originHeight=144&originWidth=630&originalType=binary&ratio=1&rotation=0&showTitle=false&size=7295&status=done&style=none&taskId=uff10ff65-adab-4a27-879b-b7786f9fda8&title=)![image-20220907235858190.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662566437329-5930d9b6-4ac9-424c-bd30-611bc80f2a55.png#averageHue=%23fdfcfc&clientId=u8f3b125c-0134-4&from=drop&id=ufc2aef61&name=image-20220907235858190.png&originHeight=484&originWidth=985&originalType=binary&ratio=1&rotation=0&showTitle=false&size=28282&status=done&style=none&taskId=u05fa88ab-cb00-4d6e-b469-b2395d911dd&title=)![image-20220907235917980.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662566442677-45b901b0-cffb-43d8-875d-a0328a97d6e7.png#averageHue=%23f7f5f3&clientId=u8f3b125c-0134-4&from=drop&id=u63e22fe9&name=image-20220907235917980.png&originHeight=115&originWidth=660&originalType=binary&ratio=1&rotation=0&showTitle=false&size=6098&status=done&style=none&taskId=u9d35b162-d9e9-4d98-a712-3f5439a4a67&title=)

<a name="c3ZzD"></a>
### 更新购物车内商品数量

- **URL**：http://47.101.196.82:8988/elm/cart/updateCart
- **Method**：put

请求参数

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| Cart | int |  |

请求示例

![image-20220908001537148.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662567460024-6dffca39-5d17-43b3-832c-06cf6eca091c.png#averageHue=%23fcfcfc&clientId=u8f3b125c-0134-4&from=drop&id=uc7d6a779&name=image-20220908001537148.png&originHeight=560&originWidth=1354&originalType=binary&ratio=1&rotation=0&showTitle=false&size=46396&status=done&style=none&taskId=u1afa1377-61f0-4d5f-a57a-438b40513dd&title=)
<a name="wQBZU"></a>
### 根据userId、businessId、foodId清空购物车
用户登录生成订单之后，清空自己的购物车。
:::tips

- **URL**：http://47.101.196.82:8988/elm/cart/removeCart
- **Method**：`DELETE`
- **需要登录**：是
- **需要鉴权**：否
:::
请求参数

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| userId | Long | <br /> |
| businessId | Integer |  |
| foodId | Long |  |

请求示例<br />可以传递请求参数。
```json
{
  
  "userId": 19816283072,
  "businessId": 110115,
  "foodId": 20220070205,
}
```

<a name="U7ZmS"></a>
# 评论
<a name="BKVpg"></a>
### 根据userId查询评论信息

- **URL**：http://47.101.196.82:8988/elm/comment/list/19816783072
- **Method**：GET
- **需要登录**：是
- **需要鉴权**：否

**请求参数**

| **参数** | **类型** | **约束** |
| --- | --- | --- |
| userId | Long |  |
|  |  |  |


**请求示例**<br />请求参数
```json
{
    "userId": 19816783072
}
```


**成功响应**<br />**条件**：请求参数合法。<br />**状态码：**200 OK<br />**响应示例**：响应会将查询的评论信息数据返回，根据userId查询到的数据进行返回：

```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {
        "commentList": [
            {
                "commentId": 1002,
                "businessId": 110110,
                "imagePath": "http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220907001740387.jpg",
                "commentText": "好吃，经常回购，喜欢就下单",
                "commentScore": 5.0,
                "userId": 19816783072,
                "createTime": "2022-08-15T16:00:00.000+00:00",
                "deleteTag": 1,
                "businessList": []
            }
        ]
    }
}
```

![image-20220908092709019.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662605341342-5df4f18e-e2a2-4fb0-b12c-b6031190855c.png#averageHue=%23fcfcfc&clientId=u0a27de20-ff5a-4&from=drop&id=u0ba88401&name=image-20220908092709019.png&originHeight=830&originWidth=1414&originalType=binary&ratio=1&rotation=0&showTitle=false&size=72699&status=done&style=none&taskId=u9de232a7-24be-4b0e-b1ef-0fdc3c53627&title=)

<a name="iKrtL"></a>
### 根据商家id（businessId）查询评论，并且查询到商家信息。

- **URL**：http://47.101.196.82:8988/elm/comment/getBusinessId/110110
- **Method**：GET
- **需要登录**：是
- **需要鉴权**：否

**请求参数**

| **参数** | **类型** | **约束** |
| --- | --- | --- |
| businessId | Integer |  |
|  |  |  |



**请求示例**<br />请求参数
```json
{
    "businessId": 110110,
}
```

**成功响应**<br />**条件**：请求参数合法。<br />**状态码：**200 OK<br />**响应示例**：响应会将查询到的商家的评论以及商家的信息数据返回：
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {
        "getBusinessIdList": [
            {
                "commentId": 1001,
                "businessId": 110110,
                "imagePath": "http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220907001740387.jpg",
                "commentText": "好吃，味道很好，喜欢的可以购买，回购很多次",
                "commentScore": 5.0,
                "userId": 7190764205,
                "createTime": "2022-06-01T16:00:00.000+00:00",
                "deleteTag": 1,
                "businessList": [
                    {
                        "businessId": 110110,
                        "businessName": "Bigbear韩国炸鸡（临港点）",
                        "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                        "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                        "businessImg": "\r\ndata:image/png;base64,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",
                        "categoryId": 10,
                        "starPrice": 20.0,
                        "deliveryPrice": 4.0,
                        "remarks": null
                    }
                ]
            },
            {
                "commentId": 1002,
                "businessId": 110110,
                "imagePath": "http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220907001740387.jpg",
                "commentText": "好吃，经常回购，喜欢就下单",
                "commentScore": 5.0,
                "userId": 19816783072,
                "createTime": "2022-08-15T16:00:00.000+00:00",
                "deleteTag": 1,
                "businessList": [
                    {
                        "businessId": 110110,
                        "businessName": "Bigbear韩国炸鸡（临港点）",
                        "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                        "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                        "businessImg": "\r\ndata:image/png;base64,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",
                        "categoryId": 10,
                        "starPrice": 20.0,
                        "deliveryPrice": 4.0,
                        "remarks": null
                    }
                ]
            }
        ]
    }
}
```
![image-20220908093958529.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662605557649-b9f575a5-656c-4acc-8812-40d40907b11d.png#averageHue=%23fdfcfc&clientId=u0a27de20-ff5a-4&from=drop&id=u998baa03&name=image-20220908093958529.png&originHeight=821&originWidth=1432&originalType=binary&ratio=1&rotation=0&showTitle=false&size=76024&status=done&style=none&taskId=uea0cad58-519c-415e-8867-ec413a75ea5&title=)


<a name="leHK0"></a>
### 允许用户添加评论。

- **URL**：[http://47.101.196.82:8988/elm/comment/insert](http://localhost:8082/comment/insert)
- **Method**：POST
- **需要登录**：是
- **需要鉴权**：否

**请求参数**

| **参数** | **类型** | **约束** |
| --- | --- | --- |
| businessId | Integer |  |
| commentText | String |  |
| commentScore | Double |  |
| userId | Long |  |
| file | String |  |

```json
{
    "businessId": 110115,
    "commentText": "非常的好吃，强力推荐！",
    "commentScore": 5,
    "userId": 19816283072,
    "file": "文件路径"
}
```

**成功响应**<br />**条件**：请求参数合法。<br />**状态码：**200 OK<br />**响应示例**：响应会将对象和文件数据返回：
```json
{
    "code": 1,
    "msg": "上传成功",
    "data": {
        "src": "http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220908102125830.jpg",
        "comment": "Comment(commentId=null, businessId=110115, imagePath=http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220908102125830.jpg, commentText=非常的好吃，强力推荐！, commentScore=5.0, userId=19816283072, createTime=null, deleteTag=null, businessList=[])"
    }
}
```
![image-20220908103058309.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662606156854-9a0c4352-41a4-48a7-ba2b-552b19e890cc.png#averageHue=%23fcfcfb&clientId=u1d8f2997-c54b-4&from=paste&height=639&id=ubb533f94&name=image-20220908103058309.png&originHeight=799&originWidth=1416&originalType=binary&ratio=1&rotation=0&showTitle=false&size=83739&status=done&style=none&taskId=ua83b476b-8036-49ee-a823-f1404a3fea7&title=&width=1132.8)<br />![image-20220908105707478.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662606172645-3b06c659-afce-4d1d-b590-6e598ebfc8f4.png#averageHue=%23f7f4f2&clientId=u1d8f2997-c54b-4&from=paste&height=390&id=u79c6be77&name=image-20220908105707478.png&originHeight=488&originWidth=1652&originalType=binary&ratio=1&rotation=0&showTitle=false&size=59269&status=done&style=none&taskId=ud2a57def-1080-4817-bfe6-084278d7826&title=&width=1321.6)

<a name="WlsB0"></a>
### 用户根据id（userId）删除自己的信息。

- **URL**：http://47.101.196.82:8988/elm/comment/remove/19816283072
- **Method**：DELETE
- **需要登录**：是
- **需要鉴权**：否

**请求参数**

| **参数** | **类型** | **约束** |
| --- | --- | --- |
| userId | Integer |  |



**请求示例**
```json
{
    "userId": 19816283072,
}
```


**成功响应**<br />**条件**：请求参数合法。<br />**状态码：**200 OK<br />**响应示例**：响应会将删除信息数据返回：
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {}
}
```
![image-20220908111432308.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662607150272-aa74012e-efae-4c36-8f8a-573c887d01a7.png#averageHue=%23fdfcfc&clientId=u1d8f2997-c54b-4&from=paste&height=656&id=uae38e8dc&name=image-20220908111432308.png&originHeight=820&originWidth=1387&originalType=binary&ratio=1&rotation=0&showTitle=false&size=62438&status=done&style=none&taskId=uafb675d7-0a59-4009-a4b1-f6d52e80bad&title=&width=1109.6)

<a name="cQNdT"></a>
## 在评论表里通过userId查询用户信息
:::tips

- **URL**：http://47.101.196.82:8988/elm/comment/commentUser/7190764205
- **Method**：GET
- **需要登录**：是
- **需要鉴权**：否
:::

**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| userId | Long | <br /> |



**请求示例**<br />可以传递请求参数。
```json
{
    "userId": 719076405
}
```

**成功响应**
:::tips
**条件**：请求参数合法。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将查询到的用户信息数据返回，一个userId为 7190764205的用户信息将会返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "data": {
        "commentUserList": [
            {
                "commentId": 1001,
                "businessId": 110110,
                "imagePath": "http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220907001740387.jpg",
                "commentText": "好吃，味道很好，喜欢的可以购买，回购很多次",
                "commentScore": 5.0,
                "userId": 7190764205,
                "createTime": "2022-06-01T16:00:00.000+00:00",
                "deleteTag": 1,
                "businessList": [],
                "userList": [
                    {
                        "userId": 7190764205,
                        "password": "123",
                        "username": "1",
                        "userSex": 1,
                        "userImg": null,
                        "delTag": "1"
                    }
                ]
            }
        ]
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/32707116/1662636550243-0189faa4-9d5c-4985-a58e-065199285afd.png#averageHue=%23fdfcfc&clientId=uf1660be1-513e-4&from=paste&height=657&id=u184dacde&name=image.png&originHeight=821&originWidth=1407&originalType=binary&ratio=1&rotation=0&showTitle=false&size=81542&status=done&style=none&taskId=ud9e1a8a9-3f44-428d-8b2f-598dd10cd89&title=&width=1125.6)

<a name="k1UvO"></a>
# 用户接口
<a name="cuE6F"></a>
## 用户登录
:::warning

- **URL**：`http://47.101.196.82:8988/elm/user/login`
- **Method**：`post`
- **需要登录**：不需要
- **需要鉴权**：不需要
:::

**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `用户ID{userId}` | number | 无 |
| `用户密码{password}` | String | 无 |


**请求示例**
```json
{
    "userId":17370709160,
    "password":"123"
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662571309225-b3c54588-3df6-44ce-b6d8-a7dae06dbed0.png#averageHue=%23fefefc&clientId=u046de629-5ce3-4&from=paste&height=394&id=u9694156f&name=image.png&originHeight=493&originWidth=1183&originalType=binary&ratio=1&rotation=0&showTitle=false&size=29288&status=done&style=none&taskId=u79d970de-437f-4c37-9b70-21bcbd2fb55&title=&width=946.4)

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将修改后的用户信息数据返回，一个`id`为 1234 的用户设置他们的姓名后将会返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "user": {
            "userId": 17370709160,
            "username": "周政伟",
            "password": "",
            "userSex": 1,
            "userImg": "http://zzwcos-1308302031.cos.ap-shanghai.myqcloud.com/20220907001140623.jpg",
            "delTag": 1,
            "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOjE3MzcwNzA5MTYwLCJ1c2VybmFtZSI6IuWRqOaUv-S8nyIsImlhdCI6MTY2MjU3MTA4MSwiZXhwIjoxNjYyNjU3NDgxLCJqdGkiOiJiY2U4NGVmNjU4MmM0OTkzYjllYzAzZjRmODhkMjNhYyJ9.9IPibjJbbfPSIC5L0SZHvtH0rsSG9dwaxtpkqS1oZQg"
        }
    }
}
```
:::info
💡 之后的接口都是拦截器拦截的请求，需要携带token<br />💡 eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOjE3MzcwNzA5MTYwLCJ1c2VybmFtZSI6IuWRqOaUv-S8nyIsImlhdCI6MTY2MjU3MTA4MSwiZXhwIjoxNjYyNjU3NDgxLCJqdGkiOiJiY2U4NGVmNjU4MmM0OTkzYjllYzAzZjRmODhkMjNhYyJ9.9IPibjJbbfPSIC5L0SZHvtH0rsSG9dwaxtpkqS1oZQg
:::
<a name="rb9dd"></a>
### 
<a name="l8cly"></a>
### 注册用户
> - **URL**：`http://47.101.196.82:8988/elm/user/addUser`
> - **Method**：`post`
> - **需要登录**：不需要
> - **需要鉴权**：不需要


**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `用户ID{userId}` | number | 无 |
| `用户密码{password}` | String | 无 |
| `用户名{username}` | String | 无 |
| `用户名{userSex}` | number | 无 |


**请求示例**<br />请求参数。
```json
{
    "userId":19816281525,
    "password":"123",
    "username":"zzw1",
    "userSex": 0
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662572180507-c08d4a2f-cc05-4f7f-a53f-5195b67754e2.png#averageHue=%23fefefc&clientId=u8e620277-0fd5-4&from=paste&height=388&id=u690760e0&name=image.png&originHeight=485&originWidth=1175&originalType=binary&ratio=1&rotation=0&showTitle=false&size=32191&status=done&style=none&taskId=u586f544f-b5fa-4836-8b10-2b8dd7aab6a&title=&width=940)<br />请求参数。
```json
{
    "userId":19816281529,
    "password":"123",
    "username":"zzw1",
    "userSex": 0
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662572359117-4f8e1ae4-8b7a-415d-b4d9-619d34bfb19e.png#averageHue=%23fefefc&clientId=u8e620277-0fd5-4&from=paste&height=391&id=u0b712f69&name=image.png&originHeight=489&originWidth=1187&originalType=binary&ratio=1&rotation=0&showTitle=false&size=32568&status=done&style=none&taskId=u918f4d1d-faa7-4686-a243-48b2ebee554&title=&width=949.6)

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将修改后的用户信息数据返回，一个`id`为 1234 的用户设置他们的姓名后将会返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "add": 1
    }
}
```

<a name="IxxjK"></a>
## 更新用户信息
允许已授权的用户通过此接口更新自己的信息。

:::tips

- **URL**：`http://47.101.196.82:8988/elm/user/update`
- **Method**：`post`
- **需要登录**：不需要
- **需要鉴权**：不需要
:::
<a name="WmELX"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `用户ID{userId}` | number | 无 |
| `文件参数{file}` | file | 无 |

:::info
💡 注意，file的提交为form-data提交
:::
<a name="LkaQb"></a>
### 请求示例
可以仅传递部分请求参数。<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662483938631-b3cc530a-2baf-40fa-8f15-d32f6f470a07.png#averageHue=%23fefdfd&clientId=u1dfc87f4-720f-4&from=paste&height=453&id=hNhGA&name=image.png&originHeight=453&originWidth=1161&originalType=binary&ratio=1&rotation=0&showTitle=false&size=33906&status=done&style=none&taskId=u32c40a28-7504-4f24-b381-99bded81b43&title=&width=1161)<br />可以通过传递空字符串来清除数据。<br />可以使用其它字段输入内容可以更新信息。<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662484340199-b5445cda-b762-4cb0-bbeb-d9b69e9d90b8.png#averageHue=%23fefdfd&clientId=u1dfc87f4-720f-4&from=paste&height=503&id=liYoL&name=image.png&originHeight=503&originWidth=1099&originalType=binary&ratio=1&rotation=0&showTitle=false&size=35471&status=done&style=none&taskId=u252ff9d2-e892-4d91-a9c9-a3489e3fcdd&title=&width=1099)
<a name="M1ObP"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：响应会将修改后的用户信息数据返回，一个`id`为 1234 的用户设置他们的姓名后将会返回：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "count": 1	//数据库中影响行数
    }
}
```
<a name="AU1Pp"></a>
### 错误响应
:::tips
**条件**：无数据输入<br />**状态码**：`20003 更新失败`<br />响应示例:
:::
```json
{
    "success": false,
    "code": 20003,
    "message": "更新失败",
    "map": {}
}
```

<a name="ogpNr"></a>
## 注销用户登录
允许已授权的用户通过此接口更新自己的信息。
:::tips

- **URL**：`http://47.101.196.82:8988/elm/user/logout`
- **Method**：`RequestMapping`
- **需要登录**：不需要
- **需要鉴权**：不需要
:::
<a name="itcme"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `可以是旧token(可以是一个随机字符)` | String | 无 |

:::info
💡 注意，json和其它的数据传输都可以
:::
<a name="GpW2G"></a>
### 请求示例
可以仅传递部分请求参数。<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662485676132-b8e1b0aa-6aab-43f0-8a51-4b19a3bfdf22.png#averageHue=%23fdfdfd&clientId=u1dfc87f4-720f-4&from=paste&height=393&id=E2Wgh&name=image.png&originHeight=393&originWidth=1172&originalType=binary&ratio=1&rotation=0&showTitle=false&size=28353&status=done&style=none&taskId=ue3cac1f4-0ee0-4e1a-9a03-f81d42b8cfd&title=&width=1172)<br />传递为空也是可以的这里只是生成一个无效的token<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662485702738-5d136221-95be-4d65-86f4-a6df8d608a09.png#averageHue=%23fdfdfd&clientId=u1dfc87f4-720f-4&from=paste&height=367&id=X8TKe&name=image.png&originHeight=367&originWidth=1175&originalType=binary&ratio=1&rotation=0&showTitle=false&size=26994&status=done&style=none&taskId=ub5cc0551-0c98-4f16-80b2-5ef2f84e0ab&title=&width=1175)
<a name="LV2oQ"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiLnlKjmiLciLCJpYXQiOjE2NjI0ODU0ODZ9.9eWhMHAPpVMGQKE9L9eSn1C90YTx0RMLIKIaLb2hgzm_wQMWDXfwFt-5A_nxU3w7YQre8V5ebe_-01oq0ZTkAQ"
    }
}
```
:::info
💡 返回的token为一个没有验证效果的token无法根据它来获取到拦截的路径
:::


<a name="KMnpp"></a>
# 商户接口
<a name="dIqNG"></a>
## 查询全部商家

:::tips

- **URL**：`http://47.101.196.82:8988/elm/business/search`
- **Method**：`get`
- **需要登录**：不需要
- **需要鉴权**：不需要
:::
<a name="clZZi"></a>
### 请求参数
:::info
💡 注意，无需参数
:::
<a name="AwBKE"></a>
### 请求示例
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662572964069-d123d504-9e3a-46ee-b314-61829d5c523d.png#averageHue=%23f5ecdb&clientId=u8e620277-0fd5-4&from=paste&height=208&id=u50fb3d52&name=image.png&originHeight=260&originWidth=1256&originalType=binary&ratio=1&rotation=0&showTitle=false&size=23789&status=done&style=none&taskId=uf3fd83ae-6406-4cdf-b90c-2a396a7b07b&title=&width=1004.8)
<a name="hA1ZR"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "businessList": [
            {
                "businessId": 110110,
                "businessName": "Bigbear韩国炸鸡（临港点）",
                "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 4,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110111,
                "businessName": "肯德基宅急送(古棕店)",
                "businessAddress": "上海市浦东新区古棕路584号",
                "businessExplain": "肯德基宅急送，专业外送，全程保温，准时送达。",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110111.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 9,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110112,
                "businessName": "蜜雪冰城(沪城环路店)",
                "businessAddress": "上海市浦东新区南汇新城镇沪环路699弄169-1号",
                "businessExplain": "1997年从一家冰激凌窗口，到今天的10000家门店，无论北上广深，还是家乡街道",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110112.png",
                "categoryId": 5,
                "starPrice": 20,
                "deliveryPrice": 5,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110113,
                "businessName": "COCO都可(上海湾新址)",
                "businessAddress": "中国自由贸易试验区浦东南路1138号138室",
                "businessExplain": "上海COCO欢迎您，本店所有奶霜产品都加在饮品汇中，全部饮品纸杯。",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110113.png",
                "categoryId": 5,
                "starPrice": 25,
                "deliveryPrice": 3,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110114,
                "businessName": "吉祥馄饨(上海潍坊店)",
                "businessAddress": "浦东新区潍坊路186号1-2室",
                "businessExplain": "馄饨抄手，营业时间 06:40-23:35",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110114.png",
                "categoryId": 10,
                "starPrice": 15,
                "deliveryPrice": 5,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110115,
                "businessName": "麦当劳&麦咖啡(张杨路店)",
                "businessAddress": "上海市浦东新区张杨路601号一层101部分。",
                "businessExplain": "汉堡薯条/炸鸡炸串，营业时间：05:00-10:15",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110115.png",
                "categoryId": 10,
                "starPrice": 23,
                "deliveryPrice": 10,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110116,
                "businessName": "赛百味.三明治(世纪大道店)",
                "businessAddress": "上海市自由贸易试验区源深路1088",
                "businessExplain": "汉堡薯条/三明治，营业时间：07:30-20:30",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110116.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 5,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110117,
                "businessName": "张亮麻辣烫(浦电路)",
                "businessAddress": "浦东新区潍坊街道浦电路357号地下一层1B-4室",
                "businessExplain": "麻辣烫/关东煮/盖浇饭 ，营业时间：08:30-05:30",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110117.png",
                "categoryId": 10,
                "starPrice": 15,
                "deliveryPrice": 3,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110118,
                "businessName": "林记淮南牛肉汤.特色葱油饼",
                "businessAddress": "上海市自由贸易试验区商城路618号地下一层1-3号",
                "businessExplain": "牛肉汤/滋补炖汤",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110118.png",
                "categoryId": 10,
                "starPrice": 10,
                "deliveryPrice": 3,
                "remarks": null,
                "foodList": null
            }
        ]
    }
}
```
<a name="jL6qG"></a>
### 注意事项
:::info
💡 无
:::
<a name="TEQQY"></a>
## 根据分类ID查询商家
:::tips

- **URL**：`http://47.101.196.82:8988/business/categoryBusiness/{categoryId}`
- **Method**：`get`
- **需要登录**：不需要
- **需要鉴权**：不需要
:::
<a name="Aqemc"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `分类ID{categoryId}` | number | 无 |

<a name="cPQmo"></a>
### 请求示例
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662573389771-6fa05cac-1c7b-4df9-9bec-ad3c0fa2b293.png#averageHue=%23fefefc&clientId=u8e620277-0fd5-4&from=paste&height=461&id=B1T1f&name=image.png&originHeight=576&originWidth=1192&originalType=binary&ratio=1&rotation=0&showTitle=false&size=43082&status=done&style=none&taskId=u446ff80e-8e8b-445c-af7b-171f8a4678d&title=&width=953.6)
<a name="AATM7"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "businessList": [
            {
                "businessId": 110110,
                "businessName": "Bigbear韩国炸鸡（临港点）",
                "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 4,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110111,
                "businessName": "肯德基宅急送(古棕店)",
                "businessAddress": "上海市浦东新区古棕路584号",
                "businessExplain": "肯德基宅急送，专业外送，全程保温，准时送达。",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110111.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 9,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110114,
                "businessName": "吉祥馄饨(上海潍坊店)",
                "businessAddress": "浦东新区潍坊路186号1-2室",
                "businessExplain": "馄饨抄手，营业时间 06:40-23:35",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110114.png",
                "categoryId": 10,
                "starPrice": 15,
                "deliveryPrice": 5,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110115,
                "businessName": "麦当劳&麦咖啡(张杨路店)",
                "businessAddress": "上海市浦东新区张杨路601号一层101部分。",
                "businessExplain": "汉堡薯条/炸鸡炸串，营业时间：05:00-10:15",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110115.png",
                "categoryId": 10,
                "starPrice": 23,
                "deliveryPrice": 10,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110116,
                "businessName": "赛百味.三明治(世纪大道店)",
                "businessAddress": "上海市自由贸易试验区源深路1088",
                "businessExplain": "汉堡薯条/三明治，营业时间：07:30-20:30",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110116.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 5,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110117,
                "businessName": "张亮麻辣烫(浦电路)",
                "businessAddress": "浦东新区潍坊街道浦电路357号地下一层1B-4室",
                "businessExplain": "麻辣烫/关东煮/盖浇饭 ，营业时间：08:30-05:30",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110117.png",
                "categoryId": 10,
                "starPrice": 15,
                "deliveryPrice": 3,
                "remarks": null,
                "foodList": null
            },
            {
                "businessId": 110118,
                "businessName": "林记淮南牛肉汤.特色葱油饼",
                "businessAddress": "上海市自由贸易试验区商城路618号地下一层1-3号",
                "businessExplain": "牛肉汤/滋补炖汤",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110118.png",
                "categoryId": 10,
                "starPrice": 10,
                "deliveryPrice": 3,
                "remarks": null,
                "foodList": null
            }
        ]
    }
}
```


<a name="fgw4I"></a>
## 根据商家ID查询商家对应的食物
:::tips

- **URL**：`http://47.101.196.82:8988/business/searchBusinessFood/{businessId}`
- **Method**：`get`
- **需要登录**：需要
- **需要鉴权**：不需要
:::
<a name="tzaqJ"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| `商户ID{businessId}` | number | 无 |

<a name="bP32Y"></a>
### 请求示例
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662574123023-478fec4f-7463-4b6e-831f-c2b11b737133.png#averageHue=%23fefefd&clientId=u8e620277-0fd5-4&from=paste&height=642&id=u00e0d2c7&name=image.png&originHeight=803&originWidth=1182&originalType=binary&ratio=1&rotation=0&showTitle=false&size=64868&status=done&style=none&taskId=u2b02bccf-7317-4c58-ab9f-ccb6e171211&title=&width=945.6)
<a name="ZbZu3"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "business": {
            "businessId": 110112,
            "businessName": "蜜雪冰城(沪城环路店)",
            "businessAddress": "上海市浦东新区南汇新城镇沪环路699弄169-1号",
            "businessExplain": "1997年从一家冰激凌窗口，到今天的10000家门店，无论北上广深，还是家乡街道",
            "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110112.png",
            "categoryId": 5,
            "starPrice": 20,
            "deliveryPrice": 5,
            "remarks": null,
            "foodList": [
                {
                    "foodId": 20220070206,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "小蓝",
                    "foodPrice": 55.6,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070207,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "摩拜",
                    "foodPrice": 34.559,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070208,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "7号电单车",
                    "foodPrice": 29.742,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070220,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "小蓝",
                    "foodPrice": 59.528,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070228,
                    "foodName": "红烧鲤鱼",
                    "foodDescribe": "摩拜",
                    "foodPrice": 83.563,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070251,
                    "foodName": "红烧鲤鱼",
                    "foodDescribe": "摩拜",
                    "foodPrice": 2.312,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070258,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "ofo",
                    "foodPrice": 92.513,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070264,
                    "foodName": "红烧鲤鱼",
                    "foodDescribe": "7号电单车",
                    "foodPrice": 68.767,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070275,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "悟空",
                    "foodPrice": 35.311,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070279,
                    "foodName": "宫爆鸡丁",
                    "foodDescribe": "7号电单车",
                    "foodPrice": 46.401,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                },
                {
                    "foodId": 20220070300,
                    "foodName": "红烧鲤鱼",
                    "foodDescribe": "悟空",
                    "foodPrice": 10.063,
                    "foodImage": "http://lorempixel.com/300/400/",
                    "businessId": null,
                    "createBy": null,
                    "createTime": null,
                    "updateBy": null,
                    "updateTime": null,
                    "deleteTag": null
                }
            ]
        }
    }
}
```

<a name="WuYes"></a>
# 商家分类
<a name="xOSfT"></a>
## 查询全部分类
> - **URL**：`http://47.101.196.82:8988/elm/category/search`
> - **Method**：`get`
> - **需要登录**：不需要
> - **需要鉴权**：不需要

<a name="PiSVC"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 无 | number | 无 |

<a name="u5Ya5"></a>
### 请求示例
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662575115950-102c6f85-ddf5-4dbb-abdc-25c70f0cc888.png#averageHue=%23fefefd&clientId=u8e620277-0fd5-4&from=paste&height=648&id=u5d04bdc4&name=image.png&originHeight=810&originWidth=1215&originalType=binary&ratio=1&rotation=0&showTitle=false&size=74017&status=done&style=none&taskId=ubc867ffe-cc30-41aa-be1c-b8619ce0a4c&title=&width=972)
<a name="Lxbxd"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "list": [
            {
                "categoryId": 1,
                "categoryName": "炸鸡炸串",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class01.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-13T15:27:37.000+00:00"
            },
            {
                "categoryId": 2,
                "categoryName": "包子粥铺",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class02.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-13T15:28:05.000+00:00"
            },
            {
                "categoryId": 3,
                "categoryName": "米粉面馆",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class03.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:14:45.000+00:00"
            },
            {
                "categoryId": 4,
                "categoryName": "地方小吃",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class04.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:14:59.000+00:00"
            },
            {
                "categoryId": 5,
                "categoryName": "速食简餐",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class05.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:15:15.000+00:00"
            },
            {
                "categoryId": 6,
                "categoryName": "甜品饮品",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class06.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:15:32.000+00:00"
            },
            {
                "categoryId": 7,
                "categoryName": "汉堡披萨",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class07.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:15:45.000+00:00"
            },
            {
                "categoryId": 8,
                "categoryName": "跑腿代购",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class08.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:15:55.000+00:00"
            },
            {
                "categoryId": 9,
                "categoryName": "早餐",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class09.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:16:18.000+00:00"
            },
            {
                "categoryId": 10,
                "categoryName": "美食",
                "categoryCover": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/class10.png",
                "desc": null,
                "delTag": 1,
                "addTime": "2021-12-14T02:16:30.000+00:00"
            }
        ]
    }
}
```

<a name="vQxJ7"></a>
# 用户地址
<a name="X9adK"></a>
## 查询全部单个用户地址
> - **URL**：`http://47.101.196.82:8988/elm/delivery/listById/{userId}`
> - **Method**：`get`
> - **需要登录**：需要
> - **需要鉴权**：不需要

<a name="qpuuU"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 用户ID{userId} | number | 无 |

<a name="U3NnC"></a>
### 请求示例
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662601416893-cc97444b-0fd6-431e-838d-219d3a63afce.png#averageHue=%23fefefd&clientId=uf9cb8b67-5469-4&from=paste&height=562&id=ub56a2d81&name=image.png&originHeight=703&originWidth=1182&originalType=binary&ratio=1&rotation=0&showTitle=false&size=45920&status=done&style=none&taskId=ub7806ac2-c739-425f-9241-c05f487c638&title=&width=945.6)
<a name="Jm6lF"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "deliveryAddressList": [
            {
                "daId": 20211510,
                "contactName": "小风",
                "contactSex": 0,
                "contactTel": "18046873682",
                "address": "江西省赣州市大余县池江镇",
                "userId": 17370709160
            }
        ]
    }
}
```

<a name="EROXz"></a>
## 根据地址ID查询单个地址
> - **URL**：`http://47.101.196.82:8988/elm/delivery/addressNew/{daId}`
> - **Method**：`get`
> - **需要登录**：需要
> - **需要鉴权**：不需要

<a name="xhwKN"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 地址ID{daId} | number | 无 |

<a name="l2HLZ"></a>
### 请求示例
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662601829364-c5dfebec-212d-4f71-bb96-485deeae4e1c.png#averageHue=%23fefefd&clientId=uf9cb8b67-5469-4&from=paste&height=566&id=u376bb889&name=image.png&originHeight=707&originWidth=1168&originalType=binary&ratio=1&rotation=0&showTitle=false&size=47042&status=done&style=none&taskId=ud82927d2-44ef-490f-b3c8-df81751e583&title=&width=934.4)
<a name="NiACM"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "address": {
            "daId": 20211510,
            "contactName": "小风",
            "contactSex": 0,
            "contactTel": "18046873682",
            "address": "江西省赣州市大余县池江镇",
            "userId": 17370709160
        }
    }
}
```

<a name="n5c5v"></a>
## 添加地址
> - **URL**：`http://47.101.196.82:8988/elm/delivery/saveAddress`
> - **Method**：`post`
> - **需要登录**：需要
> - **需要鉴权**：不需要

<a name="IU17J"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 收件人名字{contactName} | String | 无 |
| 收件人性别{contactSex} | number | 无 |
| 收件人电话{contactTel} | String | 无 |
| 收件人地址{address} | String | 无 |
| 用户ID{userId} | number | 无 |

<a name="HYnqU"></a>
### 请求示例
```json
{
    "contactName":"周政伟",
    "contactSex":1,
    "contactTel":"1737070160",
    "address":"江西省赣州市大余县老棚下",
    "userId":1737070160
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662602722377-0a373a51-169a-4ff3-906d-3ab7d8dfbe22.png#averageHue=%23fefefd&clientId=uf9cb8b67-5469-4&from=paste&height=560&id=u31d3353a&name=image.png&originHeight=700&originWidth=1188&originalType=binary&ratio=1&rotation=0&showTitle=false&size=44347&status=done&style=none&taskId=u362060cb-89ab-4e2f-b5dd-8be7d4f9e4e&title=&width=950.4)<br />请求参数
```json
{
    "contactName":"周政伟",
    "contactSex":1,
    "contactTel":"1737070160",
    "userId":1737070160
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662604256466-6f236f94-2557-4c9d-ac67-7fb3349fdeda.png#averageHue=%23fefefc&clientId=u3d66142a-f8de-4&from=paste&height=569&id=u42a54946&name=image.png&originHeight=711&originWidth=1283&originalType=binary&ratio=1&rotation=0&showTitle=false&size=45316&status=done&style=none&taskId=ubabd0485-22a3-4e85-bf13-1b9efcdc83a&title=&width=1026.4)
<a name="AqfK0"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {}
}
```

<a name="QRPFd"></a>
## 更新地址
> - **URL**：`http://47.101.196.82:8988/elm/delivery/updateAddress`
> - **Method**：`post`
> - **需要登录**：需要
> - **需要鉴权**：不需要

<a name="j7Z1H"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 收件人名字{contactName} | String | 无 |
| 收件人性别{contactSex} | number | 无 |
| 收件人电话{contactTel} | String | 无 |
| 收件人地址{address} | String | 无 |
| 用户ID{userId} | number | 无 |

<a name="sBB1r"></a>
### 请求示例
```json
{
    "contactName":"周政伟",
    "contactSex":1,
    "contactTel":"1737070160",
    "address":"江西省赣州市大余县老棚下",
    "userId":1737070160
}
```
![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662602722377-0a373a51-169a-4ff3-906d-3ab7d8dfbe22.png#averageHue=%23fefefd&clientId=uf9cb8b67-5469-4&from=paste&height=560&id=p48zL&name=image.png&originHeight=700&originWidth=1188&originalType=binary&ratio=1&rotation=0&showTitle=false&size=44347&status=done&style=none&taskId=u362060cb-89ab-4e2f-b5dd-8be7d4f9e4e&title=&width=950.4)
:::info
💡参数无空
:::
<a name="II7c8"></a>
### 成功响应
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {}
}
```

<a name="kRX9v"></a>
## 根据地址ID删除地址记录
> - **URL**：`http://47.101.196.82:8988/elm/delivery/removeAddress/{daId}`
> - **Method**：`get`
> - **需要登录**：需要
> - **需要鉴权**：不需要

<a name="HXWml"></a>
### 请求参数
| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 地址ID{daId} | number | 无 |


**请求示例**<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662617109819-1fef4738-0f45-4f08-b822-d626391f21ad.png#averageHue=%23fefefc&clientId=ucb11f138-6e8a-4&from=paste&height=554&id=u2b68ea94&name=image.png&originHeight=692&originWidth=1200&originalType=binary&ratio=1&rotation=0&showTitle=false&size=47518&status=done&style=none&taskId=u434d1436-191e-45bc-8558-a205c41c4c1&title=&width=960)

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {}
}
```

<a name="wqwC3"></a>
# 订单接口
<a name="zMtfE"></a>
## 生成订单
> - **URL**：`http://47.101.196.82:8988/elm/orders/create`
> - **Method**：`post`
> - **需要登录**：需要
> - **需要鉴权**：不需要



**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 用户ID{userId} | number | 无 |
| 商户{businessId} | number |  |
| 订单创建时间{orderDate} | String | 参数为空 |
| 订单结算价格计算总和{orderTotal} | double | 前端的计算属性 |
| 对应地址Id{daId} | number |  |



**请求示例**<br />这个是老师代码中生成订单的方法涉及三个以上的请求参数，直接绑定我的这个接口名就可以，不是json传递

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {}
}
```


**错误响应**
:::tips
**条件**：空参<br />**状态码**：`404`<br />响应示例:
:::
```json
{
    "timestamp": "2022-09-08T01:44:40.672+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "No message available",
    "path": "/elm/delivery/listById/"
}
```


<a name="CpVfy"></a>
## _通过用户ID查询订单信息列表_
> - **URL**：`http://47.101.196.82:8988/elm/orders/information/{userId}`
> - **Method**：`post`
> - **需要登录**：需要
> - **需要鉴权**：不需要



**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| 用户ID{userId} | number | 无 |



**请求示例**<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662627136722-60fb279e-9497-46da-b4ba-21a3ce442068.png#averageHue=%23fefefc&clientId=u81069a79-cabb-4&from=paste&height=473&id=u9f3c9d5e&name=image.png&originHeight=591&originWidth=1213&originalType=binary&ratio=1&rotation=0&showTitle=false&size=43669&status=done&style=none&taskId=u718c7a63-8cec-47e3-a20e-521e0e56964&title=&width=970.4)

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "orders": [
            {
                "orderId": 7,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-02 02:18:56",
                "orderTotal": 95.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027798,
                        "orderId": 7,
                        "foodId": 2021070201,
                        "quantity": 2,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027799,
                        "orderId": 7,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 8,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-02 02:20:12",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027800,
                        "orderId": 8,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027801,
                        "orderId": 8,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 9,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-02 02:21:03",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027802,
                        "orderId": 9,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027803,
                        "orderId": 9,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 10,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-02 02:55:58",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027804,
                        "orderId": 10,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027805,
                        "orderId": 10,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 11,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-02 03:00:04",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027806,
                        "orderId": 11,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027807,
                        "orderId": 11,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 13,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-03 14:59:22",
                "orderTotal": 141,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027812,
                        "orderId": 13,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027813,
                        "orderId": 13,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027814,
                        "orderId": 13,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027815,
                        "orderId": 13,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 14,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-03 16:53:10",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027816,
                        "orderId": 14,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027817,
                        "orderId": 14,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 15,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-04 16:19:22",
                "orderTotal": 118,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027818,
                        "orderId": 15,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027819,
                        "orderId": 15,
                        "foodId": 2021070202,
                        "quantity": 2,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 16,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-04 16:20:38",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027820,
                        "orderId": 16,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027821,
                        "orderId": 16,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 17,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-05 11:28:50",
                "orderTotal": 163.5,
                "daId": 20211510,
                "orderState": 0,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027822,
                        "orderId": 17,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027823,
                        "orderId": 17,
                        "foodId": 2021070202,
                        "quantity": 3,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 18,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-05 20:32:36",
                "orderTotal": 118.5,
                "daId": 20211510,
                "orderState": 0,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027824,
                        "orderId": 18,
                        "foodId": 2021070201,
                        "quantity": 3,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027825,
                        "orderId": 18,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 19,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-05 20:33:07",
                "orderTotal": 300,
                "daId": 20211510,
                "orderState": 1,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027826,
                        "orderId": 19,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027827,
                        "orderId": 19,
                        "foodId": 2021070202,
                        "quantity": 6,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 20,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-05 20:33:47",
                "orderTotal": 164.5,
                "daId": 20211510,
                "orderState": 0,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027828,
                        "orderId": 20,
                        "foodId": 2021070201,
                        "quantity": 5,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027829,
                        "orderId": 20,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            },
            {
                "orderId": 21,
                "userId": 17370709160,
                "businessId": 110110,
                "orderDate": "2022-09-05 20:34:25",
                "orderTotal": 72.5,
                "daId": 20211510,
                "orderState": 0,
                "business": {
                    "businessId": 110110,
                    "businessName": "Bigbear韩国炸鸡（临港点）",
                    "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                    "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                    "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                    "categoryId": 10,
                    "starPrice": 20,
                    "deliveryPrice": 4,
                    "remarks": null,
                    "foodList": null
                },
                "message": {
                    "orderId": null,
                    "userId": null,
                    "status": null,
                    "mid": null
                },
                "odList": [
                    {
                        "odId": 1413357253918027830,
                        "orderId": 21,
                        "foodId": 2021070201,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070201,
                            "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                            "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                            "foodPrice": 23,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    },
                    {
                        "odId": 1413357253918027831,
                        "orderId": 21,
                        "foodId": 2021070202,
                        "quantity": 1,
                        "food": {
                            "foodId": 2021070202,
                            "foodName": "人气大鸡腿套餐",
                            "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                            "foodPrice": 45.5,
                            "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                            "businessId": 110110,
                            "createBy": null,
                            "createTime": "2022-09-07T17:11:23.000+00:00",
                            "updateBy": null,
                            "updateTime": "2022-09-07T17:11:23.000+00:00",
                            "deleteTag": 1
                        }
                    }
                ]
            }
        ]
    }
}
```

<br />
<a name="OgXEV"></a>
## _通过订单ID查询单个订单信息_
:::success

- **URL**：`http://47.101.196.82:8988/elm/orders/pageNew/{orderId}`
- **Method**：`post`
- **需要登录**：需要
- **需要鉴权**：不需要
:::

**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| _订单_ID{orderId} | number | 无 |


**请求示例**<br />无

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "order": {
            "orderId": 8,
            "userId": 17370709160,
            "businessId": 110110,
            "orderDate": "2022-09-02 02:20:12",
            "orderTotal": 72.5,
            "daId": 20211510,
            "orderState": 1,
            "business": {
                "businessId": 110110,
                "businessName": "Bigbear韩国炸鸡（临港点）",
                "businessAddress": "浦东新区南汇新城镇古棕路438弄9号2室。",
                "businessExplain": "Bigbear韩式炸鸡是韩如餐饮有限公司多年经营的炸鸡品牌。目前分布全国各省。",
                "businessImg": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/110110.png",
                "categoryId": 10,
                "starPrice": 20,
                "deliveryPrice": 4,
                "remarks": null,
                "foodList": null
            },
            "message": {
                "orderId": null,
                "userId": null,
                "status": null,
                "mid": null
            },
            "odList": [
                {
                    "odId": 1413357253918027800,
                    "orderId": 8,
                    "foodId": 2021070201,
                    "quantity": 1,
                    "food": {
                        "foodId": 2021070201,
                        "foodName": "(特惠双拼)10无骨肉6年糕6地瓜",
                        "foodDescribe": "10块无骨肉6个年糕6个地瓜，口味甜辣、酸甜、蒜香。",
                        "foodPrice": 23,
                        "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070201.png",
                        "businessId": 110110,
                        "createBy": null,
                        "createTime": "2022-09-07T17:11:23.000+00:00",
                        "updateBy": null,
                        "updateTime": "2022-09-07T17:11:23.000+00:00",
                        "deleteTag": 1
                    }
                },
                {
                    "odId": 1413357253918027801,
                    "orderId": 8,
                    "foodId": 2021070202,
                    "quantity": 1,
                    "food": {
                        "foodId": 2021070202,
                        "foodName": "人气大鸡腿套餐",
                        "foodDescribe": "包含3个大鸡腿，3个翅根，2个翅中，赠送饮料1份~需分两种口",
                        "foodPrice": 45.5,
                        "foodImage": "https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/2021070202.png",
                        "businessId": 110110,
                        "createBy": null,
                        "createTime": "2022-09-07T17:11:23.000+00:00",
                        "updateBy": null,
                        "updateTime": "2022-09-07T17:11:23.000+00:00",
                        "deleteTag": 1
                    }
                }
            ]
        }
    }
}
```

<a name="E3Nzv"></a>
## _通过修改单个订单状态_
:::success

- **URL**：`http://47.101.196.82:8988/elm/orders/updateStatus`
- **Method**：`post`
- **需要登录**：需要
- **需要鉴权**：不需要
:::


**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| _订单_ID{orderId} | number | 无 |
| 订单状态{orderState} | number | 无 |



**请求示例**
```json
{
  	"orderId": 15,
		"orderState": 0
}
```


**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "count": 1	//数据库中影响行数
    }
}
```

<a name="g0N6n"></a>
## _通过订单ID删除订单_
:::success

- **URL**：`http://47.101.196.82:8988/elm/orders/deleteOrderById/{orderId}`
- **Method**：`get`
- **需要登录**：需要
- **需要鉴权**：不需要
:::


**请求参数**

| 参数 | 类型 | 约束 |
| --- | --- | --- |
| _订单_ID{orderId} | number | 无 |


**请求示例**<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/26317547/1662880624572-f499b14e-5e8f-4558-b21a-ce796031ddaa.png#averageHue=%23f7f0e2&clientId=u66017bc9-4a7d-4&from=paste&height=517&id=uf4bbb202&name=image.png&originHeight=646&originWidth=1162&originalType=binary&ratio=1&rotation=0&showTitle=false&size=41616&status=done&style=none&taskId=u49759594-e810-44ef-b9f3-770927c602e&title=&width=929.6)

**成功响应**
:::tips
**条件**：请求参数合法，并且用户身份校验通过。<br />**状态码：**`200 OK`<br />**响应示例**：
:::
```json
{
    "success": true,
    "code": 1,
    "message": "请求成功",
    "map": {
        "bool": true
    }
}
```
