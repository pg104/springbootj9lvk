import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import bianji from '@/views/modules/bianji/list'
    import discussgaojianxinxi from '@/views/modules/discussgaojianxinxi/list'
    import gaojianxinxi from '@/views/modules/gaojianxinxi/list'
    import leibie from '@/views/modules/leibie/list'
    import zhuanjia from '@/views/modules/zhuanjia/list'
    import zuozhe from '@/views/modules/zuozhe/list'
    import messages from '@/views/modules/messages/list'
    import gerengaojian from '@/views/modules/gerengaojian/list'
    import fenpeixinxi from '@/views/modules/fenpeixinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/bianji',
        name: '编辑',
        component: bianji
      }
      ,{
	path: '/discussgaojianxinxi',
        name: '稿件信息评论',
        component: discussgaojianxinxi
      }
      ,{
	path: '/gaojianxinxi',
        name: '稿件信息',
        component: gaojianxinxi
      }
      ,{
	path: '/leibie',
        name: '类别',
        component: leibie
      }
      ,{
	path: '/zhuanjia',
        name: '专家',
        component: zhuanjia
      }
      ,{
	path: '/zuozhe',
        name: '作者',
        component: zuozhe
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/gerengaojian',
        name: '个人稿件',
        component: gerengaojian
      }
      ,{
	path: '/fenpeixinxi',
        name: '分配信息',
        component: fenpeixinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
