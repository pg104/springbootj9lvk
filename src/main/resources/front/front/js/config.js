var projectName = '在线投稿系统';
/**
 * 轮播图配置
 */
var swiper = {
    // 设定轮播容器宽度，支持像素和百分比
    width: '100%',
    height: '400px',
    // hover（悬停显示）
    // always（始终显示）
    // none（始终不显示）
    arrow: 'none',
    // default（左右切换）
    // updown（上下切换）
    // fade（渐隐渐显切换）
    anim: 'default',
    // 自动切换的时间间隔
    // 默认3000
    interval: 2000,
    // 指示器位置
    // inside（容器内部）
    // outside（容器外部）
    // none（不显示）
    indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
    name: '个人中心',
    url: '../' + localStorage.getItem('userTable') + '/center.html'
},
    {
        name: '我的收藏',
        url: '../storeup/list.html'
    }
]


var indexNav = [

    {
        name: '稿件信息',
        url: './pages/gaojianxinxi/list.html'
    },

    {
        name: '公告信息',
        url: './pages/news/list.html'
    },
    {
        name: '留言板',
        url: './pages/messages/list.html'
    }
]

var adminurl = "http://localhost:8080/springbootj9lvk/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


var menu = [
    {
        "backMenu":
            [
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-link",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "作者", "menuJump": "列表", "tableName": "zuozhe"
                            }
                        ],
                    "menu": "作者管理"
                },
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-form",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "专家", "menuJump": "列表", "tableName": "zhuanjia"
                            }],
                    "menu": "专家管理"
                },
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-qrcode",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "编辑", "menuJump": "列表",
                                "tableName": "bianji"
                            }],
                    "menu": "编辑管理"
                },
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-copy",
                                "buttons": ["查看", "删除"],
                                "menu": "个人稿件",
                                "menuJump": "列表",
                                "tableName": "gerengaojian"
                            }
                        ],
                    "menu": "个人稿件管理"
                },
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-paint",
                                "buttons": ["删除", "查看"],
                                "menu": "分配信息",
                                "menuJump": "列表",
                                "tableName": "fenpeixinxi"
                            }
                        ],
                    "menu": "分配信息管理"
                },
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-brand",
                                "buttons": ["删除", "查看"],
                                "menu": "稿件信息",
                                "menuJump": "列表",
                                "tableName": "gaojianxinxi"
                            }
                        ],
                    "menu": "稿件信息管理"
                },
                {
                    "child":
                        [
                            {
                                "appFrontIcon": "cuIcon-pic",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "类别",
                                "menuJump": "列表",
                                "tableName": "leibie"
                            }
                        ],
                    "menu": "类别管理"
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
        "hasFrontRegister": "否",
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
        "hasFrontRegister": "否",
        "roleName": "编辑",
        "tableName": "bianji"
    }]


var isAuth = function (tableName, key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for (let i = 0; i < menus.length; i++) {
        if (menus[i].tableName == role) {
            for (let j = 0; j < menus[i].backMenu.length; j++) {
                for (let k = 0; k < menus[i].backMenu[j].child.length; k++) {
                    if (tableName == menus[i].backMenu[j].child[k].tableName) {
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName, key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for (let i = 0; i < menus.length; i++) {
        if (menus[i].tableName == role) {
            for (let j = 0; j < menus[i].frontMenu.length; j++) {
                for (let k = 0; k < menus[i].frontMenu[j].child.length; k++) {
                    if (tableName == menus[i].frontMenu[j].child[k].tableName) {
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
