const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-link",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "作者",
                    "menuJump": "列表",
                    "tableName": "zuozhe"
                }], "menu": "作者管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-form",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "专家",
                    "menuJump": "列表",
                    "tableName": "zhuanjia"
                }], "menu": "专家管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-qrcode",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "编辑",
                    "menuJump": "列表",
                    "tableName": "bianji"
                }], "menu": "编辑管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-copy",
                    "buttons": ["查看", "删除"],
                    "menu": "个人稿件",
                    "menuJump": "列表",
                    "tableName": "gerengaojian"
                }], "menu": "个人稿件管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["删除", "查看"],
                    "menu": "分配信息",
                    "menuJump": "列表",
                    "tableName": "fenpeixinxi"
                }], "menu": "分配信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-brand",
                    "buttons": ["删除", "查看"],
                    "menu": "稿件信息",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-pic",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "类别",
                    "menuJump": "列表",
                    "tableName": "leibie"
                }], "menu": "类别管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "回复", "删除"],
                    "menu": "留言板管理",
                    "tableName": "messages"
                }], "menu": "留言板管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-copy",
                    "buttons": ["查看", "修改"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }, {
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "公告信息",
                    "tableName": "news"
                }], "menu": "系统管理"
            }],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-send",
                    "buttons": ["查看", "查看评论"],
                    "menu": "稿件信息列表",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-copy",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "个人稿件",
                    "menuJump": "列表",
                    "tableName": "gerengaojian"
                }], "menu": "个人稿件管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看"],
                    "menu": "分配信息",
                    "menuJump": "列表",
                    "tableName": "fenpeixinxi"
                }], "menu": "分配信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-brand",
                    "buttons": ["查看", "修改", "删除", "查看评论"],
                    "menu": "稿件信息",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-favor",
                    "buttons": ["查看", "删除"],
                    "menu": "我的收藏管理",
                    "tableName": "storeup"
                }], "menu": "我的收藏管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "留言板管理",
                    "tableName": "messages"
                }], "menu": "留言板管理"
            }],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-send",
                    "buttons": ["查看", "查看评论"],
                    "menu": "稿件信息列表",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "作者",
            "tableName": "zuozhe"
        }, {
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "发表"],
                    "menu": "分配信息",
                    "menuJump": "列表",
                    "tableName": "fenpeixinxi"
                }], "menu": "分配信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-brand",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "稿件信息",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "留言板管理",
                    "tableName": "messages"
                }], "menu": "留言板管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-favor",
                    "buttons": ["查看", "删除"],
                    "menu": "我的收藏管理",
                    "tableName": "storeup"
                }], "menu": "我的收藏管理"
            }],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-send",
                    "buttons": ["查看", "查看评论"],
                    "menu": "稿件信息列表",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "专家",
            "tableName": "zhuanjia"
        }, {
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-copy",
                    "buttons": ["查看", "分配", "审核"],
                    "menu": "个人稿件",
                    "menuJump": "列表",
                    "tableName": "gerengaojian"
                }], "menu": "个人稿件管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "分配信息",
                    "menuJump": "列表",
                    "tableName": "fenpeixinxi"
                }], "menu": "分配信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-brand",
                    "buttons": ["查看", "审核"],
                    "menu": "稿件信息",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-favor",
                    "buttons": ["查看", "删除"],
                    "menu": "我的收藏管理",
                    "tableName": "storeup"
                }], "menu": "我的收藏管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "留言板管理",
                    "tableName": "messages"
                }], "menu": "留言板管理"
            }],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-send",
                    "buttons": ["查看", "查看评论"],
                    "menu": "稿件信息列表",
                    "menuJump": "列表",
                    "tableName": "gaojianxinxi"
                }], "menu": "稿件信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "编辑",
            "tableName": "bianji"
        }]
    }
}
export default menu;
